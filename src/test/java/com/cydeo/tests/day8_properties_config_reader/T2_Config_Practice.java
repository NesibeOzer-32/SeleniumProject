package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Config_Practice {
    public WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to : "https://practice.cydeo.com/web-tables"
        driver.get("https://www.google.com");

    }
    @Test
    public void google_search_test(){
        //3-Write "apple" in search box
        WebElement googleSearchBox=driver.findElement(By.xpath("//input[@name='q']"));
        driver.findElement(By.id("W0wltc")).click();
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //4-Verify Title
        //Expected : "apple - Google Search"
        String expectedTitle= "apple - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
