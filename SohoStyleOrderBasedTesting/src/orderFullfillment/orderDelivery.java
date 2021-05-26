package orderFullfillment;

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

public class orderDelivery {

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
	public void testadminconfirm() throws InterruptedException, AWTException {
	
		driver.get("http://siteadminsohostyle.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("sohostyle@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		
		driver.findElement(By.name("btnSubmit")).click();
	WebElement element =	driver.findElement(By.id("liSales_parent"));
	Actions action= new Actions(driver);
	action.moveToElement(element).build().perform();
	driver.findElement(By.linkText("New Orders")).click();
	
//1	
	WebElement shipped = driver.findElement(By.id("dl_orderstatus"));
	Select status = new Select(shipped);
	status.selectByVisibleText("Shipped");
	driver.findElement(By.linkText("Search")).click();
	
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=124-S1325863&pid=0']/img[@title='MANAGE ORDER']")).click();
		
	WebElement OrderStatus1=driver.findElement(By.id("ddlorderstatus"));
	Select select1 = new Select(OrderStatus1);
	select1.selectByVisibleText("Delivered");

	WebElement PaymentStatus1 = driver.findElement(By.id("ddlpaystatus"));
	Select select2=new Select(PaymentStatus1);
	select2.selectByVisibleText("Paid");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
	driver.findElement(By.linkText("Submit")).click();
	
//2
	WebElement shipped2 = driver.findElement(By.id("dl_orderstatus"));
	Select status1 = new Select(shipped2);
	status1.selectByVisibleText("Shipped");
	driver.findElement(By.linkText("Search")).click();
	
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=123-S1325863&pid=0']/img[@title='MANAGE ORDER']")).click();
	
	WebElement OrderStatus2=driver.findElement(By.id("ddlorderstatus"));
	Select select3 = new Select(OrderStatus2);
	select3.selectByVisibleText("Delivered");

	WebElement PaymentStatus2 = driver.findElement(By.id("ddlpaystatus"));
	Select select4=new Select(PaymentStatus2);
	select4.selectByVisibleText("Paid");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
	driver.findElement(By.linkText("Submit")).click();
//	
//3
	WebElement shipped3 = driver.findElement(By.id("dl_orderstatus"));
	Select status2 = new Select(shipped3);
	status2.selectByVisibleText("Shipped");
	driver.findElement(By.linkText("Search")).click();
	
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=123-S1325863&pid=0']/img[@title='MANAGE ORDER']")).click();
	
	WebElement OrderStatus3=driver.findElement(By.id("ddlorderstatus"));
	Select select5 = new Select(OrderStatus3);
	select5.selectByVisibleText("Delivered");

	WebElement PaymentStatus3 = driver.findElement(By.id("ddlpaystatus"));
	Select select6=new Select(PaymentStatus3);
	select6.selectByVisibleText("Paid");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
	driver.findElement(By.linkText("Submit")).click();
	
//4
	WebElement shipped4 = driver.findElement(By.id("dl_orderstatus"));
	Select status3 = new Select(shipped4);
	status3.selectByVisibleText("Shipped");
	driver.findElement(By.linkText("Search")).click();
	
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=106-S1325863&pid=0']/img[@title='MANAGE ORDER']")).click();
	
	WebElement OrderStatus4=driver.findElement(By.id("ddlorderstatus"));
	Select select7 = new Select(OrderStatus4);
	select7.selectByVisibleText("Delivered");

	WebElement PaymentStatus4 = driver.findElement(By.id("ddlpaystatus"));
	Select select8=new Select(PaymentStatus4);
	select8.selectByVisibleText("Paid");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
	driver.findElement(By.linkText("Submit")).click();
//	
//5
	WebElement shipped5 = driver.findElement(By.id("dl_orderstatus"));
	Select status4 = new Select(shipped5);
	status4.selectByVisibleText("Shipped");
	driver.findElement(By.linkText("Search")).click();
	
	driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=107-S1325863&pid=0']/img[@title='MANAGE ORDER']")).click();
	
	WebElement OrderStatus5=driver.findElement(By.id("ddlorderstatus"));
	Select select9 = new Select(OrderStatus5);
	select9.selectByVisibleText("Delivered");

	WebElement PaymentStatus5 = driver.findElement(By.id("ddlpaystatus"));
	Select select10=new Select(PaymentStatus5);
	select10.selectByVisibleText("Paid");
	
	driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
	driver.findElement(By.linkText("Submit")).click();
//	
	
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
