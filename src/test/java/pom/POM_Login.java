package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Login {

    WebDriver driver = null;
	
	public POM_Login(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By signin = By.xpath("//a[contains(text(),'Sign in')]");
	
	By phone = By.name("phone");
	By pass = By.name("password");
	By logn = By.xpath("//button[contains(text(),'Login')]");
	
	
    public void clickSignin() {
		
		driver.findElement(signin).click();
	}
	
	
    public void phoneNumber() {
		
		driver.findElement(phone).sendKeys("01810025177");
	}
    
    public void password() {
		
		driver.findElement(pass).sendKeys("123456");
	}
    
    public void login() {
		
		driver.findElement(logn).click();
	}
    
    
    
    
	
	
	
	
}
