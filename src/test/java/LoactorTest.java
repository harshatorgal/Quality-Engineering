import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoactorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.partialLinkText("Floating")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();
        //driver.findElement(By.id("username")).sendKeys("tomsmith").;
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        //driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();
        driver.findElement(By.cssSelector("button.radius")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}


