package com.cydeo.tests.day11_Driver_Close_Actions_Jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {
    @Test
    public void task_4_and_5_Test(){

        //1-Open a Chrome Browser
        //2-Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3-Scroll down to "Powered by Cydeo"
        //create object of action and pass our "driver" instance
        Actions actions= new Actions(Driver.getDriver());

        //locating cydeo link to be able to pass in the actions method
        WebElement cydeoLinkBottom = Driver.getDriver().findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        //4-Scroll using Actions class "moveTo(element)" method
        actions.moveToElement(cydeoLinkBottom).perform();

        //3-Scroll back up to "Home" link using PageUP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();


    }
}
