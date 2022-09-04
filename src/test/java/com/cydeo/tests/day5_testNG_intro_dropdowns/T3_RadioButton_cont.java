package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {
        //1-Open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-Go to the: https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //4-Verify "Hockey" radio button is selected after clicking
        clickAndVerifyRadioButton(driver, "sport", "hockey");

        clickAndVerifyRadioButton(driver,"sport","football");

        clickAndVerifyRadioButton(driver,"color","yellow");









    }

    private static void clickAndVerifyRadioButton(WebDriver driver,
                                                  String nameAttribute, String idValue){
        List<WebElement> radioButtons= driver.findElements(By.name(nameAttribute));

        //Loop through the list of WebElement and select matching result "hockey"
        for (WebElement each: radioButtons) {
            String eachID = each.getAttribute("id");

            System.out.println("eachID = "+ eachID);
            if(eachID.equals(idValue)){
                each.click();
                System.out.println(eachID +" is selected : " + each.isSelected());
                break;
            }

        }

    }
}

