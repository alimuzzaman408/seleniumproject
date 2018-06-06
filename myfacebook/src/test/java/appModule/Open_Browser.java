package appModule;

import org.openqa.selenium.WebDriver;

public class Open_Browser {
	public static void load_Facebook(WebDriver driver,String BaseUrl){
		driver.manage().deleteAllCookies();
		driver.get(BaseUrl);
		driver.manage().deleteAllCookies();
	}

}
