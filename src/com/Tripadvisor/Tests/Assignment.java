package com.Tripadvisor.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Tripadvisor.Generic.windowUtility;

public class Assignment
{
	@Test
	public void TestMethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		
		ChromeOptions cp= new ChromeOptions();
		
		cp.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(cp);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.tripadvisor.in");
		
		driver.findElement(By.xpath("//div[@title='Search']")).click();
		
		driver.findElement(By.id("mainSearch")).sendKeys("Club Mahindra");
		
		
		driver.findElement(By.xpath("//ul[@class='resultContainer local']//li[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Write a review']")).click();
		
		System.out.println("passs......");
		
		Thread.sleep(3000);
		
		windowUtility.switchWindow(driver, " Write a review - TripAdvisor ");
		
		System.out.println("passs......");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("bubble_rating"))).click().perform();
		
		//new Select(driver.findElement(By.id("qid10"))).selectByVisibleText("5");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("Nice Experience");
		
		Thread.sleep(3000);
		
		WebElement a = driver.findElement(By.xpath("//input[@id='noFraud']"));
	
		a.click();
		
		Thread.sleep(3000);
		
		boolean checked = a.isSelected();
		
		Thread.sleep(3000);
		
		System.out.println("is checkbox selected"+checked);
		
		Thread.sleep(3000);
		
			
		 WebElement btn = driver.findElement(By.xpath("//div[@id='SUBMIT']"));
		
		 btn.click();;
		
		 driver.close();
		
	}

}


