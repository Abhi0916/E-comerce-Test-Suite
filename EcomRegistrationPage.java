package com.ecom.page.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.constant.registration.EcomRegistrationConstant;

public class EcomRegistrationPage {
	@FindBy(xpath = EcomRegistrationConstant.XPATH_ACCOUNT_TAB_LOCATOR)
	WebElement accountTab;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_SIGN_UP_LOCATOR)
	WebElement signUpLink;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_GENDER_MALE_BUTTON_LOCATOR)
	WebElement maleGender;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_GENDER_FEMALE_BUTTON_LOCATOR)
	WebElement femaleGender;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_FIRST_NAME_LOCATOR)
	WebElement firstName;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_LAST_NAME_LOCATOR)
	WebElement lastName;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_DATE_OF_BIRTH_DAY_LOCATOR)
	WebElement dobDay;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_DATE_OF_BIRTH_MONTH_LOCATOR)
	WebElement dobMonth;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_DATE_OF_BIRTH_YEAR_LOCATOR)
	WebElement dobYear;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_EMAIL_ID_LOCATOR)
	WebElement email;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_HOUSE_NO_LOCATOR)
	WebElement houseNumber;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_STREET_NAME_LOCATOR)
	WebElement streetName;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_TOWN_NAME_LOCATOR)
	WebElement town;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_COUNTY_NAME_LOCATOR)
	WebElement county;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_COUNTRY_NAME_LOCATOR)
	WebElement country;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_POST_CODE_LOCATOR)
	WebElement postCode;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_DAY_TIME_PHONE_LOCATOR)
	WebElement phoneNumber;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_EVENING_TIME_PHONE_LOCATOR)
	WebElement faxNumber;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_PASSWORD_LOCATOR)
	WebElement password;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_CONFIRM_PASSWORD_LOCATOR)
	WebElement confirmPassword;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_NEWS_LETTER_LOCATOR)
	WebElement newsLetter;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_TERMS_AND_CONDITIONS_LOCATOR)
	WebElement terms;
	@FindBy(xpath = EcomRegistrationConstant.XPATH_SIGN_UP_TO_REGISTER_LOCATOR)
	WebElement signUpButton;

	public EcomRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickAccountTab(){
		accountTab.click();
	}
	public void clickSignUpLink(){
		signUpLink.click();
	}
	public void selectMale(){
		maleGender.click();
	}
	public void selectFemale(){
		femaleGender.click();
	}
	public void setFirstName(String fName){
		firstName.clear();
		firstName.sendKeys(fName);
	}
	public void setLastName(String lName){
		lastName.clear();
		lastName.sendKeys(lName);
	}
	public void setDayDOB(String day){
		dobDay.clear();
		dobDay.sendKeys(day);
	}
	public void setMonthDOB(String month){
		dobMonth.clear();
		dobMonth.sendKeys(month);
	}
	public void setYearDOB(String year){
		dobYear.clear();
		dobYear.sendKeys(year);
	}
	public void setEmail(String emailId){
		email.clear();
		email.sendKeys(emailId);
	}
	public void setHouseNumber(String houseNum){
		houseNumber.clear();
		houseNumber.sendKeys(houseNum);
	}
	public void setStreetName(String street){
		streetName.clear();
		streetName.sendKeys(street);
	}
	public void setTownName(String townName){
		town.clear();
		town.sendKeys(townName);
	}
	public void setCountyName(String countyName){
		county.clear();
		county.sendKeys(countyName);
	}
	public void setCountryName(String countryName){
		country.clear();
		country.sendKeys(countryName);
	}
	public void setPostCode(String post){
		postCode.clear();
		postCode.sendKeys(post);
	}
	public void setPhoneNumber(String phone){
		phoneNumber.clear();
		phoneNumber.sendKeys(phone);
	}
	public void setFaxNumber(String fax){
		faxNumber.clear();
		faxNumber.sendKeys(fax);
	}
	public void setPassword(String pwd){
		password.clear();
		password.sendKeys(pwd);
	}
	public void setconfirmPassword(String cpwd){
		confirmPassword.clear();
		confirmPassword.sendKeys(cpwd);
	}
	public void clickNewsLetter(){
		newsLetter.click();
		newsLetter.click();
	}
	public void clickTerms(){
		terms.click();
	}
	public void clickSignUpButton(){
		signUpButton.click();
	}
	
}
