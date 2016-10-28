package com.ecom.test.order;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.core.EcomBaseTest;
import com.ecom.page.order.EcomOrderPage;
import com.ecom.page.signon.EcomLoginPage;

public class EcomOrderTest extends EcomBaseTest {

	@Test
	public void testSuccess() {
		EcomLoginPage logpage = new EcomLoginPage(driver);
		EcomOrderPage order = new EcomOrderPage(driver);
		logpage.clickAccountTab();
		logpage.setLoginDataLogon("abhi.manuv@gmail.com", "Denim1234");
		order.clickProductsTab();
		order.viewInspiron17R();
		order.addInspiron17R();
		order.clickCheckout();
		order.clickConfirmContinue();
		order.clickShippingStandard();
		order.clickPostageContinue();
		order.clickPayContinue();
		order.clickDiscountContinue();
		order.clickSecurePayment();
		boolean b = driver.getPageSource().contains("Your order summary");
		Assert.assertTrue(b);

	}

	@Test
	public void testToRemoveItemFromCart() {
		EcomLoginPage logpage = new EcomLoginPage(driver);
		EcomOrderPage order = new EcomOrderPage(driver);
		logpage.clickAccountTab();
		logpage.setLoginDataLogon("abhi.manuv@gmail.com", "Denim1234");
		order.clickProductsTab();
		order.viewInspiron17R();
		order.addInspiron17R();
		// order.clickCheckout();
		order.clickRemoveItem();
		Alert alertOK = driver.switchTo().alert();
		alertOK.accept();

	}
}
