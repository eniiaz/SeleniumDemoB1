package automations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {

//    1.  Go to https://courses.letskodeit.com/practice
//2. Locate 'alert' button
//3. Click on Alert button
//4. Switch to Alert
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        String name = "James";
        WebElement inputName = driver.findElement(By.id("name"));

        inputName.sendKeys(name);

        driver.findElement(By.id("alertbtn")).click();

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();
        System.out.println(message);

        if (message.contains(name)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
        alert.accept();





    }
}
