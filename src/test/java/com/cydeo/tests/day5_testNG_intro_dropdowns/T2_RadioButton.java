package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //1-Open chrome Browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-Go to the: https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3-Click to hockey button
        WebElement hokeyBtn= driver.findElement(By.xpath("//input[@id='hockey']"));

        Thread.sleep(2000);
        hokeyBtn.click();

        //4-Verify "Hockey" radio button is selected after clicking
        //System.out.println("hokeyBtn.isSelected() = " + hokeyBtn.isSelected());
        if (hokeyBtn.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        }else {
            System.err.println("Button is not selected. Verification FAİLED!!!");
        }

    }
}
