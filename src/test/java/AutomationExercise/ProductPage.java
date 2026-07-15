package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By brands = By.linkText("[href=\"/brand_products/H&M\"]");
    By addToCartButton = By.linkText("[href=\"javascript:void();\"]");
    By cartPage = By.linkText("[href=\"/view_cart\"]");
    By itemPrice = By.cssSelector(".productinfo h2");

    ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setProductPage1() {
        driver.findElement(brands).click();
    }

    public String getItemPrice() {
        return driver.findElement(itemPrice).getText();
    }

    public void setProductPage2() {
        driver.findElement(addToCartButton).click();
        driver.findElement(cartPage).click();

    }
}
