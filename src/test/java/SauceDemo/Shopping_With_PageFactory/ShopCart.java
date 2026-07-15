package SauceDemo.Shopping_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCart {
    WebDriver driver;

    @FindBy(className = "inventory_item_name")
    WebElement checkItem;
    @FindBy(id = "checkout")
    WebElement button;

    ShopCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextName() {

        return checkItem.getText();
    }

    public void setButton() {
        button.click();
    }


}
