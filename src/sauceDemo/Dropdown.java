package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {

    public static void main(String[] args) {
//        product_sort_container
        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();

        WebElement dropdown = driver.findElement(By.className("product_sort_container"));
        Select sort = new Select(dropdown);

        System.out.println(sort.getFirstSelectedOption().getText());

        List<WebElement> sortOptions = sort.getOptions();

        for (WebElement option: sortOptions){
            System.out.println(option.getText());
        }

        if (sortOptions.size() == 4){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
    }

}
