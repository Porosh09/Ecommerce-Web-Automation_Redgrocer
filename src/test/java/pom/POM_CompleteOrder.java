package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_CompleteOrder {

	WebDriver driver = null;
	
    public POM_CompleteOrder(WebDriver driver) {
		
		this.driver=driver;
	}
    
    /* By signin = By.xpath("//a[contains(text(),'Sign in')]");
	
	By phone = By.name("phone");
	By pass = By.name("password");
	By logn = By.xpath("//button[contains(text(),'Login')]"); */
    
	By icon = By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]");
	
	/*
    public void clickSignin() {
		
		driver.findElement(signin).click();
	}
	
	
    public void phoneNumber() {
		
		driver.findElement(phone).sendKeys("01810025177");   // use these as dummy code for initial check
	}
    
    public void password() {
		
		driver.findElement(pass).sendKeys("123456");
	}
    
    public void login() {
		
		driver.findElement(logn).click();
	}
	*/
    
    public void clickIcon() {
		
		driver.findElement(icon).click();
	}

    
    //main
    By grocery = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[2]");
    By quanityincrease = By.xpath("//body/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[8]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/button[2]/i[1]");
    By cart = By.xpath("//header/div[1]/div[1]/div[6]/div[1]/a[1]/img[1]"); 
    By checkout = By.xpath("//a[contains(text(),'Checkout')]");
    By location = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]");
    By agree = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/div[3]/label[1]/span[1]");
    By complete = By.xpath("//button[contains(text(),'Complete Order')]");
    By notification = By.xpath("//header/div[1]/div[1]/ul[2]/li[1]/a[1]/span[1]/span[1]/i[1]");
    
    
    
    public void selectGrocery() {
    	
    	driver.findElement(grocery).click();
    }
    
    
    public void addToCart() {
    	
    	WebElement addcart= driver.findElement(By.xpath("//body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/button[1]/span[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addcart);
		
    }
    
    public void scrollToProduct() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scroll = driver.findElement(By.xpath("//body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/button[1]/span[1]"));
    	js.executeScript("arguments[0].scrollIntoView();", scroll);
    	
    }
    
    public void addToCart2() {
    	
    	WebElement addcart2= driver.findElement(By.xpath("//body[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[8]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/button[1]/span[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addcart2);
		
    }
    
    public void quantityPlus() {
    	
    	driver.findElement(quanityincrease).click();
    }
    
    public void clickCart() {
    	
    	driver.findElement(cart).click();
    }
    
    public void clickCheckout() {
    	
    	driver.findElement(checkout).click();
    }
    
    public void clickSetLocation() {
    	
    	driver.findElement(location).click();
    }
    
    
    
    public void scrollToComplete() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scroll = driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]/img[1]"));
    	js.executeScript("arguments[0].scrollIntoView();", scroll);
    	
    }

    
    public void tickAgree() {
    	
    	driver.findElement(agree).click();
    }
    
    
    public void completeOrder() {
    	driver.findElement(complete).click();
    	
    }
    
    
    public void clickNotfication() {
    	driver.findElement(notification).click();
    	
    }
    
	
	
}
