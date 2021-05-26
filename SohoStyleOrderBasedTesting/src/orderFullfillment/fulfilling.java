package orderFullfillment;

import java.awt.AWTException;
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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fulfilling {

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
	public void testSellerFullfillment() throws InterruptedException, AWTException {
		
		driver.get("http://sellervedson.cstechns.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	//	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("Xyz@123");
		driver.findElement(By.id("signin_btnlogin")).click();
		
		//Confirming all the buyer Pending orders
		Thread.sleep(5000);
		for(int j=0;j<=7;j++) {
//		WebElement pending = driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(pending).build().perform();
//driver.findElement(By.xpath("//a[contains(text(),'Pending Orders')]")).click();
			driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/pending");
try {
		List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
		for(int i=0;i<ManageOrder.size();i++){
			System.out.println(ManageOrder.get(i).getText());
		}
				ManageOrder.get(0).click();
				WebElement ConfirmOrder = driver.findElement(By.id("orderstatustype"));
				Select option= new Select(ConfirmOrder);
				option.selectByVisibleText("Confirm");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Submit")).click();
		}catch(StaleElementReferenceException e){
			System.out.println(e.getStackTrace());
		}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
		}
		
	//Ready to ship all the confirmed order
		for(int k=0;k<=7;k++) {
//		WebElement Confirmed = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"));
//			Actions action1 = new Actions(driver);
//			action1.moveToElement(Confirmed).build().perform();
//	driver.findElement(By.xpath("//a[contains(text(),'Confirmed Orders')]")).click();
			driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/confirm");
			List<WebElement> ManageOrder1 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
			for(int L=0;L<ManageOrder1.size();L++){
				System.out.println(ManageOrder1.get(L).getText());
			}
					ManageOrder1.get(0).click();
					WebElement ShippingOrders = driver.findElement(By.id("orderstatustype"));
					Select option1= new Select(ShippingOrders);
					option1.selectByVisibleText("Ready To Ship");
				Thread.sleep(2000);
//				WebElement Logistics = driver.findElement(By.id("ddl_logistic"));
//				Select option2=new Select(Logistics);
//				option2.selectByVisibleText("Shiprocket");
				Thread.sleep(10000);
				driver.findElement(By.id("txt_awbn_no")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Submit")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
				Thread.sleep(2000);
		
			}	
//Manage order- click here to download manifest -- upload manifest
		
		
		
		for(int M=0;M<=7;M++) {
//			WebElement RTS = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]"));
//			Actions action2 = new Actions(driver);
//			action2.moveToElement(RTS).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Ready to Ship Orders')]")).click();
			driver.navigate().to("http://sellervedson.cstechns.com/suppliermyaccount/confirmed");
			List<WebElement> ManageOrder2 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
			for(int N=0;N<ManageOrder2.size();N++){
				System.out.println(ManageOrder2.get(N));
			}
					ManageOrder2.get(0).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[@id='manifestli']")).click();
					
					driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\sande\\OneDrive\\Documents\\SportManifest.jpg");
					Thread.sleep(2000);
				driver.findElement(By.linkText("Submit")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
				Thread.sleep(2000);
				
		}

			
		}		
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}

}
