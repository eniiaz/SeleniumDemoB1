package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DestinationOfWeek {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");
        WebElement destinationOfTheWeekLink = driver.findElement(By.partialLinkText("The Beach"));

        destinationOfTheWeekLink.click();
        WebElement title = driver.findElement(By.xpath("(//div[@class='container'])[2]"));
        String destinationText = title.getText();
        int start = destinationText.indexOf(":");
        int end = destinationText.indexOf("!");
        String destination = destinationText.substring(start+1, end);
        System.out.println(destination);

        if (destination.trim().equals("Hawaii")){
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }


    }

}
