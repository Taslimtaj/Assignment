package com.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage 
{
	@FindBy(name="q")
	private WebElement searchTB;
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement popup;
	
	public FlipkartLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}

	
	public void EnterSearchItem(String SearchText)
	{
		searchTB.sendKeys(SearchText,Keys.ENTER);
	}
	
	
	public void ClickONPopup()
	{
		popup.click();
	}
}
