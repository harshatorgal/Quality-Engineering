package SauceDemo.WithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCartPage {
    WebDriver driver;
    By checkItem = By.className("inventory_item_name");
    By button = By.id("checkout");

    ShopCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextName() {
        return driver.findElement(checkItem).getText();
    }

    public void setButton() {
        driver.findElement(button).click();
    }

}
