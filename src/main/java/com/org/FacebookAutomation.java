package com.org;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {
	public static ChromeDriver driver;
	public static int i=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
driver=new ChromeDriver();
FacebookAutomation fa=new FacebookAutomation();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rama");
fa.snap();
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Krishna");
fa.snap();
driver.findElement(By.xpath("//button[@name='login']")).click();
fa.snap();
	}

	
	public void snap() throws IOException
	{ 
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		}
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//Images//pic"+i+".png");
		FileUtils.copyFile(src, dest);
	}
}
