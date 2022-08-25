package com.cydeo.tests.MyPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pinterest2 {
    public static void main(String[] args) {
        //1.Open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.go to the pinterst
        driver.get("https://www.pinterest.com/");
        //3.Identify and save the Blog link element on the top
        WebElement blogLink= driver.findElement(By.linkText("Blog"));
        //4.Click on the link
        blogLink.click();
        //Stop code execution for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //5.close the browser
        driver.quit();
    }
}
