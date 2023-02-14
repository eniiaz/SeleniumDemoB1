package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Recap {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.letskodeit.com/practice");

        WebElement window = driver.findElement(By.id("openwindow"));

        Actions actions = new Actions(driver);
        //actions.contextClick(window).perform();
        //actions.scrollByAmount(0, 300).perform();
        //Thread.sleep(1000);
        //actions.scrollByAmount(0, 300).perform();
        //Thread.sleep(1000);
        //actions.scrollByAmount(0, 300).perform();
        WebElement logo = driver.findElement(By.xpath("//img[@class='img-fluid']"));
        Thread.sleep(2300);
        actions.clickAndHold(logo).moveByOffset(200, 200).perform();



    }

}
