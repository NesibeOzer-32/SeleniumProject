package com.cydeo.tests.day6_allerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1.Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


    }


    @Test
    public void dropdown_task5() throws InterruptedException {

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
    @Test
    public void dropdown_task6(){
        //Select "December 1, 1923" and verify it is selected

        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown= new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Selected year using : visible text
        yearDropdown.selectByVisibleText("1923");

        //Select month using : value attribute
        monthDropdown.selectByValue("11");

        //SElect day using : index number
        dayDropdown.selectByIndex(0);

        //creating expected values
        String expectedYear= "1923";
        String expectedMonth= "December";
        String expectedDay= "1";

        //creating actual values
        String actualYear= yearDropdown.getFirstSelectedOption().getText();
        String actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String actualDay=dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);

    }

    @AfterMethod
    public  void teardownMethod(){
        driver.close();
    }

}
