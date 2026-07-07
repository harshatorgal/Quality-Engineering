import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        //As table is not interactable, I'll store it in a variable
        WebElement table = driver.findElement(By.id("table1"));//I can't use string data type because table is a web element.
        List<WebElement> Element = driver.findElements(By.tagName("tr"));//As there are more no. of elements in the table I need to use List interface.
        System.out.println(Element.get(1).getText());
        driver.quit();

    }
}
