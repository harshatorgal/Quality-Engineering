package AutomationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;

    @BeforeTest
    public void Test1() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();

    }

    @Test(priority = 0)
    public void SignUpPage() {
        SignUpPage signup = new SignUpPage(driver);
        signup.setSignUpPage("AbD", "ABD@gmail.com");
        signup.setDetails("1234567890", "3", "June", 2, "ABD", "DD", "qwerr", 1, "ASD", "AWE", "123456", "2345543223");

    }

    @Test(priority = 1)
    public void InvalidLoginPage() {

        LoginPage login = new LoginPage(driver);
        login.setLogin("0@gmail.com", "10");
        login.getErrorMessage();
    }

    @Test(priority = 2)
    public void ValidLoginPage() {

        LoginPage login = new LoginPage(driver);
        login.setLogin("ABD@gmail.com", "1234567890");
        login.getErrorMessage();
    }

    @Test(priority = 3)
    public void HomePage() {
        HomePage home = new HomePage(driver);
        home.setHomePage1();

        home.setHomePage2();
    }

    @Test(priority = 4)
    public void ProductPage() {
        ProductPage product = new ProductPage(driver);

        HomePage home = new HomePage(driver);
        String price1 = home.getItemPrice();

        product.setProductPage1();
        String price2 = product.getItemPrice();
        product.setProductPage2();

        if (price1 == price2) {
            System.out.println("Prices are matching");
        } else {
            System.out.println("Prices are not matching");
        }
    }

    @Test(priority = 5)
    public void CartCheckoutPage() {
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);

        String firstPrice = cart.getFirstPrice();
        double fprice = Double.parseDouble(firstPrice.replace("Rs. ", ""));

        String secondPrice = cart.getSecondPrice();
        double sPrice = Double.parseDouble(secondPrice.replace("Rs. ", ""));

        double total = fprice + sPrice;
        cart.setCartPage();

        double totalPrice = checkout.getTotalPrice();

        Assert.assertEquals(total, totalPrice, "Total price is correct");

        String deliveryAddress = checkout.getDAddress();
        String billingAddress = checkout.getBAddress();

        Assert.assertEquals(deliveryAddress, billingAddress, "Address are correct");

        checkout.setCheckoutPage("Good");

    }

}
