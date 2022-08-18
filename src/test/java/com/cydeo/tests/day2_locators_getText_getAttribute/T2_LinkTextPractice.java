package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        //TC #2: Back and forth navigation
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2-Go to : https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3-Click to A/B testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink= driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //4-Verify title is:
        //Expected. No A/B test
        String expectedTitle= "A/B Testing";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAİLED!");
        }

        //5-Go back to home page by using the back()
        driver.navigate().back();

        //6-verify title equals
        String expectedTitle2="Practice";
        actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle2)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAİLED!");
        }



    }
}
