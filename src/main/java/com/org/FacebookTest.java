package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

	@Test
	public void fb()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		FacebookAutomation fa=new FacebookAutomation();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rama");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//button[@name='login']")).click();	
	}
}
