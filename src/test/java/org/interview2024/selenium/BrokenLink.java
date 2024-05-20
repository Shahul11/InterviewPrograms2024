package org.interview2024.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//source https://www.youtube.com/watch?v=jBa9VaCflAw&ab_channel=NaveenAutomationLabs
public class BrokenLink {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("Link Size is: ---->" + link.size());

        List<String> urlList = new ArrayList<String>();
        for (WebElement e : link) {

            String singleUrl = e.getAttribute("href");
            if (singleUrl != null && !singleUrl.isEmpty() && !singleUrl.startsWith("javascript:")) {
                urlList.add(singleUrl);
                //brokenLink(singleUrl);
            }
            urlList.parallelStream().forEach(ee -> brokenLink(ee));
        }

        driver.quit();
    }


    public static void brokenLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setRequestMethod("HEAD");
            if (httpUrlConnection.getResponseCode() >= 400) {
                System.out.println(linkUrl + "-------->" + httpUrlConnection.getResponseMessage() + " is a broken link");
            } else {
                System.out.println(linkUrl + "----------->" + httpUrlConnection.getResponseMessage() + " is a working link");
            }
            httpUrlConnection.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
