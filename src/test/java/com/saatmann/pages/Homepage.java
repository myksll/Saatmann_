package com.saatmann.pages;

import com.saatmann.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Homepage {


    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"BorlabsCookieBox\"]/div/div/div/div[1]/div/div/div[2]/p[1]/a")
    public WebElement cookie;

    @FindBy(xpath="//*[@id=\"menu-item-43\"]/a")
    public WebElement sucheButton;





}
