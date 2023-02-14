package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MyAction {

    public static void main(String[] args) throws InterruptedException {

        //
        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();
        Thread.sleep(2000);

        WebElement product =  driver.findElement(By.id("item_4_title_link"));

        Actions actions = new Actions(driver);
        //actions.contextClick(product).perform();

//        footer_copy
        //WebElement footer = driver.findElement(By.className("footer_copy"));
        //actions.moveToElement(footer).perform();

        actions.scrollByAmount(0, 300).perform();
    }

}
