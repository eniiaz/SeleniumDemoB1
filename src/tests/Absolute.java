package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {

    public static void main(String[] args) {
        // https://saucedemo.com

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        WebElement passwordLabel = driver.findElement(By.xpath("//body/div/div/div[2]/div[2]/div/div[2]/h4"));
        System.out.println(passwordLabel.getText());
        // //*[@id="root"]/div/div[2]/div[2]/div/div[2]/h4

        WebElement users = driver.findElement(By.className("login_credentials"));

        String usersText = users.getText();

        int startIndex = usersText.indexOf("problem");

        String target = usersText.substring(startIndex, startIndex+12);
        System.out.println("Here: " + target);

    }

}
