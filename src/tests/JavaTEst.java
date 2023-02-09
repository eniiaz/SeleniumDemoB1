package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JavaTEst {


    public static void main(String[] args) {
        // Set property

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //driver.manage().window().fullscreen();
        WebElement searchBar = driver.findElement(By.name("q"));

        //searchBar.sendKeys("Cristiano Ronaldo" + Keys.ENTER);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link: links){
            link.click();
            System.out.println(driver.getTitle());
            driver.navigate().back();
        }

    }

}
