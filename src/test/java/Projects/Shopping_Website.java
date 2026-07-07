package Projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Shopping_Website {

    WebDriver driver;

    @BeforeTest
    public void Test() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
    }

    @Test(priority = 1)
    public void productPage() throws InterruptedException {
        WebElement filter = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(filter);
        select.selectByValue("lohi");
        Thread.sleep(1000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
        Thread.sleep(1000);

        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

    }

    @Test(priority = 2)
    public void Cart() throws InterruptedException {
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);

        driver.findElement(By.id("checkout")).click();
    }

    @Test(priority = 3)
    public void checkout() throws InterruptedException {
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);


        driver.findElement(By.id("first-name")).sendKeys("Harsha");
        Thread.sleep(1000);
        driver.findElement(By.name("lastName")).sendKeys("Torgal");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name='postalCode']")).sendKeys("123456");
        Thread.sleep(1000);

        driver.findElement(By.className("submit-button")).click();

    }

    @Test(priority = 4)
    public void finish() throws InterruptedException {


        List<WebElement> price = driver.findElements(By.className("inventory_item_price"));//because both price has same class name

        double price1 = Double.parseDouble(price.get(0).getText().replace("$", ""));
        double price2 = Double.parseDouble(price.get(1).getText().replace("$", ""));
        double expectedPrice = price1 + price2;

        String itemTotal = driver.findElement(By.className("summary_subtotal_label")).getText();
        double actualPrice = Double.parseDouble(itemTotal.replace("Item total: $", ""));

        String tax = driver.findElement(By.className("summary_tax_label")).getText();
        double taxprice = Double.parseDouble(tax.replace("Tax: $", ""));
        double total = actualPrice + taxprice;


        if (expectedPrice == actualPrice) {
            System.out.println("Total amount displayed(excluding tax) is correct: $" + actualPrice);
            System.out.println("Total amount displayed(including tax) is: $" + total);
        } else {
            System.out.println("Total amount displayed(excluding tax) is not correct");
        }


        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();

    }


}
