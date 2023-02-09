package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Visible {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().fullscreen();

        List<WebElement> elements = driver.findElements(By.tagName("input"));
        elements.get(0).sendKeys("problem_user");
        elements.get(1).sendKeys("secret_sauce");
        elements.get(2).click();

        WebElement dropDown = driver.findElement(By.className("product_sort_container"));

        Select categories = new Select(dropDown);

        System.out.println(categories.getFirstSelectedOption().getText());


    }
}
