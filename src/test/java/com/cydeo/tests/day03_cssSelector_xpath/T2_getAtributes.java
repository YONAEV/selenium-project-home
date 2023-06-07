package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class T2_getAtributes {
    public static void main(String[] args) {
//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        String expectedLable = "Remember me on this computer";
        String actualLable = driver.findElement(By.tagName("label")).getText();

        if(actualLable.equals(expectedLable)) System.out.println("Verification for Label passed");
        else System.out.println("Verification for label failed");
//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?
        String expectedLinkText = "FORGOT YOUR PASSWORD?";
        WebElement forgotPass = driver.findElement(By.className("login-link-forgot-pass"));
        String actualLinkText = forgotPass.getText();
        if (actualLinkText.equals(expectedLinkText)) System.out.println("Passed");
        else System.out.println("Failed");

//                5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String expectedAttribute="forgot_password=yes";
        String actualAttribute = forgotPass.getAttribute("href");
        if (actualAttribute.equals(expectedAttribute)) System.out.println("Attribute passed");
        else {
            System.out.println("Attribute failed");
            System.out.println(actualAttribute);
            System.out.println(expectedAttribute);

        }
            //
//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
        driver.close();


    }
}
