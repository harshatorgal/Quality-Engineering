package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillPay {
    WebDriver driver;
    @FindBy(linkText = "Bill Pay")
    WebElement billPayLink;
    @FindBy(name = "payee.name")
    WebElement payeeName;
    @FindBy(name = "payee.address.street")
    WebElement payeeAddress;
    @FindBy(name = "payee.address.city")
    WebElement payeeCity;
    @FindBy(name = "payee.address.state")
    WebElement payeeState;
    @FindBy(name = "payee.address.zipCode")
    WebElement payeeZipCode;
    @FindBy(name = "payee.phoneNumber")
    WebElement payeePhNumber;
    @FindBy(name = "payee.accountNumber")
    WebElement accountNumber;
    @FindBy(name = "verifyAccount")
    WebElement confirmAccountNumber;
    @FindBy(name = "amount")
    WebElement amount;
    @FindBy(name = "fromAccountId")
    WebElement fromAccount;
    @FindBy(className = "button")
    WebElement button;

    BillPay(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setBillPay(String name, String address, String city, String state, String zipCode, String phNumber, String accNumber, String confirmAccNumber, String amt, int fromAcc) {
        billPayLink.click();

        payeeName.sendKeys(name);
        payeeAddress.sendKeys(address);
        payeeCity.sendKeys(city);
        payeeState.sendKeys(state);
        payeeZipCode.sendKeys(zipCode);
        payeePhNumber.sendKeys(phNumber);
        accountNumber.sendKeys(accNumber);
        confirmAccountNumber.sendKeys(confirmAccNumber);
        amount.sendKeys(amt);

        Select acc = new Select(fromAccount);
        acc.selectByIndex(fromAcc);

        button.click();
    }
}
