package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestLoan {
    WebDriver driver;
    @FindBy(linkText = "Request Loan")
    WebElement requestLoanLink;
    @FindBy(id = "amount")
    WebElement amount;
    @FindBy(id = "downPayment")
    WebElement downPayment;
    @FindBy(id = "formAccountId")
    WebElement fromAccountID;
    @FindBy(className = "button")
    WebElement buttonApplyLoan;

    RequestLoan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setRequestLoan(String amt, String downPay, int fromAccID){
        requestLoanLink.click();
        amount.sendKeys(amt);
        downPayment.sendKeys(downPay);

        Select dropdown = new Select(fromAccountID);
        dropdown.selectByIndex(fromAccID);

        buttonApplyLoan.click();
    }

}
