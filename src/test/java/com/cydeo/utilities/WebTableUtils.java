package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderDate(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[3]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    /*public static String returnOrderDate2(WebDriver driver,String customerName){

        return driver.findElement(By.xpath("//td[.='" + customerName + "']/following-sibling::td[3]));.getText()";
    }*/

    public static String returnOrderAmount(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[2]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderPizzaType(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[1]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderStreet(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[4]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderCity(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[5]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderState(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[6]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderZip(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[7]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderCard(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[8]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderCardNumber(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[9]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }
    public static String returnOrderExp(WebDriver driver,String customerName){

        String locator="//td[.='" + customerName + "']/following-sibling::td[10]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        return customerDateCell.getText();
    }


    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String customerName
    //• Arg3: String expectedOrderDate
    //This method should accept above-mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver,String customerName, String expectedOrderDate){

        String locator="//td[.='" + customerName + "']/following-sibling::td[3]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        String actualOrderDate= customerDateCell.getText();
        Assert.assertEquals(actualOrderDate,expectedOrderDate);
    }


}
