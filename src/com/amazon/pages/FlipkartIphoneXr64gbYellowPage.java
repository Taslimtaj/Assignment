package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartIphoneXr64gbYellowPage
{
	@FindBy(xpath="//div[text()='Apple iPhone XR (Yellow, 64 GB)']")
	private WebElement ph;
	
	
	
	public FlipkartIphoneXr64gbYellowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonPhone()
	{
		ph.click();
	}

	
	
}
