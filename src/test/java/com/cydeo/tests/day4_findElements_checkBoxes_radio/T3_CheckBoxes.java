package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_CheckBoxes {
    public static void main(String[] args) {
        //1.Go to the: https://practice.cydeo.com/checkboxes
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");
        //We have to locate checkboxes
        WebElement checkbox1= driver.findElement(By.xpath(""));
        WebElement checkbox2= driver.findElement(By.xpath(""));
        //2.Confirm checkbox #1 is NOT selected by default
        //3.Confirm checkbox #2 is selected by default
        //4.Click checkbox #1 to select it.
        //5.Click checkbox #2 to deselect it.
        //6.Confirm checkbox #1 is selected
        //7.Confirm checkbox #2 is NOT selected
    }
}
