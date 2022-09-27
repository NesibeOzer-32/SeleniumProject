package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void t1_double_Click_Test(){

        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //Click Accept cookies button
        //WebElement acceptCookiesbtn= Driver.getDriver().findElement(By.xpath("//div[@id='accept-choices']"));
        //acceptCookiesbtn.click();
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions= new Actions(Driver.getDriver());
        doubleClickPage.acceptCookies.click();

        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”
        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();


        //4. Assert: Text’s “style” attribute value contains “red”.
        System.out.println("doubleClickPage.textToDoubleClick.getAttribute(\"style\") = "
                + doubleClickPage.textToDoubleClick.getAttribute("style"));

        String actualStyleAttributeValue=doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedStyleAttributeValue="red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedStyleAttributeValue));

    }
}
