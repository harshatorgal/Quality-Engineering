package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By scrolldown = By.tagName("body");
    By category = By.xpath("//a[@href='#Women']");
    By categorySelection = By.linkText("Dress");
    By viewProduct = By.cssSelector("[href=\"/product_details/4\"]");
    By addToCartButton = By.xpath("//a[@data-product-id='4']");
    By productPage = By.cssSelector("a[href='/products']");
    By itemPrice = By.xpath("//p[text()='Stylish Dress']/preceding-sibling::h2");


    HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setHomePage1() {

        driver.findElement(scrolldown).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(scrolldown).sendKeys(Keys.PAGE_UP);

        driver.findElement(category).click();

        driver.findElement(categorySelection).click();
    }

    public String getItemPrice() {
        return driver.findElement(itemPrice).getText();
    }

    public void setHomePage2() {

        driver.findElement(viewProduct).click();

        driver.findElement(addToCartButton).click();

        driver.findElement(productPage).click();


    }

}
