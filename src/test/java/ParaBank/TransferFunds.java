package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferFunds {
    WebDriver driver;
    @FindBy(linkText = "Transfer Funds")
    WebElement transferFundLink;
    @FindBy(id = "amount")
    WebElement amt;
    @FindBy(id = "fromAccountId")
    WebElement fromAccount;
    @FindBy(id = "toAccountId")
    WebElement toAccount;
    @FindBy(className = "button")
    WebElement button;
    @FindBy(className = "title")
    WebElement successMessage;

    TransferFunds(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTransferFunds(String amount, int fromAcc, int toAcc) {
        transferFundLink.click();
        amt.sendKeys(amount);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(driver ->
                new Select(fromAccount).getOptions().size() > 0);

        wait.until(driver ->
                new Select(toAccount).getOptions().size() > 0);

        Select from = new Select(fromAccount);
        from.selectByIndex(fromAcc);
        String fromAccountNumber = from.getFirstSelectedOption().getText();


        Select to = new Select(toAccount);
        to.selectByIndex(toAcc);
        String toAccountNumber = to.getFirstSelectedOption().getText();

        button.click();
        System.out.println("button successful");

        if (successMessage.isDisplayed()) {
            System.out.println("$" + amount + " has been transferred from " + fromAccountNumber + " account to " + toAccountNumber + " account successfully");

        } else {
            System.out.println("Transaction is not successful");
        }

    }


}
