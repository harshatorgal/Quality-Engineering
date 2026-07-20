package ParaBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
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
        signIn.setSignIN("SHIVAM", "B", "ABC", "Auckland", "Auckland", "1010", "1234567890", "1122", "shivam06", "1234", "1234");

    }

    @Test(priority = 3)
    public void ValidLogin() {

        Login login = new Login(driver);
        login.setLogout();
        login.setLogin("shivam06", "1234");


    }

    @Test(priority = 4)
    public void NewAccount() {
        NewAccount newAccount = new NewAccount(driver);
        newAccount.setNewAccount("SAVINGS", 0);

        String AccountID = newAccount.getAccountID();
        System.out.println("Account ID is: " + AccountID);

        newAccount.setClickID();
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

}
