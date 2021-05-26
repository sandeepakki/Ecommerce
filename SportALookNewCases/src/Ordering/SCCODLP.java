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

public class SCCODLP {

	public static WebDriver driver;
	public static void takeScreenshot(String fileName) throws IOException {	
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\sande\\eclipse-workspace\\CSTech\\SportALookNewCases\\"+
		"src\\Ordering\\screenshots"+fileName+".jpg"));
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
	public void testCase3() throws InterruptedException, IOException {
		
		driver.get("https://sportalook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	//	
//		try {
	//
//			WebDriverWait wait =new WebDriverWait(driver,20);
//			WebElement close = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick='closepopup12();']")));
//			close.click();
//		}catch(Exception e)
//		{
//			System.out.println(e.getStackTrace());
//		}
	//	
		
		
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
		"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(1000);
		for(int i=0;i<=0;i++) {
//			P1 Seller TATA
			driver.navigate().to("https://www.sportalook.com/products/justtesting/Navy%20Blue/BMP-S1003861#.YBq0iegzbIU");
			driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"YYRT4\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|Attribute1|Attribute2|Attribute3|Attribute4\",\"BMP-S1003861\",\"products\");']")).click();
			
//	    P2 ABC Seller
			
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
		takeScreenshot("CartSCCODLP");
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.id("Applystorecra")).click();
		driver.findElement(By.id("display_storecredit")).clear();
		driver.findElement(By.id("display_storecredit")).sendKeys("1000.00");  //Store Credit
		driver.findElement(By.id("applystorecredit")).click();
		
		driver.findElement(By.id("chk_points")).click();
		driver.findElement(By.id("txt_promotionalcredits")).clear();
		driver.findElement(By.id("txt_promotionalcredits")).sendKeys("30"); //Loyalty Points
		driver.findElement(By.id("fetchpromotionalcredits")).click();
		
		WebElement cod =driver.findElement(By.xpath("//a[@id='cod_mop']"));  //COD
		Actions action3 = new Actions(driver);
		action3.moveToElement(cod).click().perform();
		takeScreenshot("SCCODLPPAGE");
	Thread.sleep(3000);
			WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
			Actions action2 = new Actions(driver);
			action2.moveToElement(placeOrder).click().perform();
		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(1000);
		driver.findElement(By.id("btncodsubmit")).click();
		Thread.sleep(3000);		
		takeScreenshot("TQSCCODLP1");
		takeScreenshot("TQSCCODLP2");
		takeScreenshot("TQSCCODLP3");
		takeScreenshot("TQSCCODLP4");
		takeScreenshot("TQSCCODLP5");
		takeScreenshot("TQSCCODLP6");
		takeScreenshot("TQSCCODLP7");
		takeScreenshot("TQSCCODLP8");
		takeScreenshot("TQSCCODLP9");
		takeScreenshot("TQSCCODLP10");
		
	}
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
