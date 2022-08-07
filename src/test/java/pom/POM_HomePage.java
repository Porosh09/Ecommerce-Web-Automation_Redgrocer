package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_HomePage {

    WebDriver driver = null;
    	
	public POM_HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	By redgrocer = By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]");
	/* By home = By.xpath("//header/div[2]/div[1]/ul[1]/li[1]/a[1]");
	By brand = By.xpath("//header/div[2]/div[1]/ul[1]/li[2]/a[1]");
	By track = By.xpath("//header/div[2]/div[1]/ul[1]/li[3]/a[1]");
	By coupon = By.xpath("//a[contains(text(),'Coupon')]"); */
	
	By search = By.id("search");
	By searching = By.cssSelector("button[type='submit']");
	
    public void clickRedgrocer() {
		
		driver.findElement(redgrocer).click();
	}

	/* public void clickHome() {
		
		driver.findElement(home).click();
	}
	
    public void clickBrand() {
		
		driver.findElement(brand).click();
	}                                               // comment out as functionalities changed
    
    public void trackOrder() {
		
		driver.findElement(track).click();
	}
    
    public void clickCoupon() {
		
		driver.findElement(coupon).click();
	} */
    
    public void scrollToCategory() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'PRODUCT CATEGORIES')]"));
    	js.executeScript("arguments[0].scrollIntoView();", scroll);
    	
    }
	
    public void scrollToTop10() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollmiddle = driver.findElement(By.xpath("//a[contains(text(),'View All Brands')]"));
    	js.executeScript("arguments[0].scrollIntoView();", scrollmiddle);
    	
    }
    
    public void searchProduct() {
    	
    	driver.findElement(search).sendKeys("Nescafe");
    	
    }
    
    public void clickSearch() {
    	
    	driver.findElement(searching).click();
    	
    }
    
	
	
	
	
}
