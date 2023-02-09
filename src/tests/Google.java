package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Google {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/esen/Desktop/selenium resources/chromedriver");

        WebDriver chrome = new ChromeDriver();

        chrome.get("https://www.google.com/");

//        chrome.manage().window().fullscreen();
//
//        //chrome.manage().window().maximize();
//
//        chrome.navigate().to("https://amazon.com");
//        chrome.navigate().refresh();
//        chrome.navigate().back();
//        chrome.quit();

    }

}
