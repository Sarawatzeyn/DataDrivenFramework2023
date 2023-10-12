package com.facebook.registrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {

	WebDriver driver;
	public Registrationpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[starts-with(@id,'u_0_0_')]")
	private WebElement createNewAccount;
	
	public void createNewAccountButton() {
		createNewAccount.click();
	}
	@FindBy(how=How.NAME,using="firstname")
	public WebElement firstName;
	
	public WebElement firstNameField(String enterFirstName) {
		firstName.sendKeys(enterFirstName);
		return firstName;
		
	}
	@FindBy(how=How.NAME,using="lastname")
	public WebElement lastName;
	public WebElement lastNameField(String enterLastName) {
	lastName.sendKeys(enterLastName);
	return lastName;
	}
	@FindBy(how=How.NAME,using ="reg_email__")
	public WebElement email;
	public WebElement emailField(String enterEmail) {
		email.sendKeys(enterEmail);
		return email;
	}
	@FindBy(how=How.NAME,using ="reg_email_confirmation__")
	public WebElement reEnteremail;
	public String reEnteremailField(String reEnteremail ) {
		reEnteremail.compareTo(reEnteremail);
		return reEnteremail;
}
}







