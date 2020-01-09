package com.Tripadvisor.Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Tripadvisor.pages.ClubmahindraPage;
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
		
		a.Searchtextbox("Club Mahindra.");
		
		List<WebElement> allsugge = driver.findElements(By.cssSelector("div[docid='1156207'] span"));
		int count = allsugge.size();
		
		System.out.println("count is "+count);
		for(WebElement link :allsugge)
		{
			System.out.println(link);
		}
		
		
		ClubmahindraPage c=new ClubmahindraPage(driver);
		
		c.SearchedPage();
		
		driver.close();
		
		
	}

	
}
