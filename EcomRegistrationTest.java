package com.ecom.test.registration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.core.EcomBaseTest;
import com.ecom.page.registration.EcomRegistrationPage;

public class EcomRegistrationTest extends EcomBaseTest {

	@Test
	public void testSuccessful() {
		EcomRegistrationPage regPage = new EcomRegistrationPage(driver);
		regPage.clickAccountTab();
		regPage.clickSignUpLink();
		regPage.selectMale();
		regPage.setFirstName("Adam");
		regPage.setLastName("Eve");
		regPage.setDayDOB("12");
		regPage.setMonthDOB("05");
		regPage.setYearDOB("1980");
		regPage.setEmail("adameve2650@gmail.com");
		regPage.setHouseNumber("#3091");
		regPage.setStreetName("140 Ryland Street");
		regPage.setTownName("San Juan");
		regPage.setCountyName("California");
		regPage.setCountryName("USA");
		regPage.setPostCode("95123");
		regPage.setPhoneNumber("561-234-1878");
		regPage.setFaxNumber("560-660-1878");
		regPage.setPassword("RollDigitroni1980");
		regPage.setconfirmPassword("RollDigitroni1980");
		regPage.clickTerms();
		regPage.clickSignUpButton();

		boolean b = driver
				.getCurrentUrl()
				.contains(
						"http://saipratap.net/ecommerce/thankyoumessage.php?msg=reg");
		Assert.assertTrue(b);

	}
	@Test
	public void testWithNoEmailRegistration(){
		EcomRegistrationPage regPage = new EcomRegistrationPage(driver);
		regPage.clickAccountTab();
		regPage.clickSignUpLink();
		regPage.selectMale();
		regPage.setFirstName("Adam");
		regPage.setLastName("Khan");
		regPage.setDayDOB("12");
		regPage.setMonthDOB("05");
		regPage.setYearDOB("1924");
//		regPage.setEmail("adameve280@gmail.com");
		regPage.setHouseNumber("#301");
		regPage.setStreetName("14 Ryland Street");
		regPage.setTownName("San Juan");
		regPage.setCountyName("California");
		regPage.setCountryName("USA");
		regPage.setPostCode("95123");
		regPage.setPhoneNumber("561-234-1878");
		regPage.setFaxNumber("560-660-1878");
		regPage.setPassword("RollDigitroni1980");
		regPage.setconfirmPassword("RollDigitroni1980");
		regPage.clickTerms();
		regPage.clickSignUpButton();

		boolean b = driver
				.getPageSource()
				.contains(
						"This email address is already registered.");
		Assert.assertTrue(b);
		
	}

	@Test
	public void testWithoutTerms(){
		EcomRegistrationPage regPage = new EcomRegistrationPage(driver);
		regPage.clickAccountTab();
		regPage.clickSignUpLink();
		regPage.selectMale();
		regPage.setFirstName("Adam");
		regPage.setLastName("Eve");
		regPage.setDayDOB("12");
		regPage.setMonthDOB("05");
		regPage.setYearDOB("1980");
		regPage.setEmail("adameve65@gmail.com");
		regPage.setHouseNumber("#3091");
		regPage.setStreetName("140 Ryland Street");
		regPage.setTownName("San Juan");
		regPage.setCountyName("California");
		regPage.setCountryName("USA");
		regPage.setPostCode("95123");
		regPage.setPhoneNumber("561-234-1878");
		regPage.setFaxNumber("560-660-1878");
		regPage.setPassword("RollDigitroni1980");
		regPage.setconfirmPassword("RollDigitroni1980");
//		regPage.clickTerms();
		regPage.clickSignUpButton();

		boolean b = driver
				.getPageSource()
				.contains(
						"You must agree to the terms and conditions before you can sign up.");
		Assert.assertTrue(b);
	}
	@Test
	public void testWithExistingEmailId(){
		EcomRegistrationPage regPage = new EcomRegistrationPage(driver);
		regPage.clickAccountTab();
		regPage.clickSignUpLink();
		regPage.selectMale();
		regPage.setFirstName("Adam");
		regPage.setLastName("Eve");
		regPage.setDayDOB("12");
		regPage.setMonthDOB("05");
		regPage.setYearDOB("1980");
		regPage.setEmail("adameve280@gmail.com");
		regPage.setHouseNumber("#3091");
		regPage.setStreetName("140 Ryland Street");
		regPage.setTownName("San Juan");
		regPage.setCountyName("California");
		regPage.setCountryName("USA");
		regPage.setPostCode("95123");
		regPage.setPhoneNumber("561-234-1878");
		regPage.setFaxNumber("560-660-1878");
		regPage.setPassword("RollDigitroni1980");
		regPage.setconfirmPassword("RollDigitroni1980");
		regPage.clickTerms();
		regPage.clickSignUpButton();

		boolean b = driver
				.getPageSource()
				.contains(
						"This email address is already registered.");
		Assert.assertTrue(b);
	}
}
