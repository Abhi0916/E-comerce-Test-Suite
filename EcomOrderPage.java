package com.ecom.page.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.constant.order.EcomOrderConstant;
import com.ecom.constant.order.EcomOrderPayConstant;
import com.ecom.constant.order.EcomOrderPostageConstant;
import com.ecom.constant.registration.EcomRegistrationConstant;

public class EcomOrderPage {
	@FindBy(xpath = EcomRegistrationConstant.XPATH_ACCOUNT_TAB_LOCATOR)
	WebElement accountTab;
	@FindBy(xpath = EcomOrderConstant.XPATH_PRODUCTS_TAB_LOCATOR)
	WebElement productsTab;
	@FindBy(xpath = EcomOrderConstant.XPATH_DELL_INSPIRON_17R_LOCATOR)
	WebElement inspiron17R;
	@FindBy(xpath = EcomOrderConstant.XPATH_DELL_INSPIRON_21R_LOCATOR)
	WebElement inspiron21R;
	@FindBy(xpath = EcomOrderConstant.XPATH_DELL_INSPIRON_19R_LOCATOR)
	WebElement inspiron19R;
	@FindBy(xpath = EcomOrderConstant.XPATH_HP_ENVY_7215NR_LOCATOR)
	WebElement hpEnvy7215R;
	@FindBy(xpath = EcomOrderConstant.XPATH_HP_CANON_EOS_LOCATOR)
	WebElement hpCannonEOS;
	@FindBy(xpath = EcomOrderConstant.XPATH_ADD_TO_CART_LOCATOR)
	WebElement addToCart;
	@FindBy(xpath = EcomOrderConstant.XPATH_MY_CART_TAB_LOCATOR)
	WebElement myCartTab;
	@FindBy(xpath = EcomOrderConstant.XPATH_CART_CONTINUE_LOCATOR)
	WebElement cartContinue;
	@FindBy(xpath = EcomOrderConstant.XPATH_CART_CHECKOUT_LOCATOR)
	WebElement cartCheckout;
	@FindBy(xpath = EcomOrderConstant.XPATH_CART_REMOVE_ITEM_LOCATOR)
	WebElement cartRemove;
	@FindBy(xpath = EcomOrderConstant.XPATH_CART_EDIT_ITEM_LOCATOR)
	WebElement cartEdit;
	@FindBy(xpath = EcomOrderConstant.XPATH_CART_QUANTITY_LOCATOR)
	WebElement cartQuantity;
	@FindBy(xpath = EcomOrderConstant.XPATH_CONFIRM_CONTINUE_LOCATOR)
	WebElement confirmContinue;
	@FindBy(xpath = EcomOrderConstant.XPATH_CHANGE_BILLING_ADDRESS_LOCATOR)
	WebElement changeBillingAddress;
	@FindBy(xpath = EcomOrderConstant.XPATH_CHANGE_SHIPPING_ADDRESS_LOCATOR)
	WebElement changeShippingAddress;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_CONTINUE_LOCATOR)
	WebElement postageContinue;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_SELECT_NO_SHIPPING_LOCATOR)
	WebElement postageNoShipping;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_SELECT_STANDARD_SHIPPING_LOCATOR)
	WebElement postageStandard;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_SELECT_TEST_SHIPPING_LOCATOR)
	WebElement postageTest;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_HOUSE_NO_LOCATOR)
	WebElement postagehouse;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_STREET_NAME_LOCATOR)
	WebElement postagestreet;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_TOWN_NAME_LOCATOR)
	WebElement postageTown;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_POST_CODE_LOCATOR)
	WebElement postageCode;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_COUNTY_NAME_LOCATOR)
	WebElement postageCounty;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_COUNTRY_NAME_LOCATOR)
	WebElement postageCountry;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_UPDATE_BUTTON_LOCATOR)
	WebElement postageUpdate;
	@FindBy(xpath = EcomOrderPostageConstant.XPATH_POSTAGE_BACK_LOCATOR)
	WebElement postageBack;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_BACK_LOCATOR)
	WebElement payBack;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_HOUSE_NO_LOCATOR)
	WebElement payHouse;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_STREET_NAME_LOCATOR)
	WebElement payStreet;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_TOWN_NAME_LOCATOR)
	WebElement payTown;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_POST_CODE_LOCATOR)
	WebElement payPostCode;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_COUNTY_NAME_LOCATOR)
	WebElement payCounty;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_COUNTRY_NAME_LOCATOR)
	WebElement payCountry;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_UPDATE_BUTTON_LOCATOR)
	WebElement payUpdate;
	@FindBy(xpath = EcomOrderPayConstant.XPATH_PAY_CONTINUE_LOCATOR)
	WebElement payContinue;
	@FindBy(xpath = EcomOrderConstant.XPATH_DISCOUNT_CODE_LOCATOR)
	WebElement discountCode;
	@FindBy(xpath = EcomOrderConstant.XPATH_CHECK_DISCOUNT_CODE_LOCATOR)
	WebElement checkCode;
	@FindBy(xpath = EcomOrderConstant.XPATH_SECURE_PAYMENT_LOCATOR)
	WebElement securePayment;

	public EcomOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProductsTab() {
		productsTab.click();
	}

	public void viewInspiron19R() {
		inspiron19R.click();
	}

	public void addInspiron19R() {
		addToCart.click();
	}

	public void viewInspiron21R() {
		inspiron21R.click();
	}

	public void addInspiron21R() {
		addToCart.click();
	}

	public void viewInspiron17R() {
		inspiron17R.click();
	}

	public void addInspiron17R() {
		addToCart.click();
	}

	public void viewHpEnvy7215R() {
		hpEnvy7215R.click();
	}

	public void addHpEnvy7215R() {
		addToCart.click();
	}

	public void viewHpCannonEOS() {
		hpCannonEOS.click();
	}

	public void addHpCannonEOS() {
		addToCart.click();
	}
	public void clickCheckout(){
		cartCheckout.click();
	}
	public void clickCartContinue(){
		cartContinue.click();
	}
	public void clickConfirmContinue(){
		confirmContinue.click();
	}
	public void clickShippingStandard(){
		postageStandard.click();
	}
	
	public void clickTestShipping(){
		postageTest.click();
	}
	public void clickPostageContinue(){
		postageContinue.click();
	}
	public void clickPayContinue(){
		payContinue.click();
	}
	public void clickDiscountContinue(){
		payContinue.click();
	}
	public void clickSecurePayment(){
		securePayment.click();
	}
	public void clickRemoveItem(){
		cartRemove.click();
	}
}

