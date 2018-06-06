package com.monster.jobsearch;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class monsterjobsearch {
	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:/WebDriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseUrl="https://www.monster.com/";
	    driver.manage().deleteAllCookies();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       
        
		String expectedTitle="Monster Jobs - Job Search, Career Advice & Hiring Resources | Monster.com";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

		driver.findElement(By.xpath(".//*/div/nav/div/ul/li/a[contains(text(),'Find Jobs')][@class='dropdown-toggle']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath(".//div/nav/div/ul/li/ul/li/a[text()='Advanced Search']"))	.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean textpresent=driver.findElement(By.xpath(" .//*[@id='jsr']/div/div/div/div/div/h1[contains(text(),'Advanced Job Search')]")).isDisplayed();
		Assert.assertTrue(textpresent);

		driver.findElement(By.xpath(".//*[@name='txJobTitle_0']")).sendKeys("IT");
		driver.findElement(By.xpath(".//*[@id='advLocation']")).sendKeys("Orlando, Florida");

		driver.findElement(By.xpath(".//*[@id='submitButton']")).click();

		//boolean jobSearchResult= driver.findElement(By.xpath(".//*[@id='main']/div[1]/h1[contains(text(),' I.T Jobs in Orlando, Florida')]")).isDisplayed();
		//Verify.verify(jobSearchResult);	

       driver.quit();


	}
}
