package Projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightBooking {

    WebDriver driver;

    @BeforeTest
    public void Test1() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.get("https://travel.agileway.net/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void Login() {
        driver.findElement(By.id("username")).sendKeys("agileway");
        driver.findElement(By.id("password")).sendKeys("test$W1se");
        driver.findElement(By.name("remember_me")).click();
        driver.findElement(By.name("commit")).click();
    }

    //Select Flight
    @Test(priority = 1)
    public void selectFlight() {
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select select_origin = new Select(dropdown1);
        select_origin.selectByIndex(3);

        WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select select_dest = new Select(dropdown2);
        select_dest.selectByVisibleText("Sydney");

        WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='departDay']"));
        Select select_dDate = new Select(dropdown3);
        select_dDate.selectByIndex(0);

        WebElement dropdown4 = driver.findElement(By.xpath("//select[@id='departMonth']"));
        Select select_dMonth = new Select(dropdown4);
        select_dMonth.selectByIndex(1);

        WebElement dropdown5 = driver.findElement(By.xpath("//select[@id='returnDay']"));
        Select select_rDate = new Select(dropdown5);
        select_rDate.selectByIndex(6);

        WebElement dropdown6 = driver.findElement(By.xpath("//select[@id='returnMonth']"));
        Select select_rMonth = new Select(dropdown6);
        select_rMonth.selectByIndex(1);

        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    //Passenger Details
    @Test(priority = 2)
    public void passengerDetails() {
        driver.findElement(By.cssSelector("[name='passengerFirstName']")).sendKeys("Harsha");
        driver.findElement(By.cssSelector("[name='passengerLastName']")).sendKeys("Torgal");
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    //Pay By Credit Card
    @Test(priority = 3)
    public void creditCard() {
        driver.findElement(By.cssSelector("[value='master']")).click();
        driver.findElement(By.name("card_number")).sendKeys("1234 5567 8796 4567");
        WebElement EXP_Month = driver.findElement(By.name("expiry_month"));
        Select select_EXP_Month = new Select(EXP_Month);
        select_EXP_Month.selectByValue("09");

        WebElement EXP_Year = driver.findElement(By.name("expiry_year"));
        Select select_EXP_Year = new Select(EXP_Year);
        select_EXP_Year.selectByValue("2029");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }


}

