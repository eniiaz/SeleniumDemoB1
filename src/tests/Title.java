package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";

        if (actualTitle.trim().equals(expectedTitle)){
            System.out.println("PASSED");
        }
        else {
            System.out.println("FIALED");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }

    }
}
