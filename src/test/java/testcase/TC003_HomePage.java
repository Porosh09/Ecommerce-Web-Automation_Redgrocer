package testcase;

import org.testng.annotations.Test;

import base.Driver;
import pom.POM_HomePage;

public class TC003_HomePage extends Driver {

	String baseurl="https://ecommerce.rultest.com/";
	
	@Test
	public void homepage() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		POM_HomePage navigate = new POM_HomePage(driver);
		
		
		navigate.clickBrand();
		Thread.sleep(2000);
		navigate.trackOrder();
		Thread.sleep(2000);
		navigate.clickCoupon();
		Thread.sleep(2000);
		navigate.clickHome();
		Thread.sleep(1000);
		
		
		
		
		
	}
	
	
	
	
	
}
