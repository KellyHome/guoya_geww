package com.guoyasoft;

import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase_selenium {
	
	WebDriver driver;
	@Test
	public  void testcase_selenium () {		
		
		System.setProperty("webdriver.chrome.driver", "D:/myself/programfile/selenium/chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement keyword=driver.findElement(By.id("kw"));
		keyword.sendKeys("果芽软件");
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement address=driver.findElement(By.xpath("//div[@id='content_left']//h3[@class='t c-gap-bottom-small']/a"));
		address.click();
		
		boolean result=driver.getPageSource().contains("吴令");
		Assert.assertEquals(true, result);
		driver.quit();
		
	}

}
