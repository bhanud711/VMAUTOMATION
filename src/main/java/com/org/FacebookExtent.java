package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FacebookExtent {
public static ChromeDriver driver;
public static int i=0;
public static ExtentReports report;
public static ExtentTest test;


@BeforeSuite
public void begin()
{
	 report=new ExtentReports(".//reports//Megh.html",true);
	test=report.startTest("To verify user is able to login invalid credentials");
}
	
	@Test()
	public void fb() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rama");
		test.log(LogStatus.PASS, "Entered Username"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Krishna");
		test.log(LogStatus.PASS, "Entered Password"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//button[@name='login']")).click();
		test.log(LogStatus.PASS, "Clicked LoginButton"+test.addScreenCapture(snap()));
	
	}
	
	public String snap() throws IOException
	{ 
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
		}
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//Images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		dummy=dest.getAbsolutePath();
		return dummy;
	}
	
	@AfterSuite
	public void last()
	{
		report.endTest(test);
		report.flush();
	}
}
