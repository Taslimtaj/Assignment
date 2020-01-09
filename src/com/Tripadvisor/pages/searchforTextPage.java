package com.Tripadvisor.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchforTextPage 
{

	@FindBy(id="mainSearch")
	private WebElement SearchText;
	
	
	@FindBy(id="SEARCH_BUTTON_CONTENT")
	private WebElement Btnclick;
	
	
	public searchforTextPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Searchtextbox(String scr)
	{
		SearchText.sendKeys(scr,Keys.ENTER);
		
		 
	}
}
