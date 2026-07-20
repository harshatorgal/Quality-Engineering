package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement uName;
    @FindBy(name = "password")
    WebElement PWD;
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;
    @FindBy(linkText = "Log Out")
    WebElement logOutButton;

    Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setLogin(String username, String pwd) {

        uName.clear();
        PWD.clear();
        
        uName.sendKeys(username);
        PWD.sendKeys(pwd);
        loginButton.click();
    }

    public void setLogout() {
        logOutButton.click();
    }

}

