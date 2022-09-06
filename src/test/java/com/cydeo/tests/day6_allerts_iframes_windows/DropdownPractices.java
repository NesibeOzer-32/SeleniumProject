package com.cydeo.tests.day6_allerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void dropdown_task5() throws InterruptedException {
        //1.Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //We located the dropdown and şt şs ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //2.Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //3.Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //4.Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //Verify final selected options is California
        String expectedOptionalText = "California";
        String actualOptionalText= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionalText,expectedOptionalText);

        //Use all Select options . (visible text, value, index)


    }


}
