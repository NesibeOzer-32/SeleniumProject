package com.cydeo.tests.day6_allerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_WindowsHandle_Practice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setUpMethod() throws InterruptedException {
        //1.Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }
    
    @Test
    public void multiple_Window_Test() throws InterruptedException {
        
        //Storing the main pages window handle as string is
        //good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4.Assert: Title is "Windows"
        String expectedTitle="Windows";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        System.out.println("Title before click: " + actualTitle);

        //5.Click to "Click Here" link
        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        Thread.sleep(1000);
        clickHereLink.click();



        //6.Switch to new Window
        for (String each: driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }
        //7.Assert: Title is "New Window"

        String expectedTitleAfterClick= "New Window";
        actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);

        actualTitle=driver.getTitle();
        System.out.println("Title after click: " + expectedTitle);

    }
}
