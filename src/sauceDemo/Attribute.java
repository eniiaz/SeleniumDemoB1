package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Attribute {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link: links){
            System.out.println(link.getAttribute("href"));
        }

        driver.quit();
    }

}
