package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Telecom {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com");
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Telecom Project")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Add Customer")).click();
        Thread.sleep(2000);

        //List< WebElement> inputAddCustomerInfo=driver.findElements(By.xpath("//div//input"));
        //System.out.println(inputAddCustomerInfo.size());

        driver.findElement(By.id("fname")).sendKeys("Batina");
        driver.findElement(By.id("lname")).sendKeys("Kulusheva");
        driver.findElement(By.id("email")).sendKeys("batinakulusheva@gmail.com");
        driver.findElement(By.xpath("//*[@name='addr']")).sendKeys("625 Breakers Point");
        driver.findElement(By.id("telephoneno")).sendKeys("2245751417");
        driver.findElement(By.name("submit")).click();

        String expectedMessage="Access Details to Guru99 Telecom";
        WebElement actual= driver.findElement(By.tagName("h1"));
        if(actual.getText().equals(expectedMessage)){
            System.out.println("Passed! New customerID was successfully added.");
        }else{
            System.out.println("FAILED");
            System.out.println("Expected message is: "+expectedMessage);
            System.out.println("Actual massage is: "+actual.getText());
        }
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        //831401
    }
}
