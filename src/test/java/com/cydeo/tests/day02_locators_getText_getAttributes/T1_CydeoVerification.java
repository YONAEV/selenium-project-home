package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        String expectedInURL= "cydeo";
        String actualUrl= driver.getCurrentUrl();
       // if (driver.getCurrentUrl().contains("cydeo")) System.out.println(true);
        if (actualUrl.contains(expectedInURL)) System.out.println(true);
        else System.out.println(false);
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();
        //if (driver.getTitle().equals("Practice")) System.out.println(true);
        if (actualTitle.equals(expectedTitle)) System.out.println(true);
        else System.out.println(false);
        driver.close();

    }
}
