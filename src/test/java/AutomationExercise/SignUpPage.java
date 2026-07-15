package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    WebDriver driver;
    By signName = By.cssSelector("[data-qa='signup-name']");
    By signEmail = By.cssSelector("[data-qa='signup-email']");
    By signButton = By.className("btn");

    SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSignUpPage(String name, String email){
        driver.findElement(signName).sendKeys(name);
        driver.findElement(signEmail).sendKeys(email);
        driver.findElement(signButton).click();
    }
}
