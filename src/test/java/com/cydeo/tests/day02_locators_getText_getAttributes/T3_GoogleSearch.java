package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        /*

       TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        //find google search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+Keys.ENTER);
     //   googleSearchBox.sendKeys(Keys.ENTER);

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedInTitle)) System.out.println("Passed");
        else System.out.println("Failed");
        driver.close();



    }

}
