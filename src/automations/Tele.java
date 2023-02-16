package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tele {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/");

        driver.findElement(By.linkText("Telecom Project")).click();

        driver.findElement(By.linkText("Add Customer")).click();




        WebElement backgroundCheck = driver.findElement(By.xpath("//input[@id='done']/../label"));
        backgroundCheck.click();



    }
}
