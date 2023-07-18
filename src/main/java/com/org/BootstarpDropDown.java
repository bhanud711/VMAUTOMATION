package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstarpDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement button = driver.findElement(By.xpath("//button[@id='menu1']"));
button.click();
List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
for(WebElement each:all)
{
	System.out.println(each.getText());
	if(each.getText().equals("JavaScript"))
	{
		each.click();
	}
}
	}

}
