import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowseAction {
    WebDriver driver;

    @Test
    public void Test() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.instagram.com");
        driver.switchTo().newWindow(WindowType.TAB);
        /*NavigateBack();
        NavigateForward();
        Refresh();
        Fullscreen();
        Maximize();
        Minimize();
        SamsungGalaxyS26();
        iPhone14Dimension();
        CurrentURL();*/
        Title();
        Close();
        Quit();
    }

    public void NavigateBack() {
        driver.navigate().back();

    }

    public void NavigateForward() {
        driver.navigate().forward();

    }

    public void Refresh() {
        driver.navigate().refresh();

    }


    public void Fullscreen() {
        driver.manage().window().fullscreen();
    }

    public void Maximize() {
        driver.manage().window().maximize();
    }

    public void Minimize() {
        driver.manage().window().minimize();
    }

    public void iPhone14Dimension() {
        Dimension dimension = new Dimension(390, 844);
        driver.manage().window().setSize(dimension);
    }

    public void SamsungGalaxyS26() {
        driver.manage().window().setSize(new Dimension(412, 915));
    }

    public void CurrentURL() {
        String URL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + URL);
    }

    public void Title() {
        String Title = driver.getTitle();
        System.out.println("Title is: " + Title);
    }

    public void Close() {
        driver.close();
    }

    public void Quit() {
        driver.quit();
    }

}
