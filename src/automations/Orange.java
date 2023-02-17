package automations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Orange {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        // How to change from Set to List?
        List<String> listWindows = new ArrayList<>(windowHandles);

        System.out.println(windowHandles.size());

        for (String id: windowHandles){
            if (!id.equals(mainWindow)){
                driver.switchTo().window(id);
            }
        }

        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(mainWindow);

        // Usu

        for (String id: windowHandles){
            driver.switchTo().window(id);
            if (driver.getTitle().equals("Google")){
                break;
            }
        }
        driver.switchTo().window(mainWindow);

    }
}
