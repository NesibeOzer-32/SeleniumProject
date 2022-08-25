package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        /*
        css selector: HTML sayfasında bulunan herhangi bir elemanı (elementi) veya birden fazla elemanı
        seçerek özelliklerini değiştirmemize olanak verir. Örneğin bir başlığı seçip büyüklüğü
        ve rengini değiştirmek gibi.

        <label class="login-item-checkbox-label" for="USER_REMEMBER">
         Remember me on this computer</label>(aşağıdaki yere istenilen verileri kopyala yapıştır yapıyoruz)

         ---tagName[attribute='value']
         label[class='login-item-checkbox-label']
         inspect --- ctrl+F---arama cubuguna yapıştır
         label[for='USER_REMEMBER']
         */
        //1. Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //go to  : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3.Verify "log in" button text is expected:
        //Expected:Log in
        // normalde yaptığımız: WebElement signInButton= driver.findElement(By.className("login-btn"));
        //css selector formulu: tagName[attribute= 'value']
        //aşağıdaki cssSelector parantezi içine üstteki formulu yazacağız:
        //cssSelector(input[class= 'login-btn'])__bize daha çok opsiyon sunar:
        //opsiyon 2:cssSelector(input[value= 'Log In'])
        //opsiyon 3:cssSelector(input[type= 'submit'])
        //opsiyon 4:cssSelector(input[onclick= "BX.addClass(this, 'wait');"])
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else{
            System.out.println("Log In button text verification failed!");
        }
    }
}