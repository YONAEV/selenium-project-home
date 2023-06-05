package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAtribute {

    public static void main(String[] args) {
        /*
        TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

        String expectedHeader = "Registration form";
        WebElement header = driver.findElement(By.tagName("h2"));
        String actualheader = header.getText();

        if(actualheader.equals(expectedHeader)) System.out.println("Passed");
        else System.out.println("Failed");


        WebElement firstNameInput = driver.findElement(By.className("form-control"));
        String expectedPlaceholder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        if (actualPlaceHolder.equals(expectedPlaceholder)) System.out.println("Passed");
        else System.out.println("Failed");

        driver.close();

    }
}
