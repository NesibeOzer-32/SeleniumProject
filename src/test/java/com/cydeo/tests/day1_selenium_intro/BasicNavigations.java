package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the selenium Web driver
        //This is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        //3-Go to "https:www.tesla.com"
        driver.get("https:www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use selenium to Refresh the page
        driver.navigate().refresh();

        //use navigate().to();
        driver.navigate().to("https://www.google.com");
        
        //ger the current title after the google page
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        //get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        //Get the current URL using selenium
        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);



    }
}
