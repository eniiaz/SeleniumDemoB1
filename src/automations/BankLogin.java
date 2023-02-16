package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankLogin {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");

        WebElement bank = driver.findElement(By.linkText("Bank Project"));
        bank.click();

        Thread.sleep(4000);

        WebElement username = driver.findElement(By.name("uid"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("btnLogin"));

        username.sendKeys("mngr478861");
        password.sendKeys("ahAquge");
        loginButton.click();

        System.out.println(driver.getTitle());
        String expectedTitle = "GTPL Bank Manager HomePage";

        if (driver.getTitle().equals(expectedTitle)){
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }

        driver.findElement(By.linkText("New Customer")).click();
        WebElement date = driver.findElement(By.id("dob"));
        date.sendKeys("02/15/2023");



    }
}
