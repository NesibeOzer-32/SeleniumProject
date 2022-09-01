package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        //1.Open a Chrome Browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3.Verify "Reset password" button text is a expected:
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        //Expected: Reset password
        String expectedResetPassword = "Reset password";
        String actualResetPassword=resetPasswordButton.getText();

        System.out.println("expectedResetPassword = " + expectedResetPassword);
        System.out.println("actualResetPassword = " + actualResetPassword);
        if (actualResetPassword.equals(expectedResetPassword)){
            System.out.println("Reset password button text verification passed!");
        }else{
            System.out.println("Reset password button text verification failed!");
        }
    }
}
