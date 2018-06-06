package automationFramework;

import org.testng.annotations.Test;

import appModule.Open_Browser;
import appModule.Signin_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import utility.Constant;
import utility.ExcelUtils;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Module_TC {
	
	private static WebDriver driver=null;
	
	
  @BeforeTest
  public void beforeTest() {
	ChromeDriverManager.getInstance().setup();  
	  driver=new ChromeDriver();
	  Open_Browser.load_Facebook(driver, Constant.URL);
  }
  @Test
  public void run() throws Exception {
	Signin_Action.Execute(driver);  
	  
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	driver.quit();  
	  ExcelUtils.SetCellData(Constant.Path_TestData, "Sheet1", 1, 3, "Pass");
	  
	  
  }

}
