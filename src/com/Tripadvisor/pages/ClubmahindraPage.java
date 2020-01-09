package com.Tripadvisor.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClubmahindraPage 
{
	@FindBy(css="div[docid='1156207'] span")
	private WebElement EnterTxt;
	
	public ClubmahindraPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SearchedPage()
	{
		EnterTxt.sendKeys(Keys.ARROW_DOWN);
		EnterTxt.click();
		
		
		
	}

}
