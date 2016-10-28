package com.ecom.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class EcomBaseTest {
	protected WebDriver driver;
	@BeforeMethod
	@Parameters("browsername")
	public void createDriver(String browsername){
		driver = BrowserFactory.selectBrowser(browsername);
		driver.get("http://saipratap.net/ecommerce/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeDriver(){
		driver.close();
	}
}
