package com.facebook.registrationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.registrationPages.Registrationpage;
import com.facebook.utilities.ExcelReader;

public class RegistrationTest extends BaseTest {
	Registrationpage regPage;
	ExcelReader exReader;
	String file="src/test/resources/resources/registration.xlsx";
	String sheetName="Sheet1";
	
	@BeforeMethod
public void openFacebook() {
	openApp();
	
}
	@Test 
	public void CreateRegistrationTest() {
		regPage= new Registrationpage(driver);
		regPage.createNewAccountButton();
		exReader= new ExcelReader(file,sheetName);
		String firstNameField=exReader.getStringCellValue(1, 0);
		regPage.firstNameField(firstNameField);
	    String lastNameField=exReader.getStringCellValue(1, 1);
	    regPage.lastNameField(lastNameField);
	    String emailField=exReader.getStringCellValue(1, 2);
	    regPage.emailField(emailField);
	    String reEnteremailField=exReader.getStringCellValue(1, 3);
	    regPage.reEnteremailField(reEnteremailField);
	    String newPasswordField=exReader.getStringCellValue(1, 3);
	    regPage.newPasswordField(newPasswordField);
	};
//	@AfterMethod
	public void closeFacebook() {
		closeApp();
	}
}
