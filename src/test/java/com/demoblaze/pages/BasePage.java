package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement home;
    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cart;

    @FindBy(css = ".hrefch")
    public List<WebElement> products;

}