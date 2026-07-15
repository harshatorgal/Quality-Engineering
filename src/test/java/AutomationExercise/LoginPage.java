package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By logEmail = By.xpath("//input[@data-qa='login-email']");
    By logPWD = By.name("password");
    By logButton = By.xpath("//button[@data-qa='login-button']");
    By error = By.xpath("//p[text()='Your email or password is incorrect!']");
    By scroll = By.tagName("body");

    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLogin(String email, String password) {
        driver.findElement(logEmail).sendKeys(email);
        driver.findElement(logPWD).sendKeys(password);
        driver.findElement(scroll).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(logButton).click();

    }

    public String getErrorMessage() {
        return driver.findElement(error).getText();
    }
}
