package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='swapCheckbox()']")
    public WebElement removeButton;

    @FindBy(xpath = "//img[@src='/img/ajax-loader.gif']")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@id='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement message;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputBox;


}
