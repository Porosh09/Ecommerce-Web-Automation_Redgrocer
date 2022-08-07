package testcase;

import org.testng.annotations.Test;

import base.Driver;
import pom.POM_CompleteOrder;

public class TC004_CompleteOrder extends Driver {
	
	String baseurl="https://ecommerce.rultest.com/";

	@Test
	public void completeaorder() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		POM_CompleteOrder add = new POM_CompleteOrder(driver);
		
		/* add.clickSignin();
		Thread.sleep(1000);
		
		add.phoneNumber();                   // use these as dummy code for initial check
		add.password();
		add.login();
		Thread.sleep(2000); */
		
		
		add.clickIcon();
		Thread.sleep(1000);

		
		//main
		add.selectGrocery();
		add.addToCart();
		Thread.sleep(2000);
		add.scrollToProduct();
		Thread.sleep(4000);
		add.addToCart2();
		Thread.sleep(2000);
		add.quantityPlus();
		Thread.sleep(3000);
		
		add.clickCart();
		Thread.sleep(1000);
		add.clickCheckout();
		Thread.sleep(3000);
		
		add.clickSetLocation();
		Thread.sleep(2000);
		add.scrollToComplete();
		Thread.sleep(2000);
		add.tickAgree();
		Thread.sleep(1000);
		add.completeOrder();
		Thread.sleep(3000);
		
		add.clickNotfication();
		Thread.sleep(2000);
		
	

	}
	
	
	
}

