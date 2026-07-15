package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
    By totalPriceRS = By.xpath("//tr[last()]//p[@class='cart_total_price']");
    By comments = By.className("form-control");
    By button = By.linkText("href=\"/payment\"");

    CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public double getTotalPrice() {
        String totalPrice = driver.findElement(totalPriceRS).getText();
        return Double.parseDouble(totalPrice.replace("Rs. ", ""));
    }

    public void setCheckoutPage(String com) {
        driver.findElement(comments).sendKeys(com);
        driver.findElement(button).click();
    }
}
