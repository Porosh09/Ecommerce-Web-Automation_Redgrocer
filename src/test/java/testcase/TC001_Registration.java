package testcase;

import org.testng.annotations.Test;

import base.Driver;
import pom.POM_Registration;

public class TC001_Registration extends Driver {
	
	String baseurl= "https://ecommerce.rultest.com/";
	
	@Test
	public void registration() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		POM_Registration reg = new POM_Registration(driver);
		
		reg.clickSignin();
		Thread.sleep(1000);
		
		reg.clickRegister();
		Thread.sleep(2000);
		
		reg.fullName();
		reg.emailInstead();
		Thread.sleep(1000);
		reg.email();
		reg.password();
		reg.confirmPassword();
		reg.tickAgree();
		Thread.sleep(3000);
		
		reg.createAccount();
		Thread.sleep(6000);
		
		
	}

}
