package SauceDemo.WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCheckoutPage {
    WebDriver driver;

    @FindBy(name = "firstName")
    WebElement FN;
    @FindBy(name = "lastName")
    WebElement LN;
    @FindBy(name = "postalCode")
    WebElement Zipcode;
    @FindBy(id = "continue")
    WebElement button;

    ShopCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCheckout(String fname, String lname, String zipcode) {
        FN.sendKeys(fname);
        LN.sendKeys(lname);
        Zipcode.sendKeys(zipcode);
        button.click();


    }
}
