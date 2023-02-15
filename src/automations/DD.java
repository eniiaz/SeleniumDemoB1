package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD {

    // mngr478763
    // zequrUn

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement source = driver.findElement(By.xpath("(//li[@id='fourth']/a)[2]"));

        WebElement destination = driver.findElement(By.id("amt7"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source, destination).perform();

        WebElement debitMovement = driver.findElement(By.id("t7"));
        WebElement creditMovement = driver.findElement(By.id("t8"));

        String expectedDebit = "5000";
        String expectedCredit = "0";

        if (debitMovement.getText().equals(expectedDebit)){
            System.out.println("Debit Passed");
        }else {
            System.out.println("Debit failed");
        }

        if (creditMovement.getText().equals(expectedCredit)){
            System.out.println("Credit passed");
        }else {
            System.out.println("Credit Failed");
        }




    }

}
