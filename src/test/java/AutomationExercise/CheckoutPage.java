package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
    By totalPriceRS = By.xpath("//tr[last()]//p[@class='cart_total_price']");
    By comments = By.className("form-control");
    By button = By.cssSelector("a[href='/payment']");

    By deliveryAddress = By.id("address_delivery");
    By billingAddress = By.id("address_invoice");

    CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public double getTotalPrice() {
        String totalPrice = driver.findElement(totalPriceRS).getText();
        return Double.parseDouble(totalPrice.replace("Rs. ", ""));
    }

    public String getDAddress() {
        return driver.findElement(deliveryAddress).getText();
    }

    public String getBAddress() {
        return driver.findElement(billingAddress).getText();
    }

    public void setCheckoutPage(String Comments) {
        driver.findElement(comments).sendKeys(Comments);
        driver.findElement(button).click();

    }
}
