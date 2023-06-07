package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW_xpath_practice {
    public static void main(String[] args) {
//        HWP #4: Practice Cydeo – xpath locator practice
//        1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/inputs

        driver.get("https://practice.cydeo.com/inputs");

//        3- Click to “Home” link

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        homeLink.click();

//        4- Verify title is as expected:
//        Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) System.out.println("passed");
        else System.out.println("failed");
        driver.close();
//        PS: Locate “Home” link using “xpath” locator
    }
}
