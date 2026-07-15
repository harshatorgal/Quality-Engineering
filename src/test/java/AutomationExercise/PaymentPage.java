package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;

    By cardName = By.name("name_on_card");
    By cardNumber = By.name("card_number");
    By cvc = By.name("cvc");
    By expiryMonth = By.name("expiry_month");
    By expiryYear = By.name("expiry_year");
    By submit = By.id("submit");

    PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPaymentPage(String name, String number, String cvv, String eMonth, String eYear) {
        driver.findElement(cardName).sendKeys(name);
        driver.findElement(cardNumber).sendKeys(number);
        driver.findElement(cvc).sendKeys(cvv);
        driver.findElement(expiryMonth).sendKeys(eMonth);
        driver.findElement(expiryYear).sendKeys(eYear);
        driver.findElement(submit).click();

    }


}
