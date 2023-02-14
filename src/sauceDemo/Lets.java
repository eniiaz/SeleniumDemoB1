package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Lets {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        List<WebElement> menu = driver.findElements(By.xpath("//div[@id='navbar-inverse-collapse']//li/a"));
        System.out.println(menu.size());

        Actions actions = new Actions(driver);
        for (WebElement link: menu){
            Thread.sleep(1000);
            actions.moveToElement(link).perform();
        }

    }
}
