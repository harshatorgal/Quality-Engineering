package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By logEmail = By.cssSelector("[data-qa='login-email']");
    By logPWD = By.name("password");
    By logButton = By.className("btn");

    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLogin(String email, String password) {
        driver.findElement(logEmail).sendKeys(email);
        driver.findElement(logPWD).sendKeys(password);
        driver.findElement(logButton).click();
    }
}
