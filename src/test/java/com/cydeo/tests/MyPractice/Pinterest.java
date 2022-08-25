package com.cydeo.tests.MyPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pinterest {
    public static void main(String[] args) {
        //1.Open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.go to the pinterst
        driver.get("https://www.pinterest.com/");
        //3.Identify and save the about link element on the top
       WebElement aboutLink= driver.findElement(By.linkText("About"));
       //4.Click on the link
        aboutLink.click();
        //5.close the browser
        driver.quit();



    }
}
