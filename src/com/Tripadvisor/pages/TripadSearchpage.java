package com.Tripadvisor.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripadSearchpage
{
	@FindBy(xpath="//span[@class='ui_icon search brand-global-nav-action-search-Search__icon--2DVjd']")
	private WebElement searchTB;
	
	

	public TripadSearchpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void SearchItem() throws InterruptedException
	{
		searchTB.click();
		Thread.sleep(2000);
		
		
	}
	


}
