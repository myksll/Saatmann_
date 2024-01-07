package com.saatmann.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Homepage {

    @FindBy(xpath="//*[@id=\"mk-fullscreen-search-input\"]")
    public WebElement sucheText;

	@FindBy(xpath="//*[@id=\"theme-page\"]/div[2]/div/div[1]/section/article[1]/h4/a")
	public WebElement firstResultTitle;







}
