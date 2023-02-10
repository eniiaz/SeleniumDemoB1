package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS12 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//div[@class='pricebar']/button"));

        for (WebElement addToCartButton: addToCartButtons){
            Thread.sleep(300);
            addToCartButton.click();
        }

        List<WebElement> removeButtons = driver.findElements(By.xpath("//div[@class='pricebar']/button"));

        String expected = "REMOVE";

        for (WebElement removebutton: removeButtons){
            String actualResult = removebutton.getText();
            if (actualResult.equals(expected)){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
                System.out.println("Expected: " + expected);
                System.out.println("Actual: " + actualResult);
            }
        }

        driver.quit();

    }

}
