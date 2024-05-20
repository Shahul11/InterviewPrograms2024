package org.interview2024.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

// Why JavscriptExecutor(Driver) is casted why not ChromeDriver

public class ScreenShot {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
        driver.get("https://google.com");  // Here the Webdriver interface Get method is called
        // internally it will call the Remote Webdriver Class Get method where interface get method is
        //implemented

     //   driver1.get("https://google.com");// Here the Webdriver interface Get method is NOT called
        // internally it will call the Remote Webdriver Class Get method is called


        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("");

        TakesScreenshot ts= (TakesScreenshot) driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("./ScrenShots/Image1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
