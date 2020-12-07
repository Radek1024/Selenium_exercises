package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Exercise1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");

        FirefoxOptions capabilities = new FirefoxOptions();
        capabilities.setCapability("marionette",true);
        WebDriver driver = new FirefoxDriver(capabilities);

        driver.navigate().to("https://antycaptcha.amberteam.pl/exercises/exercise1?seed=4ba0ec83-95c5-4952-8f41-69e4e749413d");

        WebElement clickButton1 = driver.findElement(By.id("btnButton1"));
        WebElement clickButton2 = driver.findElement(By.id("btnButton2"));

        clickButton1.click();
        clickButton2.click();
        clickButton1.click();
        driver.close();

    }
}
