package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

        Select from = new Select(fromAccount);
        from.selectByIndex(fromAcc);
        System.out.println("from account successful");

        Select to = new Select(toAccount);
        to.selectByIndex(toAcc);
        System.out.println("to account successful");

        button.click();
        System.out.println("button successful");

        if (successMessage.isDisplayed()) {
            System.out.println("$" + amount + " has been transfered from " + from.getFirstSelectedOption().getText() + " account to" + to.getFirstSelectedOption().getText() + " account successfully");

        } else {
            System.out.println("Transaction is not successful");
        }

    }


}
