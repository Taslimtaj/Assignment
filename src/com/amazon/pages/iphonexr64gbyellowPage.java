package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iphonexr64gbyellowPage 
{

	@FindBy(xpath="//span[text()='Apple iPhone XR (64GB) - Yellow']/../../../../../../..//span[@class='a-price-whole']")
	private WebElement price;
	
	public iphonexr64gbyellowPage(WebDriver driver)
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
