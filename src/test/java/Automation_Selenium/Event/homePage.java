package Automation_Selenium.Event;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    WebDriver driver;

    @FindBy(tagName = "body")
    WebElement body;

    @FindBy(className = "inline-flex items-center justify-center px-6 py-2.5 text-base font-semibold rounded-lg bg-white text-indigo-700 hover:bg-indigo-50 transition-colors w-full sm:w-auto")
    WebElement browseButton;

    @FindBy(xpath = "//button[@type='button']")
    WebElement myBookingsButton;

    @FindBy(xpath = "//a[@href='/events/285']")
    WebElement bookNow1;

    @FindBy(xpath = "//a[@href='/events/284']")
    WebElement booknow2;

    @FindBy(xpath = "//a[@href='/events/283']")
    WebElement bookNow3;

    @FindBy(id = "nav-home")
    WebElement homeButton;


    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setHomePage() {

        body.sendKeys(Keys.PAGE_UP);
        body.sendKeys(Keys.PAGE_UP);
        body.sendKeys(Keys.PAGE_UP);
        body.sendKeys(Keys.PAGE_DOWN);

        bookNow1.click();
        homeButton.click();

        booknow2.click();
        homeButton.click();

        bookNow3.click();
        homeButton.click();
    }


}
