package com.facebook.loginTests;
import com.facebook.base.BaseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.loginPages.LoginPage;
import com.facebook.utilities.PropertiesReader;

public class LoginTest extends BaseTest{
	LoginPage loginPage;
	PropertiesReader propertiesReader;
	@BeforeMethod
	public void openFacebook() {
		openApp();
	}
	@Test
	public void loginTest() {
		propertiesReader=new PropertiesReader()	;
		loginPage=new LoginPage(driver);
		loginPage.userNameMethod(propertiesReader.getUserName());
		loginPage.passWordMethod(propertiesReader.getPassword());
	loginPage.logingButton();
			
	}
	@Test
	public void loginTest1() {
		propertiesReader= new PropertiesReader();
		loginPage= new LoginPage(driver);
		loginPage.userNameMethod(propertiesReader.getUserName());
		loginPage.passWordMethod(propertiesReader.getPassword());
		loginPage.logingButton();
		
	}
	@AfterMethod
		public void closeFacebook() {
		closeApp();
	}
	

}
