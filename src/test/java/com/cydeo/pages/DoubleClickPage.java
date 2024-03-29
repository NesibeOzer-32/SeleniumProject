package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {

    public DoubleClickPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@id='accept-choices']")
    public WebElement acceptCookies;

    @FindBy(id="demo")
    public WebElement textToDoubleClick;




}
