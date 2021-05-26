package SC_COD_WholeProcess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SellerApproval extends BaseClass {

	@BeforeMethod
	public void login() {
		driver.get("https://seller.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sportalook17@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("sal");
		driver.findElement(By.id("signin_btnlogin")).click();
	}
	@Test
	public void testSellerApproval() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[@href='ReturnOrderList']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();	  
		
		
		
	}
	
}
