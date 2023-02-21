package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FrameHover {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/esen/Desktop/frame.html");

        driver.switchTo().frame("test");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 800).perform();

        driver.switchTo().frame("courses-iframe");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Actions actions1 = new Actions(driver);
        for (WebElement link: links){
            actions1.moveToElement(link).perform();
            Thread.sleep(500);
        }

    }

}
