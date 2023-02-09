package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Cup {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().fullscreen();
        WebElement username = driver.findElement(By.id("user-name"));

        // What happens if locator is not correct?
        // Element Not Found Exception

        // How to type something in the input box?

        // webElement.sendKeys("");

        WebElement loginButton = driver.findElement(By.name("login-button"));

        Thread.sleep(3000);

        loginButton.click();

        WebElement input = driver.findElement(By.tagName("input"));

        //input.sendKeys("Test@test.com");

        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        System.out.println(inputs.size());

       // inputs.get(1).sendKeys("Password");

        WebElement errorMessageText = driver.findElement(By.tagName("h3"));
        String actualMessage = errorMessageText.getText();

        String expectedMessage = "TRY AGAIN!";

        if (actualMessage.trim().equals(expectedMessage)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("Expected: " + expectedMessage);
            System.out.println("Actual: " + actualMessage);
        }
    }
}
