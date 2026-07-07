package Shoping_Without_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPayment {
    WebDriver driver;
    By productPrice = By.className("inventory_item_price");
    By itemTotal = By.className("summary_subtotal_label");
    By tax = By.className("summary_tax_label");
    By total = By.className("summary_total_label");
    By button = By.id("finish");

    ShopPayment(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();

    }

    public double getItemTotal() {
        String itemTotal$ = driver.findElement(itemTotal).getText();
        return Double.parseDouble(itemTotal$.replace("Item total: $", ""));
    }

    public double getTax() {
        String tax$ = driver.findElement(tax).getText();
        return Double.parseDouble(tax$.replace("Tax: $", ""));
    }

    public double getTotal() {
        String totalPrice = driver.findElement(total).getText();
        return Double.parseDouble(totalPrice.replace("Total: $", ""));
    }

    public void setFinish() {
        driver.findElement(button).click();
    }


}
