package com.Tripadvisor.Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Tripadvisor.pages.ClubmahindraPage;
import com.Tripadvisor.pages.EnteredTextPage;
import com.Tripadvisor.pages.TripadSearchpage;
import com.Tripadvisor.pages.searchforTextPage;

public class Assignment2
{
	
	@Test
	public void TestMethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.tripadvisor.in/");
		
		TripadSearchpage t=new TripadSearchpage(driver);
		
		t.SearchItem();
		
		searchforTextPage a=new searchforTextPage(driver);
		
		a.Searchtextbox("Club Mahindra Madikeri, Coorg");
		
		
		ClubmahindraPage c=new ClubmahindraPage(driver);
		
		c.SearchedPage();
		
		EnteredTextPage e=new EnteredTextPage(driver);
		
		e.clickonreviewpage();
		
		driver.getWindowHandles();
		//driver.sw
		
		
		Thread.sleep(4000);
		e.clickonwrite();
		
		driver.close();
		
		
	}

	
}
