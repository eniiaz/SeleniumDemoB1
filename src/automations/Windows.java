package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Windows {

    public static void main(String[] args) {
//        https://www.saucedemo.com/
        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();

        //driver.findElement(By.linkText("Twitter")).click();

        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        
    }
}
