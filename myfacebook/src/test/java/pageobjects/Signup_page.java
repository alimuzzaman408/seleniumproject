package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup_page {
	private static WebElement element=null;
	
	public static WebElement textbox_Email(WebDriver driver){
		element= driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement textbox_Password(WebDriver driver){
		element= driver.findElement(By.id("pass"));
		return element;
	}
	public static WebElement button_login(WebDriver driver){
		element= driver.findElement(By.id("u_0_2"));
		return element;
	}
public static void Waitforelement(WebDriver driver){
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='u_0_b']/a")));
}
}
