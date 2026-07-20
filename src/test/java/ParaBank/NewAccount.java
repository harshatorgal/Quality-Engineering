package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewAccount {
    WebDriver driver;
    @FindBy(linkText = "Open New Account")
    WebElement newAccountLink;
    @FindBy(id = "type")
    WebElement accType;
    @FindBy(id = "fromAccountId")
    WebElement accNumber;
    @FindBy(xpath = "//input[@value='Open New Account']")
    WebElement accountOpenButton;
    @FindBy(id = "newAccountId")
    WebElement accID;

    public NewAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void setNewAccount(String accountType, int accountNumber) {
        newAccountLink.click();

        Select selectType = new Select(accType);
        selectType.selectByVisibleText(accountType);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> new Select(accNumber).getOptions().size() > 0);

        Select selectNumber = new Select(accNumber);
        selectNumber.selectByIndex(accountNumber);

        accountOpenButton.click();


    }

    public String getAccountID() {
        return accID.getText();
    }

    public void setClickID() {
        accID.click();
    }

}
