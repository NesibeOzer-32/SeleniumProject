package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_CRM_LOGIN extends TestBase {

    @Test
    public void crm_login_test(){

        //2-Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3-Enter valid name
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //4-Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5-Click to Log In Button
        WebElement loginButton =driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6-Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");


    }
    @Test
    public void crm_login_test2(){

        //2-Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //6-Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");


    }
    @Test
    public void crm_login_test3(){

        //2-Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk
        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

        //6-Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");


    }
}
