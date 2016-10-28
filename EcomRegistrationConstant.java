package com.ecom.constant.registration;

public interface EcomRegistrationConstant {
	public static String XPATH_ACCOUNT_TAB_LOCATOR = "//a[@href='customerlogin.php']";

	public static String XPATH_SIGN_UP_LOCATOR = "//a[contains(text(),'SignUp')]";
	public static String XPATH_GENDER_MALE_BUTTON_LOCATOR = "//input[@name='radiobutton' and @value='1']";
	public static String XPATH_GENDER_FEMALE_BUTTON_LOCATOR = "//input[@name='radiobutton' and @value='2']";
	public static String XPATH_FIRST_NAME_LOCATOR = "//input[@id='fname']";
	public static String XPATH_LAST_NAME_LOCATOR = "//input[@id='lname']";
	public static String XPATH_DATE_OF_BIRTH_DAY_LOCATOR = "//input[@id='day']";
	public static String XPATH_DATE_OF_BIRTH_MONTH_LOCATOR = "//input[@id='month']";
	public static String XPATH_DATE_OF_BIRTH_YEAR_LOCATOR = "//input[@id='year']";
	public static String XPATH_EMAIL_ID_LOCATOR = "//input[@id='email']";
	public static String XPATH_HOUSE_NO_LOCATOR = "//input[@id='houseno']";
	public static String XPATH_STREET_NAME_LOCATOR = "//input[@id='add1']";
	public static String XPATH_TOWN_NAME_LOCATOR = "//input[@id='city']";
	public static String XPATH_COUNTY_NAME_LOCATOR = "//input[@id='state']";
	public static String XPATH_COUNTRY_NAME_LOCATOR = "//input[@id='country']";
	public static String XPATH_POST_CODE_LOCATOR = "//input[@id='postcode']";
	public static String XPATH_DAY_TIME_PHONE_LOCATOR = "//input[@id='phone']";
	public static String XPATH_EVENING_TIME_PHONE_LOCATOR = "//input[@id='fax']";
	public static String XPATH_PASSWORD_LOCATOR = "//input[@id='password']";
	public static String XPATH_CONFIRM_PASSWORD_LOCATOR = "//input[@id='cpassword']";
	public static String XPATH_NEWS_LETTER_LOCATOR = "//input[@id='newsletter']";
	public static String XPATH_TERMS_AND_CONDITIONS_LOCATOR = "//input[@id='terms']";
	public static String XPATH_SIGN_UP_TO_REGISTER_LOCATOR = "//input[@class='feature_headingbg']";

}
