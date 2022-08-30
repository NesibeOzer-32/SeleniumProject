package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xPath_cssSelector_practice {
    public static void main(String[] args) {
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate homeLink using cssSelector, class value
/*
XPATH SYNTAX:
#1- //tagName[@attribute='value']
#2- //tagName[contains(@attribute, 'value')]
#3- //tagName[.='text'] same as //tagName[text()='text']
#4- //*[@attribute='value']
css syntax:
tagName[attribute='value']
tagName#idValue
 */
 */


        //Locate homeLink using cssSelector syntax #2


        //Locate homeLink using cssSelector, href value


        //b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2


        //Locate header using xpath, and using web elements text "Forgot Password"
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));


        //c. “E-mail” text


        //d. E-mail input box


        //Locate inputBox using xpath contains method

        //tagName[contains(@attribute,'value')]



        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']


        //f. “Powered by Cydeo text


        //4. Verify all web elements are displayed.
    }
}
