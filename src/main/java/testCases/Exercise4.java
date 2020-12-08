package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Exercise4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.28.0-win64\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette",true);
        WebDriver driver = new FirefoxDriver(options);

        driver.navigate().to("https://antycaptcha.amberteam.pl/exercises/exercise4?seed=4ba0ec83-95c5-4952-8f41-69e4e749413d");

        WebElement groupZero = driver.findElement(By.name("Group 0"));
        Select selectGroupZero = new Select(groupZero);
        selectGroupZero.selectByVisibleText("Duck Egg Blue");

        WebElement groupOne = driver.findElement(By.name("Group 1"));
        Select selectGroupOne = new Select(groupOne);
        selectGroupOne.selectByVisibleText("Freudian Gilt");

        WebElement groupTwo = driver.findElement(By.name("Group 2"));
        Select selectGroupTwo = new Select(groupTwo);
        selectGroupTwo.selectByVisibleText("Beluga Brown");

        WebElement groupThree = driver.findElement(By.name("Group 2"));
        Select selectGroupThree = new Select(groupThree);
        selectGroupThree.selectByVisibleText("Pink Kong");

        driver.close();
    }
}
