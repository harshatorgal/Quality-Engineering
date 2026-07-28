package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RequestLoan {
    WebDriver driver;
    @FindBy(linkText = "Request Loan")
    WebElement requestLoanLink;
    @FindBy(id = "amount")
    WebElement amount;
    @FindBy(id = "downPayment")
    WebElement downPayment;
    @FindBy(id = "fromAccountId")
    WebElement fromAccountID;
    @FindBy(xpath = "//input[@value='Apply Now']")
    WebElement buttonApplyLoan;
    @FindBy(id = "loanStatus")
    WebElement status;
    @FindBy(id = "newAccountId")
    WebElement newAccount;
    @FindBy(id = "accountTable")
    WebElement accountOverview;

    RequestLoan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setRequestLoan(String amt, String downPay, int fromAccID) {
        requestLoanLink.click();
        amount.sendKeys(amt);
        downPayment.sendKeys(downPay);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> new Select(fromAccountID).getOptions().size() > 0);

        Select dropdown = new Select(fromAccountID);
        dropdown.selectByIndex(fromAccID);

        buttonApplyLoan.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(driver -> !status.getText().trim().isEmpty());

        String Status = status.getText().trim();

        if (Status.equals("Denied")) {
            System.out.println("We cannot grant a loan for " + amt + " amount with your available funds.");
        } else if (Status.equals("Approved")) {
            System.out.println("Congratulations, your loan of " + amt + " has been approved.");
            System.out.println("Your new account ID: " + newAccount.getText());
        } else {
            System.out.println("You do not have sufficient amount for down payment.");
        }
    }

}
