package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		/*WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		button1.click();
		Alert at = driver.switchTo().alert();
		at.accept();
		WebElement button3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		button3.click();
		at.accept(); */
		
		
		Thread.sleep(5000);
		WebElement button4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		button4.click();
		Alert at = driver.switchTo().alert();
		at.sendKeys("Ram");
		at.accept();
	}

}
