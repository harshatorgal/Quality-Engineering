package Shoping_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopProduct {
    WebDriver driver;

    @FindBy(className = "product_sort_container")
    WebElement filter;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addCart;
    @FindBy(className = "inventory_item_price")
    WebElement price;
    @FindBy(className = "shopping_cart_link")
    WebElement cartPage;

    ShopProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setShopProduct(String filterOption) {
        WebElement dropdown = filter;
        Select select = new Select(dropdown);
        select.selectByVisibleText(filterOption);

        addCart.click();

    }

    public String getProductPrice() {
        return price.getText();
    }

    public void setShopProductClick() {
        cartPage.click();
    }

}
