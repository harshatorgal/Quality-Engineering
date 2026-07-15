package SauceDemo.Shopping_With_PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShopTestClass {
    WebDriver driver;

    @BeforeTest
    public void Test() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {
        ShopLogin login = new ShopLogin(driver);
        ShopProduct product = new ShopProduct(driver);
        ShopCart cart = new ShopCart(driver);
        ShopCheckout checkout = new ShopCheckout(driver);
        ShopPayment payment = new ShopPayment(driver);

        login.setShopLogin("standard_user", "secret_sauce");

        product.setShopProduct("Price (high to low)");

        String expPrice = product.getProductPrice();
        product.setShopProductClick();

        cart.getTextName();
        cart.setButton();

        checkout.setCheckout("Harsha", "T", "123456");

        String actPrice = payment.getProductPrice();
        Assert.assertEquals(actPrice, expPrice, "Price of the product is incorrect");
        System.out.println("Price displayed is correct");

        double expTotal = payment.getItemTotal() + payment.getTax();
        double actTotal = payment.getTotal();

        Assert.assertEquals(actTotal, expTotal, "Total amount is incorrect");
        System.out.println("Total amount is correct");
        payment.setFinish();

        System.out.println(driver.getCurrentUrl());

    }

    @AfterTest
    public void Quit() {

        driver.quit();
    }


}
