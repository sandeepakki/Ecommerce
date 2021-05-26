package Cancellation;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class adminCancellation {
	
	 public static WebDriver driver;
		@BeforeClass
		public void setUp() {
		String browser="Chrome";
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		}
	
	@Test
	public void testadmincancel() throws InterruptedException, AWTException {
	
		driver.get("https://siteadmin.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("sportalook@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		
		driver.findElement(By.name("btnSubmit")).click();
	WebElement element =	driver.findElement(By.id("liSales_parent"));
	Actions action= new Actions(driver);
	action.moveToElement(element).build().perform();
	driver.findElement(By.linkText("New Orders")).click();
//1	
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=2068-S1162019&pid=0']/img[@title='MANAGE ORDER']")).click();
	WebElement OrderStatus1=driver.findElement(By.id("ddlorderstatus"));
	Select select1 = new Select(OrderStatus1);
	select1.selectByVisibleText("Cancel");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Admin Cancellation Order");
	driver.findElement(By.linkText("Submit")).click();

}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
	
