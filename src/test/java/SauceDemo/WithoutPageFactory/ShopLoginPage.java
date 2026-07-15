package SauceDemo.WithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopLoginPage {
    WebDriver driver;
    //locators
    By UN = By.id("user-name");
    By PWD = By.id("password");
    By loginButton = By.id("login-button");

    //constructor
    ShopLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //actions
    public void setShopLogin(String user, String pwd) {
        driver.findElement(UN).sendKeys(user);
        driver.findElement(PWD).sendKeys(pwd);
        driver.findElement(loginButton).click();
    }


}
