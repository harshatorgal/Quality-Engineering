package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    By proceedButton = By.className("btn");

    CartPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setCartPage() {
        driver.findElement(proceedButton).click();
    }

}
