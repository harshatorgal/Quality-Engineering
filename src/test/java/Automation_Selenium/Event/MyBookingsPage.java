package Automation_Selenium.Event;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyBookingsPage {

    WebDriver driver;

    @FindBy(xpath = "//button[text()='View Details']")
    List<WebElement> viewDetailsButton;

    @FindBy(id = "check-refund-btn")
    WebElement refundStatus;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement cancelButton;

    @FindBy(xpath = "//button[text()='Yes, cancel it']")
    WebElement yesCancelButton;

    @FindBy(className = "w-5 h-5")
    WebElement xMarkButton;

    @FindBy(xpath = "//button[text()='← Back to My Bookings']")
    WebElement backButton;

    @FindBy(xpath = "//button[text()='Cancel Booking']")
    WebElement cancelBookingButton;

    public MyBookingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setMyBookings() {
        viewDetailsButton.get(0).click();
        refundStatus.click();
        backButton.click();

        viewDetailsButton.get(1).click();
        refundStatus.click();
        backButton.click();

        viewDetailsButton.get(3).click();
        refundStatus.click();
        backButton.click();

        viewDetailsButton.get(3).click();
        cancelBookingButton.click();
        cancelButton.click();

        cancelBookingButton.click();
        xMarkButton.click();

        cancelBookingButton.click();
        yesCancelButton.click();

    }

}
