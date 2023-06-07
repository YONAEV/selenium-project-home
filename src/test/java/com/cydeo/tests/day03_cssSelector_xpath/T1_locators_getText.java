package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {


//        TC #1: NextBaseCRM, locators and getText() practice
//1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


//2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//3- Enter incorrect username: “incorrect”
        WebElement loginInput = driver.findElement(By.className("login-inp"));
        loginInput.sendKeys("incorrect");
//4- Enter incorrect password: “incorrect”
        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");
//5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
//6- Verify error message text is as expected:
        String expectedErrortext = "Incorrect login or password";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();
        if (actualErrorText.equals(expectedErrortext)) System.out.println("passed");
        else System.out.println("failed");
        driver.close();


//Expected: Incorrect login or password
//
//PS: Inspect and decide which locator you should be using to locate web
//elements.



    }

}
