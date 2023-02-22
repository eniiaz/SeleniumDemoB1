package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FlightButton {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/reserve.php");

        List<WebElement> buttons = driver.findElements(By.xpath("//table/tbody/tr/td/input"));
        int count = 1;
        for (WebElement button: buttons){
            button.click();
            if (driver.getCurrentUrl().contains("purcse.php")){
                System.out.println("PASSED");
            }
            else {
                System.out.println("FAILED");
                System.out.println(driver.getCurrentUrl());
                System.out.println("Row Number: " + count);
            }
            driver.navigate().back();
            count++;
        }
    }
}
