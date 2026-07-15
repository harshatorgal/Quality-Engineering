package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By brands = By.cssSelector("a[href='/brand_products/H&M']");
    By addToCartButton = By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]");
    By cartPage = By.cssSelector("a[href='/view_cart']");
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
