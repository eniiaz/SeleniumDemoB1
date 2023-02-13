package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Task {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();

        Actions actions = new Actions(driver);

        WebElement footer = driver.findElement(By.xpath("//div[@class='footer_copy']"));
        Thread.sleep(1000);

        for (int i = 0; i < 25; i++){
            actions.scrollByAmount(0, 20).perform();
            Thread.sleep(50);
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
