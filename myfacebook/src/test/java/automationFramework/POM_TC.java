package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageobjects.Home_page;
import pageobjects.Signup_page;

public class POM_TC {
	private static WebDriver driver=null;
	@BeforeTest
	public void beforetest(){

		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		String baseUrl = "http://facebook.com/";
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		driver.manage().window().maximize(); 

	}

	@Test
	public void run() {
		Signup_page.textbox_Email(driver).sendKeys("yeasminalam19@gmail.com");
		Signup_page.textbox_Password(driver).sendKeys("jahangir1");
		Signup_page.button_login(driver).click();
        Home_page.link_findfriends(driver);
	} 
	@AfterTest  

	public void aftertest(){
		driver.close();

	}
}

