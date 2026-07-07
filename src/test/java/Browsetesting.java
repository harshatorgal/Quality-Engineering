import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browsetesting {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void GoogleTest() {
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.instagram.com");
        Title();
    }

    public void Maximize() {
        driver.manage().window().maximize();
    }

    public void Title() {
        String Title = driver.getTitle();
        System.out.println("Current Title Name: " + Title);
    }

    @AfterTest
    public void Finish() {
        driver.quit();
    }

}
