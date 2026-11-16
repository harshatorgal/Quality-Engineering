package Automation_Selenium.Event;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EventPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='/events/285']")
    WebElement bookNow1;

    @FindBy(xpath = "//a[@href='/events/284']")
    WebElement booknow2;

    @FindBy(xpath = "//a[@href='/events/283']")
    WebElement bookNow3;

    @FindBy(xpath = "//button[text()='+']")
    WebElement plus;
    //text() is used when everything is same but visible text is different

    @FindBy(xpath = "//button[text()='-']")
    WebElement minus;

    @FindBy(id = "customerName")
    WebElement name;

    @FindBy(id = "customer-email")
    WebElement email;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "confirm-booking")
    WebElement confirmButton;

    @FindBy(className = "booking-ref font-mono font-bold text-indigo-600")
    WebElement refName;

    @FindBy(xpath = "//button[text()='View My Bookings']")
    WebElement viewMyBookingsButton;

    @FindBy(id = "nav-events")
    WebElement eventsButton;

    @FindBy(xpath = "//select[options[text()='All Categories']]")
    WebElement categoriesDropDown;
    //select(tagname) options(tagname) text()<- visible text

    @FindBy(xpath = "//select[options[text()='All Cities']]")
    WebElement citiesDropDown;

    @FindBy(xpath = "//button[text()='Clear filters']")
    WebElement filterButton;

    @FindBy(xpath = "//button[text()='Add New Event']")
    WebElement addNewEvent;

    @FindBy(tagName = "body")
    WebElement body;


    public EventPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void setEvent() {
        Select categoryDropDown = new Select(categoriesDropDown);
        //create select class

        List<WebElement> categoryOptions = categoryDropDown.getOptions();
        //get all DD options
        //getOptions() retrieves all available options from the dropdown

        for (int i = 0; i < categoryOptions.size(); i++) {
            categoryDropDown.selectByIndex(i);
            System.out.println(categoryOptions.get(i).getText());
            //get(i) Retrieves the WebElement at the specified index
            //getText() Retrieves the visible text of that WebElement
        }

        //----------------------

        Select cityDropDown = new Select(citiesDropDown);
        List<WebElement> cityOptions = cityDropDown.getOptions();
        for (int i = 0; i < cityOptions.size(); i++) {
            cityDropDown.selectByIndex(i);
            System.out.println(cityOptions.get(i).getText());
        }

        //----------------------

        filterButton.click();

        addNewEvent.click();

        eventsButton.click();

        body.sendKeys(Keys.PAGE_UP);
        body.sendKeys(Keys.PAGE_UP);
        body.sendKeys(Keys.PAGE_UP);


    }

    public void setEvents2(String fullName2, String email_id2, String ph2) {


        booknow2.click();
        for (int i = 1; i <= 10; i++) {
            plus.click();
        }

        for (int i = 10; i >= 5; i--) {
            minus.click();
        }

        name.sendKeys(fullName2);
        email.sendKeys(email_id2);
        confirmButton.click();
        phone.sendKeys(ph2);
        confirmButton.click();

    }

    public String getBookingDetails2() {
        return refName.getText();

    }

    public void setEvents1(String fullName1, String email_id1, String ph1) {
        eventsButton.click();

        bookNow1.click();
        plus.click();
        plus.click();
        minus.click();

        name.sendKeys(fullName1);
        email.sendKeys(email_id1);
        confirmButton.click();
        phone.sendKeys(ph1);
        confirmButton.click();

    }

    public String getBookingDetails1() {
        return refName.getText();

    }

    public void setEvents3(String fullName3, String email_id3, String ph3) {
        eventsButton.click();

        bookNow1.click();
        plus.click();
        plus.click();
        minus.click();

        name.sendKeys(fullName3);
        email.sendKeys(email_id3);
        confirmButton.click();
        phone.sendKeys(ph3);
        confirmButton.click();

    }

    public String getBookingDetails3() {
        return refName.getText();

    }

}
