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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Razorpay$LP {
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
			WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick='closepopup12();']")));
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
		for(int i=0;i<=1;i++) {
		driver.navigate().to("https://sportalook.com/search&searchkey=Men%20Tshirt/products/Men-Tshirt/Grey/BMP-S1162019#.YAV_MegzbIU");
		driver.findElement(By.linkText("M")).click();
		driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"TESTSKU01\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1162019\",\"products\");']")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://sportalook.com/runningshoesmen/products/RunningFootwearForMen/White/BMP-S1083574#.YAWcXOgzbIU");
		driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"RFFM1\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1083574\",\"products\");']")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
		
		
		driver.findElement(By.id("chk_points")).click();
		driver.findElement(By.id("txt_promotionalcredits")).clear();
		driver.findElement(By.id("txt_promotionalcredits")).sendKeys("10");   //Loyalty Points
		driver.findElement(By.id("fetchpromotionalcredits")).click();

		try {
			WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));  //RazorPay
			Actions action2 = new Actions(driver);
			action2.moveToElement(placeOrder).click().perform();
		}
	catch(Exception e) {
		e.getMessage();
	}

		Thread.sleep(2000);
		try {
		WebElement Home =	driver.findElement(By.xpath("//div[@id='back-home']//a[@href='home']"));
		Actions action3 =new Actions(driver);
		
		action3.moveToElement(Home).build().perform();
		
		action3.moveToElement(Home).click().build().perform();
		}
		catch(Exception e) {
			e.getMessage();
		}		
	}
	}
	@AfterClass
	public void tearDown() {

		driver.close();
	}

}
