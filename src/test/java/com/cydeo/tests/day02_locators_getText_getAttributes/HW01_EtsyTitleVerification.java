package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01_EtsyTitleVerification {

    public static void main(String[] args) {
        /*
        HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebElement searchBar = driver.findElement(By.name("search_query"));
        searchBar.sendKeys("wooden spoon"+ Keys.ENTER);
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) System.out.println("Passed");
        else System.out.println("Failed");
        driver.close();



    }

}
