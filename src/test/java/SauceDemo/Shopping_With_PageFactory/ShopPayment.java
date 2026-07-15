package SauceDemo.Shopping_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPayment {
    WebDriver driver;

    @FindBy(className = "inventory_item_price")
    WebElement productPrice;
    @FindBy(className = "summary_subtotal_label")
    WebElement itemTotal;
    @FindBy(className = "summary_tax_label")
    WebElement tax;
    @FindBy(className = "summary_total_label")
    WebElement total;
    @FindBy(id = "finish")
    WebElement button;

    ShopPayment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getProductPrice() {
        return productPrice.getText();

    }

    public double getItemTotal() {
        String itemTotal$ = itemTotal.getText();
        return Double.parseDouble(itemTotal$.replace("Item total: $", ""));
    }

    public double getTax() {
        String tax$ = tax.getText();
        return Double.parseDouble(tax$.replace("Tax: $", ""));
    }

    public double getTotal() {
        String totalPrice = total.getText();
        return Double.parseDouble(totalPrice.replace("Total: $", ""));
    }

    public void setFinish() {
        button.click();
    }
}
