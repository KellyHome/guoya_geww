package com.guoyasoft;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/myself/programfile/selenium/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(2000);
		
		WebElement keyword=driver.findElement(By.id("kw"));
		keyword.sendKeys("果芽软件");
		

		Thread.sleep(2000);
		
		WebElement address=driver.findElement(By.xpath("//div[@id='content_left']//h3[@class='t c-gap-bottom-small']/a"));
		address.click();
		
		boolean isSuccess=driver.getPageSource().contains("吴令");
		System.out.println(isSuccess);
		
		driver.quit();
		
	}

}
