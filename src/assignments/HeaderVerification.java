package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HeaderVerification {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");

        List<WebElement> headerLinks = driver.findElements(By.xpath("(//div[@class='container'])[1]/a"));

        int count = 0;
        for (WebElement link: headerLinks){
            String href = link.getAttribute("href");
            if (href != null){
                count++;
            }
        }

        if (count == 2){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }

        driver.quit();

    }
}
