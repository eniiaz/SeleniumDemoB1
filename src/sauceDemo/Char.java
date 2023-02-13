package sauceDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Char {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        Thread.sleep(8000);

        String mainWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(driver.getWindowHandles().size());
        Iterator<String> iterator = windowHandles.iterator();
        iterator.next();
        String window = iterator.next();

        System.out.println(mainWindow);
        System.out.println(window);
        driver.switchTo().window(window);
        System.out.println(driver.getTitle());

        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(mainWindow);

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
//        footer.click();
        driver.quit();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        

    }
}
