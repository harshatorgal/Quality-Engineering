package SauceDemo.WithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCheckoutPage {
    WebDriver driver;

    By FN = By.name("firstName");
    By LN = By.name("lastName");
    By Zipcode = By.name("postalCode");
    By button = By.id("continue");

    ShopCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCheckout(String fname, String lname, String zipcode) {
        driver.findElement(FN).sendKeys(fname);
        driver.findElement(LN).sendKeys(lname);
        driver.findElement(Zipcode).sendKeys(zipcode);
        driver.findElement(button).click();


    }
}
