package Shoping_Without_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopCart {
    WebDriver driver;
    By checkItem = By.className("inventory_item_name");
    By button = By.id("checkout");

    ShopCart(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextName() {
        return driver.findElement(checkItem).getText();
    }

    public void setButton() {
        driver.findElement(button).click();
    }

}
