package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_HomePage {

    WebDriver driver = null;
	
	public POM_HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By home = By.xpath("//header/div[2]/div[1]/ul[1]/li[1]/a[1]");
	By brand = By.xpath("//header/div[2]/div[1]/ul[1]/li[2]/a[1]");
	By track = By.xpath("//header/div[2]/div[1]/ul[1]/li[3]/a[1]");
	By coupon = By.xpath("//a[contains(text(),'Coupon')]");
	
	
	
	public void clickHome() {
		
		driver.findElement(home).click();
	}
	
    public void clickBrand() {
		
		driver.findElement(brand).click();
	}
    
    public void trackOrder() {
		
		driver.findElement(track).click();
	}
    
    public void clickCoupon() {
		
		driver.findElement(coupon).click();
	}
	
	
	
	
}
