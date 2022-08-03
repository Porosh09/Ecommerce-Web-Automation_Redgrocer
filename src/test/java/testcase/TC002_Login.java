package testcase;

import org.testng.annotations.Test;

import base.Driver;
import pom.POM_Login;

public class TC002_Login extends Driver {

	String baseurl= "https://ecommerce.rultest.com/";
	
	@Test
	public void login() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		POM_Login lgn = new POM_Login(driver);
				
		lgn.clickSignin();
		Thread.sleep(1000);
		
		lgn.phoneNumber();
		lgn.password();
		lgn.login();
		Thread.sleep(2000);
		
			
	}
	
	
}
