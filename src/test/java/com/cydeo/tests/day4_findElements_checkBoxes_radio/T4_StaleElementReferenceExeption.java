package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_StaleElementReferenceExeption {
    public static void main(String[] args) {
        //1-Open chrome Browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2-Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3-Locate "Cydeo" link , verify it is displayed.
        WebElement cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4-Refresh the page
        driver.navigate().refresh();
        //We are refreshing the  web element reference by re- assigning(re-locating) the web element
        cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));

        //5-Verify it is displayed , again
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
    }
}
