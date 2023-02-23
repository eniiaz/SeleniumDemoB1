package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Blazer {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        flightNumberLengthVerification();
        flightNumberDigitVerification();
        flightNumberEmptyVerification();
        flightAirlineValidityVerification();
        driver.quit();
    }

    public static void flightAirlineValidityVerification(){
        System.out.println("\nVerifying flight airline validity scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightAirlines = getColumnCells(3);
        List<String> expectedAirlines = new ArrayList<>();
        expectedAirlines.add("Virgin America");
        expectedAirlines.add("United Airlines");
        expectedAirlines.add("Lufthansa");
        expectedAirlines.add("Aer Lingus");

        for (WebElement airline: flightAirlines){
            String airlineText = airline.getText().trim();
            if (expectedAirlines.contains(airlineText)){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
                System.out.println("Airline: " + airlineText);
            }
        }



    }


    public static void flightNumberDigitVerification(){
        System.out.println("\nVerifying if flight number is digit scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);

        for(WebElement flightNum: flightNumbers){
            // 342
            String flight = flightNum.getText();
            boolean check = isAllDigits(flight);
            if (check == true){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
                System.out.println("Flight: " + flight);
            }
        }
    }

    public static boolean isAllDigits(String s){
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }


    public static void flightNumberEmptyVerification(){
        System.out.println("\nVerifying if flight number is empty scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);
        int counter = 1;
        for (WebElement flightNum: flightNumbers){
            String flight = flightNum.getText().trim();
            if (flight.isEmpty()){
                System.out.println("Failed" + ": Row: " + counter);
            }else{
                System.out.println("Passed");
            }
            counter++;
        }
    }


    public static void flightNumberLengthVerification(){
        System.out.println("\nVerifying flight number length scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);
        int counter = 1;
        for (WebElement flightNum: flightNumbers){
            String flight = flightNum.getText().trim();
            if (flight.length() >= 2 && flight.length() <= 3){
                System.out.println("Passed");
            }else {
                System.out.println("Failed row: " + counter);
            }
            counter++;
        }
    }


    // This method gets one specific cell data from web table
    public static WebElement getCellData(int row, int column){
        //table[@class='table']/tbody/tr[1]/td[2]
        String xpath = "//table[@class='table']/tbody/tr[" + row + "]/td[" + column + "]";
        WebElement cellData = driver.findElement(By.xpath(xpath));
        return cellData;
    }

    public static List<WebElement> getRowCells(int row){
        //table[@class='table']/tbody/tr[3]/td
        String xpath = "//table[@class='table']/tbody/tr[" + row +"]/td";
        List<WebElement> rowCells = driver.findElements(By.xpath(xpath));
        return rowCells;
    }

    public static List<WebElement> getColumnCells(int column){
        //table[@class='table']/tbody/tr/td[3]
        String xpath = "//table[@class='table']/tbody/tr/td[" + column + "]";
        List<WebElement> columnCells = driver.findElements(By.xpath(xpath));
        return columnCells;
    }

}
