package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContact {
    WebDriver driver;
    @FindBy(linkText = "Update Contact Info")
    WebElement updateContactLink;
    @FindBy(id = "customer.firstName")
    WebElement fName;
    @FindBy(id = "customer.lastName")
    WebElement lName;
    @FindBy(id = "customer.address.street")
    WebElement address;
    @FindBy(id = "customer.address.city")
    WebElement city;
    @FindBy(id = "customer.address.state")
    WebElement street;
    @FindBy(id = "customer.address.zipCode")
    WebElement zipCode;
    @FindBy(id = "customer.phoneNumber")
    WebElement phNumber;
    @FindBy(className = "button")
    WebElement buttonUpdateProfile;

    UpdateContact(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUpdateContact(String FName, String LName, String Add, String City, String Street, String ZipCode, String PH) {
        updateContactLink.click();
        fName.sendKeys(FName);
        lName.sendKeys(LName);
        address.sendKeys(Add);
        city.sendKeys(City);
        street.sendKeys(Street);
        zipCode.sendKeys(ZipCode);
        phNumber.sendKeys(PH);
        buttonUpdateProfile.click();
    }

}
