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

public class sellerConfirm {

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
	public void testApproveRequest_Refund() throws InterruptedException{
		
		
		driver.get("https://seller.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sportalook17@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("sal");
		driver.findElement(By.id("signin_btnlogin")).click();
// return order of the product.		
		Thread.sleep(5000);
		//for(int j=1;j<=3;j++) {
			
		WebElement element = driver.findElement(By.xpath("//a[@href='ReturnOrderList']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
//Replace
	driver.navigate().to("https://seller.sportalook.com/ReturnOrderDetailsView/supplier&orderid=2025&Returnid=5899106&type=Return");
	Thread.sleep(30000);
	driver.navigate().to("https://seller.sportalook.com/supplierorderdetails/supplier&orderid=2012");

	WebElement ConfirmOrder = driver.findElement(By.id("orderstatustype"));
	Select option= new Select(ConfirmOrder);
	option.selectByVisibleText("Confirm");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Dashboard']"));
		
		WebElement pending = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(pending).build().perform();
driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();

for(int k=0;k<=1;k++) {
WebElement element1 = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
Actions action2 = new Actions(driver);
action2.moveToElement(element1).build().perform();
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

}	
//Manage order- click here to download manifest -- upload manifest



for(int M=0;M<=1;M++) {
WebElement element1 = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
Actions action3 = new Actions(driver);
action3.moveToElement(element1).build().perform();
driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]")).click();

List<WebElement> ManageOrder1 = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
for(int N=0;N<ManageOrder1.size();N++){
System.out.println(ManageOrder1.get(N));
}
	ManageOrder1.get(0).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='manifestli']")).click();
	
	driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\sande\\OneDrive\\Documents\\SportManifest.jpg");
	Thread.sleep(2000);
driver.findElement(By.linkText("Submit")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='confirm']")).click();

}
		}
//2
//Refund
//		driver.navigate().to("https://seller.sportalook.com/ReturnOrderDetailsView/supplier&orderid=&Returnid=6220445&type=Refund");
//		Thread.sleep(15000);



	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}

}
