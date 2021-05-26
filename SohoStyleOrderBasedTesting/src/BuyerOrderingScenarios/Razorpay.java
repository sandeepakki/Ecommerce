package BuyerOrderingScenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Razorpay {
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
	public void testCase2() throws InterruptedException, IOException {
		
		driver.get("http://sohostyle.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		try {

			WebDriverWait wait =new WebDriverWait(driver,20);
			WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("No Thanks")));
			close.click();
		}catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
		
		
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
		"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("Ykaft8n1");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(1000);
		for(int i=0;i<=3;i++) {
		
			driver.navigate().to("http://sohostyle.cstechns.com/search&searchkey=Test/products/test/Black/BMP-S1325863#.YBQALugzbIU");
			driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"123\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
			driver.navigate().to("http://sohostyle.cstechns.com/search&searchkey=Test/products/AristaNecklace/Testing/BMP-S1244107#.YBQA-egzbIU");
			driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"002\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1244107\",\"products\");']")).click();
			
			WebElement cart = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"));
			Actions action = new Actions(driver);
			action.moveToElement(cart).build().perform();
			
			driver.findElement(By.linkText("VIEW BAG")).click();
			
			WebElement qty1 =driver.findElement(By.id("drpdownQty_0"));
			Select s1 = new Select(qty1);
			s1.selectByIndex(1);
			
			driver.findElement(By.className("confirm")).click();
			
			WebElement qty2 =driver.findElement(By.id("drpdownQty_1"));
			Select s2 = new Select(qty2);
			s2.selectByIndex(1);
			
			driver.findElement(By.className("confirm")).click();
			
			driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
			Thread.sleep(2000);
	
			WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
			Actions action2 = new Actions(driver);
			action2.moveToElement(placeOrder).click().perform();
			Thread.sleep(15000);
		}	
	}
	
	@AfterClass
	public void tearDown() {

		driver.close();
	}
}


