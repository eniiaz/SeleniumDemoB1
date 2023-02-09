package tests;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Remote {

    public static void main(String[] args) throws InterruptedException {

//        Thread.sleep(milliseconds) => method that pauses the program execution
        // Thread.sleep(millisecond) throws checked exception.

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");



        List<WebElement> items = driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("problem_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        List<WebElement> addToCarts = driver.findElements(By.xpath("//div[@class='inventory_list']//button"));

        for (WebElement cart: addToCarts){
            Thread.sleep(800);
            cart.click();
        }
    }

}
