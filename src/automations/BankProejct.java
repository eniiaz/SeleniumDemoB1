package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankProejct {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");

        WebElement emailInput = driver.findElement(By.name("emailid"));
        emailInput.sendKeys("random@test.com");

        driver.findElement(By.name("btnLogin")).click();

        WebElement userID = driver.findElement(By.xpath("(//td[@class='accpage']/../td)[2]"));

        WebElement password = driver.findElement(By.xpath("(//td[@class='accpage']/../td)[4]"));

        System.out.println(userID.getText());
        System.out.println(password.getText());

//        mngr478861
//        ahAquge


    }

}













