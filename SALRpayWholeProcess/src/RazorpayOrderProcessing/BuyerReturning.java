package RazorpayOrderProcessing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyerReturning extends BaseClass {

	@BeforeMethod
	public void buyerlogin() throws InterruptedException {
		
		driver.navigate().to("https://sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		

	}
	@Test
	public void testReturn() throws InterruptedException {
		
	//Replace	
		
		driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2175-S1162019");
		driver.findElement(By.linkText("Return")).click();
		 
		WebElement qty = driver.findElement(By.id("ddlquantity"));
		Select s1 = new Select(qty);
		s1.selectByValue("2");
		
		WebElement reason = driver.findElement(By.id("ddlreason"));
		Select s2 = new Select(reason);
		s2.selectByVisibleText("Unhappy with the product quality");
		
		WebElement type = driver.findElement(By.id("ddlreturnstatus"));
		Select s3 = new Select(type);
		s3.selectByVisibleText("Replace");
		
		
//		driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2174-S1162019");
//		driver.findElement(By.linkText("Return")).click();
//		 
//		WebElement qty2 = driver.findElement(By.id("ddlquantity"));
//		Select s4 = new Select(qty);
//		s4.selectByValue("2");
//		
//		WebElement reason1 = driver.findElement(By.id("ddlreason"));
//		Select s5 = new Select(reason1);
//		s5.selectByVisibleText("Unhappy with the product quality");
//		
//		WebElement type1 = driver.findElement(By.id("ddlreturnstatus"));
//		Select s6 = new Select(type1);
//		s6.selectByVisibleText("Replace");
//		

	// Refund
		
//		driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2132-S1162019");
//		driver.findElement(By.linkText("Return")).click();
//		 
//		WebElement qty2 = driver.findElement(By.id("ddlquantity"));
//		Select s7 = new Select(qty2);
//		s7.selectByValue("2");
//		
//		WebElement reason3 = driver.findElement(By.id("ddlreason"));
//		Select s8 = new Select(reason3);
//		s8.selectByVisibleText("Unhappy with the product quality");
//		
//		WebElement type2 = driver.findElement(By.id("ddlreturnstatus"));
//		Select s9 = new Select(type2);
//		s9.selectByVisibleText("Refund");
//		
//		WebElement credit = driver.findElement(By.id("ddlCreadittype"));
//		Select s13 = new Select(credit);
//		s13.selectByVisibleText("Store Credit");
	//	
		
	}

	@AfterMethod
	public void confirming() throws InterruptedException {
		
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
		driver.findElement(By.linkText("Submit")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(2000);	
	}
	
	
}
