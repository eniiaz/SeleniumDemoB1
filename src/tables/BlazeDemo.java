package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BlazeDemo {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/reserve.php");

        WebElement time = getTableData(1, 5);
        System.out.println(time.getText());

        System.out.println(getTableData(5, 3).getText());

        String expectedPrice = "$200.98";
        if (getTableData(3,6).getText().equals(expectedPrice)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        String expectedDeparture = "11:00 AM";
        if (getDepartureTime("12").equals(expectedDeparture)){
            System.out.println("Departure PASSED");
        }else{
            System.out.println("Departure FAILED");
        }

        for (WebElement airline: getColumn(3)){
            System.out.println(airline.getText());
        }

        getTableData(5, 1).findElement(By.tagName("input")).click();

        // where find element method is used?
        // driver.findElement
        WebElement table = driver.findElement(By.className("table"));

        WebElement secondRow = driver.findElement(By.xpath("//table/tbody/tr[2]"));

        Thread.sleep(2000);

        driver.quit();
    }

    public static WebElement getTableData(int row, int column){
        String xpath = "//table[@class='table']/tbody/tr[" + row + "]/td[" + column + "]";
        WebElement data = driver.findElement(By.xpath(xpath));
        return data;
    }

    public static String getDepartureTime(String flightNumber){
        String xpath = "//td[.='" + flightNumber+"']/../td[4]";
        WebElement departure = driver.findElement(By.xpath(xpath));

        String departureText = departure.getText();
        return departureText;
    }

    public static List<WebElement> getColumn(int column){
        String xpath = "//table[@class='table']/tbody/tr/td[" + column + "]";
        List<WebElement> columnData = driver.findElements(By.xpath(xpath));
        return columnData;
    }

}
