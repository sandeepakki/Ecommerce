package CashOnDeliveryProcess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SellerApproval_Fullfill extends BaseClass {

	@BeforeMethod
	public void sellerlogin() throws InterruptedException {
		
		driver.navigate().to("https://seller.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();	
		Thread.sleep(5000);
		
	}

	
	
	@Test
	public void testReplaceFullfill() throws InterruptedException {
		
		
		//for(int j=1;j<=3;j++) {
		
		WebElement element = driver.findElement(By.xpath("//a[@href='ReturnOrderList']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.id("left_txtemail")).sendKeys("sportalook17@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("sal");
		driver.findElement(By.id("signin_btnlogin")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//a[@href='ReturnOrderList']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).build().perform();
		driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
		
//Replace
		List<WebElement> VPTR = driver.findElements(By.linkText("View Product to be Returned"));
		for(int i=0;i<VPTR.size();i++){
			System.out.println(VPTR.get(i).getText());
			}
				VPTR.get(0).click();
				Thread.sleep(30000);
				
			
				WebElement pending = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
				Actions action2 = new Actions(driver);
				action2.moveToElement(pending).build().perform();
		driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
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
					driver.findElement(By.xpath("//a[text()='Dashboard']"));
			
			WebElement pending1 = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
			Actions action3 = new Actions(driver);
			action3.moveToElement(pending1).build().perform();
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();

	//for(int k=0;k<=1;k++) {
	WebElement element3 = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
	Actions action4 = new Actions(driver);
	action4.moveToElement(element3).build().perform();
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]")).click();

	List<WebElement> ManageOrder1 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
	for(int L=0;L<ManageOrder1.size();L++){
	System.out.println(ManageOrder1.get(L).getText());
	}
		ManageOrder1.get(0).click();
		WebElement ShippingOrders = driver.findElement(By.id("orderstatustype"));
		Select option2= new Select(ShippingOrders);
		option2.selectByVisibleText("Ready To Ship");
	Thread.sleep(2000);
	WebElement Logistics = driver.findElement(By.id("ddl_logistic"));
	Select option3=new Select(Logistics);
	option3.selectByVisibleText("Delhivery");
	Thread.sleep(1000);
	driver.findElement(By.id("txtshippingweight")).clear();
	driver.findElement(By.id("txtshippingweight")).sendKeys("500");
	driver.findElement(By.linkText("Click here for AWB number")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Dashboard']"));
	Thread.sleep(2000);

//	}	
	//Manage order- click here to download manifest -- upload manifest



//	for(int M=0;M<=1;M++) {
	WebElement element4 = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
	Actions action5 = new Actions(driver);
	action5.moveToElement(element4).build().perform();
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]"+
	"/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]")).click();

	List<WebElement> ManageOrder2 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
	for(int N=0;N<ManageOrder2.size();N++){
	System.out.println(ManageOrder2.get(N));
	}
		ManageOrder2.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='manifestli']")).click();
		
		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\sande\\OneDrive\\Documents\\SportManifest.jpg");
		Thread.sleep(2000);
		
		
		
		
		}	
		
		//Refund
		   //	driver.navigate().to("https://seller.sportalook.com/ReturnOrderDetailsView/supplier&orderid=&Returnid=6220445&type=Refund");
		  //	Thread.sleep(15000);
		
		@AfterMethod
		public void Submit() throws InterruptedException {
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='confirm']")).click();

	 }
			}

	
	//}

