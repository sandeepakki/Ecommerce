package CashOnDeliveryProcess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adminReturnApproves extends BaseClass{

	@BeforeMethod
	public void adminlogin() {
		
		driver.navigate().to("https://siteadmin.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void testReturnApprove() {
		
		WebElement element =	driver.findElement(By.id("liSales_parent"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Return Request")).click();
//View Product to be Returned	
		//for (int j=0;j<=3;j++) {
		List<WebElement> VPTR = driver.findElements(By.linkText("View Product to be Returned"));
		for(int i=0;i<VPTR.size();i++){
			System.out.println(VPTR.get(i).getText());
			}
				VPTR.get(0).click();
				
				WebElement status1= driver.findElement(By.id("ddlpaystatus"));
				Select s1 = new Select(status1);
				s1.selectByVisibleText("Approved");
				
				driver.findElement(By.id("txt_desc")).sendKeys("return approved");
			
			}
		//}	
	@AfterMethod()
	public void submit() {
		driver.findElement(By.linkText("Submit")).click();
		
	}
	}
	

