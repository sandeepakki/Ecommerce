package Ordering;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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




public class NewCODorders {
	public static WebDriver driver;
	
public static void takeScreenshot(String fileName) throws IOException {	
	
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\sande\\eclipse-workspace\\CSTech\\SportALookNewCases\\src\\Ordering\\screenshots"+fileName+".jpg"));
	}


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
public void testCase1() throws InterruptedException, IOException {
	
	driver.get("https://sportalook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
//	try {
//
//		WebDriverWait wait =new WebDriverWait(driver,20);
//		WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick='closepopup12();']")));
//		close.click();
//	}catch(Exception e)
//	{
//		System.out.println(e.getStackTrace());
//	}
	
	
	
driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
	"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
	driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
	driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
	driver.findElement(By.id("signin_btnlogin")).click();
	Thread.sleep(1000);
	for(int i=0;i<=0;i++) {
//		P1 Seller TATA
		driver.navigate().to("https://www.sportalook.com/products/justtesting/Navy%20Blue/BMP-S1003861#.YBq0iegzbIU");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"YYRT4\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1003861\",\"products\");']")).click();
		
//    P2 ABC Seller
		
		driver.navigate().to("https://www.sportalook.com/search&searchkey=Running%20Footwear%20For%20Men/products/RunningFootwearForMen/White/BMP-S1083574#.YBjSf-gzbIU");
		driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"RFFM1\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1083574\",\"products\");']")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(1000);
		
//P3	
		
		driver.navigate().to("https://www.sportalook.com/products/Women-Walking-Footwear/Red/BMP-S1162019#.YBpYP-gzbIU");
		driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
		driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"TESTSKU03\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1162019\",\"products\");']")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(1000);
//P4		
		driver.navigate().to("https://www.sportalook.com/search&searchkey=Men%20Tshirt/products/Men-Tshirt/Grey/BMP-S1162019#.YBjTbugzbIU");
		driver.findElement(By.xpath("//a[@title='Dark Green']/img")).click();
		driver.findElement(By.linkText("S")).click();
		driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"TESTSKU01\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1162019\",\"products\");']")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(1000);
//P5 			
		
	driver.navigate().to("https://www.sportalook.com/search&searchkey=Men%20Tshirt/products/Men-Tshirt/Grey/BMP-S1162019#.YBjTbugzbIU");
	driver.findElement(By.xpath("//a[@title='Dark Blue']/img")).click();
	driver.findElement(By.linkText("S")).click();
	driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
	driver.findElement(By.xpath("//input[@id='QtyAdd']")).click();
	driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"TESTSKU01\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1162019\",\"products\");']")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(1000);

	
//P6	
	driver.navigate().to("https://www.sportalook.com/products/thisisatestproductupload/Light%20Blue/BMP-S1721245#.YBq2p-gzbIU");
	driver.findElement(By.linkText("S")).click();
	driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"ThisTest01\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1721245\",\"products\");']")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(1000);
	
//p7	
	driver.navigate().to("https://www.sportalook.com/products/Men-TrackPants/Black/BMP-S1721245#.YBq3AOgzbIU");
	driver.findElement(By.linkText("S")).click();
	driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"PQR2\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1721245\",\"products\");']")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	
	Thread.sleep(3000);
	takeScreenshot("CartPage0");
	driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
	
	WebElement cod =driver.findElement(By.xpath("//a[@id='cod_mop']"));  //COD
	Actions action3 = new Actions(driver);
	action3.moveToElement(cod).click().perform();
	takeScreenshot("CodPage0");
Thread.sleep(2000);
		WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(placeOrder).click().perform();
	driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
	Thread.sleep(1000);
	driver.findElement(By.id("btncodsubmit")).click();
	Thread.sleep(2000);
	takeScreenshot("ThankyouPagecod1");
	takeScreenshot("ThankyouPagecod2");
	takeScreenshot("ThankyouPagecod3");
	takeScreenshot("ThankyouPagecod4");
	takeScreenshot("ThankyouPagecod5");
	takeScreenshot("ThankyouPagecod6");
	takeScreenshot("ThankyouPagecod7");
	takeScreenshot("ThankyouPagecod8");
	takeScreenshot("ThankyouPagecod9");
	takeScreenshot("ThankyouPagecod10");
	takeScreenshot("ThankyouPagecod11");
	takeScreenshot("ThankyouPagecod12");
	takeScreenshot("ThankyouPagecod13");
	takeScreenshot("ThankyouPagecod14");
	takeScreenshot("ThankyouPagecod15");
	
}
}
@AfterClass
public void tearDown() {

	driver.close();
}
}
