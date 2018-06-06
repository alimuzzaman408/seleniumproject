package com.javacodegeeks.testng.maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGWebDriver {

	@Test(priority=1)
	public void VerifyHomePageTitle() {
		System.setProperty("webdriver.gecko.driver", "C:/WebDriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//String baseUrl="http://www.dice.com/";
		driver.get("http://www.dice.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String Expectedtiltle="Job Search for Technology Professionals | Dice.com";
		String Actualtitle=driver.getTitle();
		Assert.assertEquals(Expectedtiltle,Actualtitle);




		driver.quit();
	} 


}