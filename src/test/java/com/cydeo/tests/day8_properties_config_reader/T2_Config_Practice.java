package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
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
    /* public WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        //We are getting the browserType dynamically from our configuration.properties file
       String BrowserType= ConfigurationReader.getProperty("browser");

        driver= WebDriverFactory.getDriver(BrowserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }*/
    @Test
    public void google_search_test(){
        //Use Driver Util
        //1. Go to : "https://practice.cydeo.com/web-tables"
        Driver.getDriver().get("https://www.google.com");

        //3-Write "apple" in search box
        WebElement googleSearchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        Driver.getDriver().findElement(By.id("W0wltc")).click();
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        //4-Verify Title
        //Expected : "apple - Google Zoeken"
        String expectedTitle= ConfigurationReader.getProperty("searchValue")+" - Google Zoeken";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        }

}
