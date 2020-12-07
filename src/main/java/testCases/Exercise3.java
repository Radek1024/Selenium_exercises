package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Exercise3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette",true);
        WebDriver driver = new FirefoxDriver(options);

        driver.navigate().to("https://antycaptcha.amberteam.pl/exercises/exercise3?seed=4ba0ec83-95c5-4952-8f41-69e4e749413d");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement dropdown = driver.findElement(By.id("s13"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Duck Egg Blue");
        driver.close();
    }
}
