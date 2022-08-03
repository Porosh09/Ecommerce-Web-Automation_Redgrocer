package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_Registration {

	WebDriver driver = null;
	
	public POM_Registration(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By signin = By.xpath("//a[contains(text(),'Sign in')]");
	
	By fname = By.name("name");
	By useemail = By.xpath("//button[contains(text(),'Use Email Instead')]");
	
	By email = By.name("email");
	By pass = By.name("password");
	By confpass = By.name("password_confirmation");
	By agree = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[7]/label[1]/span[2]");
	
	
	public void clickSignin() {
		
		driver.findElement(signin).click();
	}
	
	
	//element click intercepted issue fix::
	public void clickRegister() {
		
		WebElement regs= driver.findElement(By.xpath("//a[contains(text(),'Register Now')]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", regs);
		
	}
	
	public void fullName() {
		
		driver.findElement(fname).sendKeys("Tester Fuad");
	}
	
    public void emailInstead() {
		
		driver.findElement(useemail).click();
	}
    
    
    
    public void email() {
		
		driver.findElement(email).sendKeys("fuad.riseuplabs@gmail.com");
	}
    
    
    public void password() {
		
		driver.findElement(pass).sendKeys("123456");
	}
    
    public void confirmPassword() {
		
		driver.findElement(confpass).sendKeys("123456");
	}
    
    public void tickAgree() {
		
		driver.findElement(agree).click();
	}
    
    public void createAccount() {
		
    	WebElement accn= driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", accn);
		
	}
    
	
}
