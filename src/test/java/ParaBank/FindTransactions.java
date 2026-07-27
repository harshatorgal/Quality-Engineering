package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindTransactions {
    WebDriver driver;

    @FindBy(linkText = "Find Transactions")
    WebElement findTransactionsLink;
    @FindBy(id = "accountId")
    WebElement accountSelection;
    @FindBy(id = "transactionId")
    WebElement transactionID;
    @FindBy(id = "c")
    WebElement buttonID;
    @FindBy(id = "transactionDate")
    WebElement transactionDate;
    @FindBy(id = "findByDate")
    WebElement buttonDate;
    @FindBy(id = "fromDate")
    WebElement fromDate;
    @FindBy(id = "toDate")
    WebElement toDate;
    @FindBy(id = "findByDateRange")
    WebElement buttonDateRange;
    @FindBy(id = "amount")
    WebElement amount;
    @FindBy(id = "findByAmount")
    WebElement buttonAmount;

    FindTransactions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFindTransactions(int accID, String transID, String transDate, String fromDateSelect, String toDateSelect, String amt) {
        findTransactionsLink.click();

        Select account = new Select(accountSelection);
        account.selectByIndex(accID);

        transactionID.sendKeys(transID); //15031
        buttonID.click();
        System.out.println("Transaction by ID is successful");

        findTransactionsLink.click();
        transactionDate.sendKeys(transDate);
        buttonDate.click();
        System.out.println("Transaction by Date is successful");

        findTransactionsLink.click();
        fromDate.sendKeys(fromDateSelect);
        toDate.sendKeys(toDateSelect);
        buttonDateRange.click();
        System.out.println("Transaction by Date Range is successful");


        findTransactionsLink.click();
        amount.sendKeys(amt);
        buttonAmount.click();
        System.out.println("Transaction by Amount is successful");

    }

}
