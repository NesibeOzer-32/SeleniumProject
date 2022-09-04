package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) throws InterruptedException {
        //1-Open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-Go to : https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3-Click to add elements button
        WebElement addElementsBtn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(2000);
        addElementsBtn.click();

        //4-Verify "Delete" button is displayed after clicking
        WebElement deleteBtn= driver.findElement(By.xpath("//div[@id='elements']"));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

        //5-Click to "Delete" button
        deleteBtn.click();

        //6-Verify "Delete" button is NOT displayed after clicking

        try{
                 System.out.println("deleteBtn.isDisplayed() = "+ deleteBtn.isDisplayed());
        }catch (StaleElementReferenceException e){
                 System.out.println("--> StaleElementReferenceException exception is thrown");
                 System.out.println("--> This means the web element is completely deleted from the page ");
                 System.out.println("--> deleteBtn.isDisplayed() = false");

        }

        //deleteBtn= driver.findElement(By.xpath("//div[@id='elements']"));

        driver.close();
    }
}
//USE XPATH LOCATOR FOR ALL WEB ELEMENT LOCATORS