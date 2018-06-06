package com.google.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	public void f() {

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\shapan\\eclipse\\java-neon\\FirefoxDriver\\geckodriver.exe");
		//	WebDriver driver=new FirefoxDriver();

		ChromeDriverManager.getInstance().setup();
		 driver=new ChromeDriver();

		//String baseURL="https://www.facebook.com/";

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String expectedTitle="Facebook - Log In or Sign Up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);



		boolean text=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/h2")).isDisplayed();
		Assert.assertTrue(text);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("yeasminalam19@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("jahangir1");
		driver.findElement(By.xpath("//input[@id='u_0_3']"));

		

		driver.quit();

	}
}
