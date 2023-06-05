package com.cydeo.tests.day_01_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        //set up web driver
        WebDriverManager.chromedriver().setup();
        //create instance of Chrome driver
        WebDriver driver = new ChromeDriver();
        //go to tesla.com
        driver.get("https://www.tesla.com");
        System.out.println(driver.getCurrentUrl());
        //go back
        driver.navigate().back();
        //stop execution for 3 seconds
        Thread.sleep(1000);
        //go forward
        driver.navigate().forward();
        //wait 3 second
        Thread.sleep(1000);
        //refresh
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");
        //get title of the page
        System.out.println(driver.getTitle());
        //will maximize the currently open driver
        driver.manage().window().maximize();
        //closes only the one focused tab/window
        driver.close();
        //closes all open browsers
        driver.quit();




    }

}
