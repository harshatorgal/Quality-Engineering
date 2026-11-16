package Automation_Selenium.Event;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AdminPage {
    WebDriver driver;

    @FindBy(xpath = "//button[text()='Admin']")
    WebElement admin;

    /*@FindBy(xpath = "//a[@href='/admin/events']")
    WebElement manageEvents;

    @FindBy(xpath = "//a[@href='/admin/bookings']")
    WebElement manageBookings;*/

    @FindBy(id = "event-title-input")
    WebElement title;

    @FindBy(xpath = "//textarea[@placeholder='Describe the event…']")
    WebElement description;

    @FindBy(id = "category")
    WebElement category;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "venue")
    WebElement venue;

    @FindBy(id = "event-date-&-time")
    WebElement dateAndTime;

    @FindBy(id = "price-($)")
    WebElement price;

    @FindBy(id = "total-seats")
    WebElement totalSeats;

    @FindBy(id = "image-url-(optional)")
    WebElement image;

    @FindBy(id = "add-event-btn")
    WebElement addEventButton;

    @FindBy(xpath = "//button[text()='Delete']")
    WebElement delete;

    @FindBy(id = "confirm-dialog-yes")
    WebElement yesDeleteButton;

    @FindBy(xpath = "//button[text()='View']")
    List<WebElement> view;

    @FindBy(className = "w-5 h-5")
    WebElement xMark;

    @FindBy(xpath = "//select[options[text()='All Statuses']]")
    WebElement status;

    @FindBy(xpath = "//button[text()='Cancel']")
    List<WebElement> cancelButton;

    @FindBy(xpath = "//button[text()='Yes, cancel it']")
    WebElement yesCancelButton;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAdmin(String tit, String des, String cat, String cit, String ven, String dateTime, String amt, String seats, String img) {

        Select selectManageEvents = new Select(admin);
        selectManageEvents.selectByIndex(0);

        title.sendKeys(tit);
        description.sendKeys(des);
        category.sendKeys(cat);
        city.sendKeys(cit);
        venue.sendKeys(ven);
        dateAndTime.sendKeys(dateTime);
        price.sendKeys(amt);
        totalSeats.sendKeys(seats);
        image.sendKeys(img);
        addEventButton.click();

        Select selectManageBookings = new Select(admin);
        selectManageBookings.selectByIndex(1);

        for (int i = 0; i <= view.size(); i++) {
            view.get(i).click();
            xMark.click();
        }

        Select statusdropdown = new Select(status);
        List<WebElement> options = statusdropdown.getOptions();
        for (int i = 0; i < options.size(); i++) {
            statusdropdown.selectByIndex(i);
        }

        cancelButton.get(0).click();
        yesCancelButton.click();
    }

    public void setDelete() {
        Select selectManageEvents = new Select(admin);
        selectManageEvents.selectByIndex(0);
        delete.click();
        yesDeleteButton.click();

    }
}