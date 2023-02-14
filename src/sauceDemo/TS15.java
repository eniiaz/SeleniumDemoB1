package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS15 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons = driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//div[@class='pricebar']/button"));
        System.out.println(addToCartButtons.size());
        addToCartButtons.get(1).click();
        addToCartButtons.get(3).click();

        WebElement cartButton=driver.findElement(By.className("shopping_cart_link"));
        Thread.sleep(300);
        cartButton.click();
        WebElement checkoutButton= driver.findElement(By.id("checkout"));
        Thread.sleep(300);
        checkoutButton.click();


        List <WebElement> checkoutInfo=driver.findElements(By.tagName("input"));
        System.out.println(checkoutInfo.size());
        checkoutInfo.get(0).sendKeys("Batina");
        Thread.sleep(300);
        checkoutInfo.get(1).sendKeys("Kulusheva");
        Thread.sleep(200);
        checkoutInfo.get(2).sendKeys("60194");
        Thread.sleep(300);
        checkoutInfo.get(3).click();

        WebElement finish=driver.findElement(By.id("finish"));
        finish.click();
        String expected="THANK YOU FOR YOUR ORDER";
        WebElement orderPageText=driver.findElement(By.className("complete-header"));
        if(orderPageText.getText().trim().equals(expected)){
            System.out.println("PASSED! Actual message is: "+orderPageText.getText());
        }else{
            System.out.println("FAILED");
        }
    }
}
