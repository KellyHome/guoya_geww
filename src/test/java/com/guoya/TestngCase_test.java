package com.guoya;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestngCase_test {
	WebDriver driver;

	@BeforeClass
	public void openChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/myself/programfile/selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/guoya_geww/MyHtml.html");
		Thread.sleep(2000);
	}

	@AfterClass
	public void quitChrome() {
		driver.quit();
	}

	@Test
	public void testLogin() {
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("username");

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("12345678");

		WebElement submit = driver.findElement(By
				.xpath("//input[@type='submit']"));
		submit.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean result = driver.getPageSource().contains("SUCCESS");

		Assert.assertEquals(true, result);
		driver.quit();

	}

}
