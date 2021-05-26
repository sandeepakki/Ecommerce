package Fullfillment;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fullfilling {
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
	public void testSellerFullfillment() throws InterruptedException, AWTException, IOException {
		driver.get("https://seller.sohostyle.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		
		//Confirming all the buyer Pending orders
//		Thread.sleep(3000);
//		for(int j=0;j<=3;j++) {
//		WebElement pending = driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(pending).build().perform();
//driver.findElement(By.xpath("//a[contains(text(),'Pending Orders')]")).click();
//try {
//		List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
//		for(int i=0;i<ManageOrder.size();i++){
//			System.out.println(ManageOrder.get(i).getText());
//		}
//				ManageOrder.get(0).click();
//				WebElement ConfirmOrder = driver.findElement(By.id("orderstatustype"));
//				Select option= new Select(ConfirmOrder);
//				option.selectByVisibleText("Confirm");
//			Thread.sleep(2000);
//			driver.findElement(By.linkText("Submit")).click();
//		}catch(StaleElementReferenceException e){
//			
//			System.out.println(e.getStackTrace());
//		}
//Thread.sleep(5000);
//driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
//		}
//		
//	//Ready to ship all the confirmed order
//		for(int k=0;k<=3;k++) {
//		WebElement Confirmed = driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]"));
//			Actions action1 = new Actions(driver);
//			action1.moveToElement(Confirmed).build().perform();
//	driver.findElement(By.xpath("//a[contains(text(),'Confirmed Orders')]")).click();
//			try{
//			List<WebElement> ManageOrder1 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
//			for(int L=0;L<ManageOrder1.size();L++){
//				System.out.println(ManageOrder1.get(L).getText());
//			}
//					ManageOrder1.get(0).click();
//					WebElement ShippingOrders = driver.findElement(By.id("orderstatustype"));
//					Select option1= new Select(ShippingOrders);
//					option1.selectByVisibleText("Ready To Ship");
//				Thread.sleep(2000);
//				WebElement Logistics = driver.findElement(By.id("ddl_logistic"));
//				Select option2=new Select(Logistics);
//				option2.selectByVisibleText("Shiprocket");
//				Thread.sleep(1000);
//				
//				driver.findElement(By.id("txtshippingheight")).clear();
//				driver.findElement(By.id("txtshippingheight")).sendKeys("40");;
//				
//				driver.findElement(By.id("txtpackagelength")).clear();
//				driver.findElement(By.id("txtpackagelength")).sendKeys("40");
//				
//				driver.findElement(By.id("txtpackagewidth")).clear();
//				driver.findElement(By.id("txtpackagewidth")).sendKeys("40");
//				
//			//	driver.findElement(By.id("txtshippingweight")).clear();
//			//	driver.findElement(By.id("txtshippingweight")).sendKeys("1000");
//				Thread.sleep(5000);
//				driver.findElement(By.id("txt_awbn_no")).sendKeys("AWB#000");
//				driver.findElement(By.linkText("Submit")).click();
//				Thread.sleep(5000);
//				
//			}catch(StaleElementReferenceException e) {
//				
//				System.out.println(e.getStackTrace());
//				
//			}
//			
//			driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
//		}
		
//Manage order- click here to download manifest -- upload manifest
		for(int m=0;m<=3;m++) {
			Thread.sleep(2000);
			driver.navigate().to("https://seller.sohostyle.in/suppliermyaccount/confirmed");
			
	try{
			List<WebElement> ManageOrder2 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
			for(int N=0;N<ManageOrder2.size();N++){
				System.out.println(ManageOrder2.get(N).getText());
			}
					ManageOrder2.get(0).click();
					Thread.sleep(2000);
			WebElement maifest=	driver.findElement(By.xpath("//*[@id='manifestli']"));
			Actions action =new Actions(driver);
			action.moveToElement(maifest).click().perform();
				driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\sande\\OneDrive\\Documents\\SportManifest.jpg");
				Thread.sleep(2000);
				driver.findElement(By.linkText("Submit")).click();
				Thread.sleep(1000);
	}catch(StaleElementReferenceException e) {
		System.out.println(e.getStackTrace());
	}
	driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
	Thread.sleep(2000);
		}
		}
 @AfterMethod  // Shipped ---- Delivery
 public void Screenshot() throws InterruptedException {
	  driver.navigate().to("http://siteadmin.sohostyle.in/");
		driver.findElement(By.name("txtLogin")).sendKeys("sohostyle@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();
	  WebElement element =	driver.findElement(By.xpath("//li[@id='liSales_parent']/a"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("New Orders")).click();
		driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=215-S1764929&pid=0']/img[@title='MANAGE ORDER']")).click();
		WebElement OrderStatus1=driver.findElement(By.id("ddlorderstatus"));
		Select select1 = new Select(OrderStatus1);
		select1.selectByVisibleText("Delivered");
		WebElement PaymentStatus1 = driver.findElement(By.id("ddlpaystatus"));
		Select select2=new Select(PaymentStatus1);
		select2.selectByVisibleText("Paid");
		
		driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
		driver.findElement(By.linkText("Submit")).click();
		
		driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=216-S1764929&pid=0']/img[@title='MANAGE ORDER']")).click();
		WebElement OrderStatus2=driver.findElement(By.id("ddlorderstatus"));
		Select select3 = new Select(OrderStatus2);
		select3.selectByVisibleText("Delivered");
		WebElement PaymentStatus2 = driver.findElement(By.id("ddlpaystatus"));
		Select select4=new Select(PaymentStatus2);
		select4.selectByVisibleText("Paid");
		
		driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
		driver.findElement(By.linkText("Submit")).click();
		
		driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=217-S1764929&pid=0']/img[@title='MANAGE ORDER']")).click();
		WebElement OrderStatus3=driver.findElement(By.id("ddlorderstatus"));
		Select select5 = new Select(OrderStatus3);
		select5.selectByVisibleText("Delivered");
		WebElement PaymentStatus3 = driver.findElement(By.id("ddlpaystatus"));
		Select select6=new Select(PaymentStatus3);
		select6.selectByVisibleText("Paid");
		
		driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
		driver.findElement(By.linkText("Submit")).click();
		
		driver.findElement(By.xpath("//a[@href ='orderupdate.aspx?id=218-S1764929&pid=0']/img[@title='MANAGE ORDER']")).click();
		WebElement OrderStatus4=driver.findElement(By.id("ddlorderstatus"));
		Select select7 = new Select(OrderStatus4);
		select7.selectByVisibleText("Delivered");
		WebElement PaymentStatus4 = driver.findElement(By.id("ddlpaystatus"));
		Select select8=new Select(PaymentStatus4);
		select8.selectByVisibleText("Paid");
		
		driver.findElement(By.id("txt_desc")).sendKeys("Order Delivered Successfully and Payment Received from Buyer");
		driver.findElement(By.linkText("Submit")).click();
 }

}
