package com.cydeo.tests.day6_allerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
        //1.Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alert_test1() throws InterruptedException {

        //3.Click to "Click for JS Alert" button
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();
        Thread.sleep(1000);

        //To be able to click to Alert OK button we need to switch driver's focus to Alert itself
        Alert alert= driver.switchTo().alert();

        //4.Click to OK button from the alert
        Thread.sleep(2000);
        alert.accept();

        //5.Verify "You successfully clicked an alert" text displayed.
        WebElement resultTexT= driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed"
        Assert.assertTrue(resultTexT.isDisplayed(),"Result text is NOT displayed");

        String expectedText= "You successfully clicked an alert";
        String actualText= resultTexT.getText();

        Assert.assertEquals(actualText,expectedText,"Actual result test is not as expected!!!");

    }


}
