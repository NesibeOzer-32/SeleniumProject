package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.Watchable;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {
    public static void main(String[] args) {
        //1.Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2.Go to the: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3.locate all the links in the page;
        //windows: alt+ Enter--> pres Enter again
        //mac    : option + Enter--> pres Enter again
        List<WebElement>allLinks= driver.findElements(By.tagName("a"));

        //4.Print out the number of the links on the page
        System.out.println("allLinks.size() = " + allLinks.size());

        //5.Print out the text of the links
        //6.Print out the Href attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Text of Link: " + each.getText());
            System.out.println("HREF values : " + each.getAttribute("href"));
        }

        //Break: 2.02PM
    }
}
