package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    WebDriver driver;
    @FindBy(xpath = "//a[@href='register.htm']")
    WebElement resisterUser;
    @FindBy(id = "customer.firstName")
    WebElement fName;
    @FindBy(id = "customer.lastName")
    WebElement lName;
    @FindBy(id = "customer.address.street")
    WebElement cStreet;
    @FindBy(id = "customer.address.city")
    WebElement cCity;
    @FindBy(id = "customer.address.state")
    WebElement cState;
    @FindBy(id = "customer.address.zipCode")
    WebElement cZip;
    @FindBy(id = "customer.phoneNumber")
    WebElement cNumber;
    @FindBy(id = "customer.ssn")
    WebElement cSSN;
    @FindBy(id = "customer.username")
    WebElement cUsername;
    @FindBy(id = "customer.password")
    WebElement cPWD;
    @FindBy(id = "repeatedPassword")
    WebElement cRepeatPWD;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement signInButton;

    SignIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSignIN(String firstName, String lastName, String street, String city, String state, String zip, String phNumber, String ssn, String username, String pwd, String repeatPWD) {
        resisterUser.click();
        fName.sendKeys(firstName);
        lName.sendKeys(lastName);
        cStreet.sendKeys(street);
        cCity.sendKeys(city);
        cState.sendKeys(state);
        cZip.sendKeys(zip);
        cNumber.sendKeys(phNumber);
        cSSN.sendKeys(ssn);
        cUsername.sendKeys(username);
        cPWD.sendKeys(pwd);
        cRepeatPWD.sendKeys(repeatPWD);
        signInButton.click();

    }
}

