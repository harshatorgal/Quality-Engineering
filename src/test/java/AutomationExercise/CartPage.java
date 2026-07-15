package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    By proceedButton = By.linkText("Proceed To Checkout");
    By firstPrice = By.xpath("(//p[@class='cart_total_price'])[1]");
    By secondPrice = By.xpath("(//p[@class='cart_total_price'])[2]");

    CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstPrice() {
        return driver.findElements(firstPrice).getFirst().getText();
    }

    public String getSecondPrice() {
        return driver.findElements(secondPrice).getFirst().getText();
    }


    public void setCartPage() {
        driver.findElement(proceedButton).click();
    }


}
