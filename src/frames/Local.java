package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Local {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/esen/Desktop/frame.html");

        WebElement city = driver.findElement(By.id("hi"));

        Select dropCity = new Select(city);
        dropCity.selectByVisibleText("Boston");

        // Switch into that iframe
        // 3 options to switch
        // by index, by web element, by name or id
        driver.switchTo().frame("travel");

        WebElement city2 = driver.findElement(By.name("fromPort"));
        Select dropCity2 = new Select(city2);
        dropCity2.selectByVisibleText("Boston");

        driver.switchTo().defaultContent();
        dropCity.selectByVisibleText("NYC");

        WebElement sauceFrame = driver.findElement(By.xpath("//iframe[2]"));

        driver.switchTo().frame(sauceFrame);
        driver.findElement(By.id("user-name")).sendKeys("codewise");
        driver.findElement(By.id("password")).sendKeys("Test");




    }

}
