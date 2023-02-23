package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StudyMate {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://codewise.studymate.us");

        driver.findElement(By.name("email")).sendKeys("studymate@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123123" + Keys.ENTER);
    }
}
