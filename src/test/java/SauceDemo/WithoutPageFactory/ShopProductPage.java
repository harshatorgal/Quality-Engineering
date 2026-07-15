package SauceDemo.WithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopProductPage {
    WebDriver driver;
    By filter = By.className("product_sort_container");
    By addCart = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By price = By.className("inventory_item_price");
    By cartPage = By.className("shopping_cart_link");


    ShopProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setShopProduct(String filterOption) {
        WebElement dropdown = driver.findElement(filter);
        Select select = new Select(dropdown);
        select.selectByVisibleText(filterOption);

        driver.findElement(addCart).click();

    }

    public String getProductPrice() {
        return driver.findElement(price).getText();
    }

    public void setShopProductClick() {
        driver.findElement(cartPage).click();
    }

}
