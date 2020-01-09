package com.amazon.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amazon.generic.GenericUtils;
import com.amazon.pages.AmazonLoginPage;
import com.amazon.pages.FlipkartIphoneXr64gbYellowPage;
import com.amazon.pages.FlipkartLoginPage;
import com.amazon.pages.FlipkartPriceofPhonepage;
import com.amazon.pages.iphonexr64gbyellowPage;

public class Assignment1
{

	@Test
	public void TestMethod() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		AmazonLoginPage lg=new AmazonLoginPage(driver);
		iphonexr64gbyellowPage ip=new iphonexr64gbyellowPage(driver);
		
		lg.EnterSearchItem("iphone XR(64GB)-YELLOW");
		String amazonprice=ip.priceOfPhone(driver);
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		FlipkartLoginPage flg=new FlipkartLoginPage(driver);
		FlipkartIphoneXr64gbYellowPage fip=new FlipkartIphoneXr64gbYellowPage(driver);
		flg.ClickONPopup();
		flg.EnterSearchItem("iphone XR(64GB)- yellow");
		fip.clickonPhone();
		FlipkartPriceofPhonepage ft=new FlipkartPriceofPhonepage(driver);
		String flipkartprice = ft.priceOfPhone(driver);
		Thread.sleep(3000);
		System.out.println(amazonprice);
		System.out.println(flipkartprice.substring(1));
		
		int aPrice=GenericUtils.removeCommas(amazonprice);
		int fPrice=GenericUtils.removeCommas(flipkartprice.substring(1));
		
		
		System.out.println(aPrice);
		
		System.out.println(fPrice);
		
		
		if(aPrice > fPrice)
			
		{
			System.out.println("In Amazon cost of I phone is High");
			
		}
		

		else
		{
			System.out.println("In Amazon cost of I phone is High");
		}
	
		Thread.sleep(3000);
		
		driver.close();
	
	
	}
}
