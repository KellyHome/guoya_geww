package com.guoya;

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
		username.sendKeys("guoyasoft");
	}

	@Test
	public void testPassword() {
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("123456");
	}

	@Test
	public void testSubmit() throws InterruptedException {
		WebElement submit = driver.findElement(By
				.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
	}

	@Test
	public void testResult() {
		String result = driver.getPageSource();
		boolean isSuccess = true;

		if (result.contains("success")) {

			System.out.println(isSuccess);
		}
	}

}
