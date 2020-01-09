package com.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage 
{
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searcTB;
	
	public AmazonLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterSearchItem(String SearchText)
	{
		searcTB.sendKeys(SearchText, Keys.ENTER);
	}

}
