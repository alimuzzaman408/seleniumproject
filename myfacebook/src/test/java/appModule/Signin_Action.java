package appModule;

import org.openqa.selenium.WebDriver;

import pageobjects.Signup_page;
import utility.Constant;
import utility.ExcelUtils;

public class Signin_Action {
	public static void Execute(WebDriver driver) throws Exception{
		
		String UserName = ExcelUtils.GetCellData(Constant.Path_TestData, "Sheet1", 1, 1);
		System.out.println("User Name: "+UserName);
		String PassWord = ExcelUtils.GetCellData(Constant.Path_TestData, "Sheet1", 1, 2);
		System.out.println("Password: "+PassWord);
		Signup_page.textbox_Email(driver).sendKeys(UserName);
		Signup_page.textbox_Password(driver).sendKeys(PassWord);
		Signup_page.button_login(driver).click();
	}

}
