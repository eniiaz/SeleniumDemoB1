package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ascii {

    public static void main(String[] args) throws InterruptedException {
        char c = 'r';
        int i = c;
        System.out.println(i);

        String name = "James";
        // 'J','a','m','e','s'
        // 7497109101115
        // 10010111000110101101010100110

        // https://courses.letskodeit.com/practice
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        List<WebElement> checks = driver.findElements(By.xpath("//div[@id='checkbox-example-div']//input"));

        for (WebElement check: checks){
            System.out.println(check.isSelected());
            Thread.sleep(500);
            check.click();
            System.out.println(check.isSelected() + "\n");
        }

        for (WebElement check: checks){
            String temp = check.getAttribute("value");
            System.out.println(temp);
        }
    }
}
