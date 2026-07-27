package ParaBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;

    @BeforeTest
    public void Test1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void Test2() {
        driver.findElement(By.linkText("About Us")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Services")).click();
        driver.navigate().back();
    }

    @Test(priority = 1)
    public void InvalidLogin() {
        Login login = new Login(driver);
        login.setLogin("Shiv", "1111");
    }

    @Test(priority = 2)
    public void SignIn() {
        SignIn signIn = new SignIn(driver);
        signIn.setSignIN("SHIVAM", "B", "ABC", "Auckland", "Auckland", "1010", "1234567890", "1122", "shivam000", "1234", "1234");

    }

    @Test(priority = 3)
    public void ValidLogin() {

        Login login = new Login(driver);
        login.setLogout();
        login.setLogin("shivam000", "1234");


    }

    @Test(priority = 4)
    public void NewAccount() {
        NewAccount newAccount = new NewAccount(driver);
        newAccount.setNewAccount("SAVINGS", 0);
        System.out.println("Congratulations, your account is now open");

        String AccountID = newAccount.getAccountID();
        System.out.println("Account ID is: " + AccountID);

        newAccount.setClickID();

        newAccount.setAccountActivity("August", "Credit");

    }

    @Test(priority = 5)
    public void TransferFunds() {
        TransferFunds transferFunds = new TransferFunds(driver);

        transferFunds.setTransferFunds("100", 0, 1);

    }

    @Test(priority = 6)
    public void BillPay() {
        BillPay billPay = new BillPay(driver);

        billPay.setBillPay("Harsha", "ABC", "Auckland", "Auckland", "1010", "1234567890", "11234", "11234", "50", 0);
    }

    @Test(priority = 7)
    public void FindTransactions() {
        FindTransactions findTransaction = new FindTransactions(driver);
        findTransaction.setFindTransactions(0, "15031", "07-27-2026", "06-01-2026", "06-30-2026", "50");
    }

    @Test(priority = 8)
    public void UpdateContact() {
        UpdateContact updateC = new UpdateContact(driver);
        updateC.setUpdateContact("Harsha", "T", "Auckland", "Auckland", "ABC", "1010", "2233445566");
    }

    @Test(priority = 9)
    public void RequestLoan(){
        RequestLoan loan = new RequestLoan(driver);
        loan.setRequestLoan("10000", "100",0);
    }

   /* @AfterTest
    public void quit() {
        driver.quit();
    }*/

}
