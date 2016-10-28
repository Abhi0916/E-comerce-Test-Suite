package com.ecom.test.signon;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.core.EcomBaseTest;
import com.ecom.page.signon.EcomLoginPage;

public class EcomLoginTest extends EcomBaseTest {
  @Test
  public void testLoginSuccess() {
	  EcomLoginPage ecomLoginpage = new EcomLoginPage(driver);
	  ecomLoginpage.clickAccountTab();
	  ecomLoginpage.setLoginDataLogon("abhi.manuv@gmail.com", "Denim1234");
	  boolean b = driver.getPageSource().contains("You have Logged In successfully.");
		Assert.assertTrue(b);
  }

  public void testLoginWithLockedData(){
	  
	  
  }
  @Test
  public void testLoginWithUserIdBlank(){
	  EcomLoginPage ecomLoginpage = new EcomLoginPage(driver);
	  ecomLoginpage.clickAccountTab();
	  ecomLoginpage.setLoginDataLogon("", "Denim1234"); 
	  boolean b = driver.getPageSource().contains("Invalid Username / Password!");
		Assert.assertTrue(b);
  }
  @Test
  public void testLoginWithPasswordBlank(){
	  EcomLoginPage ecomLoginpage = new EcomLoginPage(driver);
	  ecomLoginpage.clickAccountTab();
	  ecomLoginpage.setLoginDataLogon("abhi.manuv@gmail.com", "");
	  boolean b = driver.getPageSource().contains("Invalid Username / Password!");
		Assert.assertTrue(b);
  }
}
