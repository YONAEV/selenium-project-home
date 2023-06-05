package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackAndForth {
    public static void main(String[] args) {

        /*
        TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        driver.findElement(By.linkText("Gmail")).click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) System.out.println("Passed");
        else System.out.println("Failed");
        driver.navigate().back();
        actualTitle = driver.getTitle();
        expectedTitle = "Google";
        if (actualTitle.equals(expectedTitle)) System.out.println("Passed");
        else System.out.println("Failed");

        driver.close();



    }
}
