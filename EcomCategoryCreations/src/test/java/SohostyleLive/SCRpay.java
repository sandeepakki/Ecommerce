package SohostyleLive;

import java.io.IOException;
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

public class SCRpay {

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
	public void testCase3() throws InterruptedException, IOException {
		
		driver.get("https://www.sohostyle.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
//		try {
//
//			WebDriverWait wait =new WebDriverWait(driver,20);
//			WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("No Thanks")));
//			close.click();
//		}catch(Exception e)
//		{
//			System.out.println(e.getStackTrace());
//		}
		
		
		
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
		"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("Ykaft8n1");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(1000);
 	for(int i=0;i<=0;i++) {
 	//	p1			
		driver.navigate().to("https://www.sohostyle.in/products/BuyerCancelProduct/White/BMP-S1531429#.YEhkLGgzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU001\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1531429\",\"products\");']")).click();

//P2
		driver.navigate().to("https://www.sohostyle.in/products/Footwear/Brown/BMP-S1638584#.YEhkhGgzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU004\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1638584\",\"products\");']")).click();
		
//p3
		
		driver.navigate().to("https://www.sohostyle.in/products/Belt/Black/BMP-S1638584#.YEhk2WgzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU005\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1638584\",\"products\");']")).click();
		
//p4
		driver.navigate().to("https://www.sohostyle.in/products/Kurtas/Blue/BMP-S1764929#.YEhlI2gzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU002\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1764929\",\"products\");']")).click();
		
//p5
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Maroon']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU002\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1764929\",\"products\");']")).click();
	
//p6
		driver.navigate().to("https://www.sohostyle.in/products/Sareechiffron/Pink/BMP-S1764929#.YEhlx2gzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU003\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1764929\",\"products\");']")).click();
		
//p7
		driver.navigate().to("https://www.sohostyle.in/products/OrangeCaps/Orange/BMP-S1146902#.YEhmCmgzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU006\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1146902\",\"products\");']")).click();
		
		
		WebElement cart = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(cart).build().perform();
		
		driver.findElement(By.linkText("VIEW BAG")).click();
		Thread.sleep(15000);
		
		WebElement qty1 =driver.findElement(By.id("drpdownQty_0"));
		Select s1 = new Select(qty1);
		s1.selectByIndex(1);
		driver.findElement(By.className("confirm")).click();
		
		WebElement qty2 =driver.findElement(By.id("drpdownQty_1"));
		Select s2 = new Select(qty2);
		s2.selectByIndex(2);
		driver.findElement(By.className("confirm")).click();
		
		WebElement qty3 =driver.findElement(By.id("drpdownQty_2"));
		Select s3= new Select(qty3);
		s3.selectByIndex(1);
		driver.findElement(By.className("confirm")).click();
		
		WebElement qty4 =driver.findElement(By.id("drpdownQty_3"));
		Select s4= new Select(qty4);
		s4.selectByIndex(3);
		driver.findElement(By.className("confirm")).click();
		
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		
 				//storecredit
// 				driver.findElement(By.xpath("//div[@id='Applystorecra']/a")).click();   // Store Credit 
// 				driver.findElement(By.id("display_storecredit")).sendKeys("500.00");
// 				driver.findElement(By.id("applystorecredit")).click();
 				//cod
 		//		driver.findElement(By.xpath("//a[@id='btnCOD']/div[@id='addid-0']")).click();
 				Thread.sleep(3000);
 				WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
 				Actions action2 = new Actions(driver);
 				action2.moveToElement(placeOrder).click().perform();
 				
 					
// 				driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
// 				driver.findElement(By.id("btncodsubmit")).click();		
 				Thread.sleep(10000);
 				driver.navigate().to("https://www.sohostyle.in/myaccount");
 					
 	}
	}	
	@AfterClass
	public void tearDown() {

		driver.close();
	}

	
}
