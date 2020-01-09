package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartPriceofPhonepage 
{
	

	@FindBy(xpath="//div[@class='_1vC4OE _3qQ9m1']")
	private WebElement price;
	
	public FlipkartPriceofPhonepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String priceOfPhone(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(price));
		String priceText = price.getText();
		return priceText;
	}
	
	
	
}
