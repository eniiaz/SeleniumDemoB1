package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tasker {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();
        // WebElement price1= driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        // System.out.println(price1.getText());

        List<WebElement> listOfPrices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        System.out.println(listOfPrices.size());

        for( WebElement price:listOfPrices){
            if(price.getText().startsWith("$")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }

}
