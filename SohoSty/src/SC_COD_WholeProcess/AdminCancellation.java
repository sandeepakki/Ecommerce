package SC_COD_WholeProcess;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminCancellation extends BaseClass{
@BeforeMethod
public void login() { //chage order no
	driver.get("http://siteadmin.sohostyle.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("txtLogin")).sendKeys("sohostyle@cstech.in");
	driver.findElement(By.name("txtPassword")).sendKeys("45824582");
	driver.findElement(By.name("btnSubmit")).click();
}
	@Test
	public void testAdminCancel() throws InterruptedException, AWTException {
	Thread.sleep(2000);
	WebElement element =	driver.findElement(By.xpath("//li[@id='liSales_parent']/a"));
	Actions action= new Actions(driver);
	action.moveToElement(element).build().perform();
	driver.findElement(By.linkText("New Orders")).click();
//Admin Cancellation
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=159-S1390576&pid=0']/img[@title='MANAGE ORDER']")).click();
	WebElement OrderStatus1=driver.findElement(By.id("ddlorderstatus"));
	Select select1 = new Select(OrderStatus1);
	select1.selectByVisibleText("Cancel");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Admin Cancellation Order");
	
}
@AfterMethod
public void Screenshot() throws IOException, InterruptedException {
	takeScreenshot("8");
	driver.findElement(By.linkText("Submit")).click();
	driver.get("https://www.sohostyle.in/myaccount");
	driver.findElement(By.xpath("//a[@href='storecredit']")).click();
	Thread.sleep(5000);
	takeScreenshot("8");
}


}
