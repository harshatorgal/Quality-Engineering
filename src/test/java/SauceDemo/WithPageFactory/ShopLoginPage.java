package SauceDemo.WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopLoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement UN;
    @FindBy(id = "password")
    WebElement PWD;
    @FindBy(id = "login-button")
    WebElement loginButton;

    ShopLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setShopLogin(String user, String pwd) {
        UN.sendKeys(user);
        PWD.sendKeys(pwd);
        loginButton.click();

    }
}
