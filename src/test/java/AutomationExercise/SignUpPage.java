package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;
    By signName = By.cssSelector("[data-qa='signup-name']");
    By signEmail = By.cssSelector("[data-qa='signup-email']");
    By signButton = By.className("btn");
    By gender = By.id("id_gender2");
    By PWD = By.id("password");
    By days = By.id("days");
    By months = By.id("months");
    By years = By.id("years");
    By fName = By.id("first_name");
    By lName = By.id("last_name");
    By add1 = By.id("address1");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobileNumber = By.id("mobile_number");
    By button = By.xpath("/button[@data-qa='create-account']");
    By logoutButton = By.xpath("/a[@href='logout']");

    SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSignUpPage(String name, String email) {
        driver.findElement(signName).sendKeys(name);
        driver.findElement(signEmail).sendKeys(email);
        driver.findElement(signButton).click();
    }

    public void setDetails(String pwd, String day, String month, int year, String fname, String lname, String add, int Country, String State, String City, String zip, String mobNumber) {
        driver.findElement(gender).click();
        driver.findElement(PWD).sendKeys(pwd);

        WebElement s_day = driver.findElement(days);
        Select select_day = new Select(s_day);
        select_day.selectByVisibleText(day);

        WebElement s_month = driver.findElement(months);
        Select select_month = new Select(s_month);
        select_month.selectByVisibleText(month);

        WebElement s_year = driver.findElement(years);
        Select select_year = new Select(s_year);
        select_year.selectByIndex(year);

        driver.findElement(fName).sendKeys(fname);
        driver.findElement(lName).sendKeys(lname);
        driver.findElement(add1).sendKeys(add);

        WebElement s_country = driver.findElement(country);
        Select select_country = new Select(s_country);
        select_country.selectByIndex(Country);

        driver.findElement(state).sendKeys(State);
        driver.findElement(city).sendKeys(City);
        driver.findElement(zipcode).sendKeys(zip);
        driver.findElement(mobileNumber).sendKeys(mobNumber);
        driver.findElement(button).click();
        driver.findElement(logoutButton).click();


    }
}
