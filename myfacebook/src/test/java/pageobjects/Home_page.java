package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {
	private static WebElement element=null;
	public static WebElement link_findfriends(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='findFriendsNav'][text()='Find Friends']"));
		return element;
	}
	
	

}
