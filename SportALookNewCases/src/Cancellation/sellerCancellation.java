package Cancellation;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class sellerCancellation {

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
		
		driver.get("https://seller.sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("soniyaprabhu92@rediffmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("sal");
		driver.findElement(By.id("signin_btnlogin")).click();
		
		//Cancellation of the buyer Pending order
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]"+
		"/nav[1]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")).click();
		 driver.navigate().to("https://seller.sportalook.com/supplierorderdetails/supplier&orderid=2446");
				WebElement CancelOrder = driver.findElement(By.id("orderstatustype"));
				Select option= new Select(CancelOrder);
				option.selectByVisibleText("Seller Cancellation");
				driver.findElement(By.name("txt_rejection_reason")).sendKeys("Cancellaton");
		Thread.sleep(20000);
		}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
