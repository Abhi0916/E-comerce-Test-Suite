package com.ecom.page.signon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.constant.registration.EcomRegistrationConstant;
import com.ecom.constant.signon.EcomLoginConstant;

public class EcomLoginPage {
//locators
	@FindBy(id=EcomLoginConstant.LOCATOR_EMAIL_ID)
	WebElement emailId;
	@FindBy(id=EcomLoginConstant.LOCATOR_PASSWORD_ID)
	WebElement psswd;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_ACCOUNT_TAB_LOCATOR)
	WebElement accountTab;
	@FindBy(xpath=EcomLoginConstant.LOCATOR_LOG_IN_XPATH)
	WebElement signin;
	public EcomLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickAccountTab(){
		accountTab.click();
	}
	public void setEmailId(String emailData){
		emailId.sendKeys(emailData);
	}
	public void setPassword(String pwdData){
		psswd.sendKeys(pwdData);
	}
	public void clickLogin(){
		signin.click();
	}
	public void setLoginDataLogon(String userId,String password){
		setEmailId(userId);
		setPassword(password);
		clickLogin();
	}
}
