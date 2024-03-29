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
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate homeLink using cssSelector, class value("tagName[attribute='value']" )
        WebElement homeLinkEx1 = driver.findElement(By.className("a[class='nav-link']"));

        //Locate homeLink using cssSelector syntax #2(tagName.classValue)
        WebElement homeLinkEx2 = driver.findElement(By.className("a.nav-link"));

        //Locate homeLink using cssSelector, href value - tagName[attribute='value']
        WebElement homeLinkEx3 = driver.findElement(By.className("a[href='/']"));

        //b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2
        WebElement headerEx1 = driver.findElement(By.cssSelector("div.example>h2"));

        //Locate header using xpath, and using web elements text "Forgot Password"
        //WebElement header_ex2 = driver.findElement(By.xpath("//h2[.()='Forgot Password']"));(text = " . ")
        WebElement headerEx2= driver.findElement(By.cssSelector("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@type='text']"));

        //Locate inputBox using xpath contains method(tagName[contains(@attribute,'value')])
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement PoweredByCydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLinkEx1.isDisplayed() = " + homeLinkEx1.isDisplayed());
        System.out.println("headerEx1.isDisplayed() = " + headerEx1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("PoweredByCydeoText.isDisplayed() = " + PoweredByCydeoText.isDisplayed());
    }
}
