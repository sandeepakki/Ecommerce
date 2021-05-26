package BuyerOrderingScenarios;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class COD {

	public static WebDriver driver;
	public static void takeScreenshot(String fileName) throws IOException {	
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\sande\\eclipse-workspace\\CSTech\\SohoStyleOrderBasedTesting\\src\\BuyerOrderingScenarios\\Screenshots"+fileName+".jpg"));
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
		for(int i=0;i<=0;i++) {
//p1			
		driver.navigate().to("http://sohostyle.cstechns.com/BMP-S1638584/products/thisistestproduct/Black/BMP-S1638584#.YCN4ZWgzbIV");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"bb1001\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1638584\",\"products\");']")).click();

//P2
		driver.navigate().to("http://sohostyle.cstechns.com/BMP-S1605366/products/footwear/Brown/BMP-S1605366#.YCN3aWgzbIU");
		driver.findElement(By.linkText("UK9.5")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKUCODE\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1605366\",\"products\");']")).click();
		
//p3
		
		driver.navigate().to("http://sohostyle.cstechns.com/BMP-S1605366/products/Belts/Black/BMP-S1605366#.YCOAyGgzbIV");
		driver.findElement(By.linkText("L")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKUCode333\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1605366\",\"products\");']")).click();
		
//p4
		driver.navigate().to("http://sohostyle.cstechns.com/BMP-S1325863/products/MenKurtas/Blue/BMP-S1325863#.YCOAwWgzbIV");
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU123\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
		
//p5
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Maroon']")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU123\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
	
//p6
		driver.navigate().to("http://sohostyle.cstechns.com/BMP-S1325863/products/Self-Design-Fashion-Chiffon-Saree--m4gOrangem5g/Pink/BMP-S1325863#.YCOAvWgzbIV");
		driver.findElement(By.linkText("S")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"MP120\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
		
//p7
		driver.navigate().to("http://sohostyle.cstechns.com/BMP-S1334430/products/OrangeCap/Orange/BMP-S1334430#.YCOAuGgzbIV");
		driver.findElement(By.linkText("M")).click();
		driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"SKU555\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|0|0|0|0\",\"BMP-S1334430\",\"products\");']")).click();
		
		
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
		s2.selectByIndex(3);
		driver.findElement(By.className("confirm")).click();
		
		WebElement qty3 =driver.findElement(By.id("drpdownQty_1"));
		Select s3= new Select(qty3);
		s3.selectByIndex(4);
		driver.findElement(By.className("confirm")).click();
		
		WebElement qty4 =driver.findElement(By.id("drpdownQty_1"));
		Select s4= new Select(qty4);
		s4.selectByIndex(2);
		driver.findElement(By.className("confirm")).click();
		
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='btnCOD']/div[@id='addid-0']")).click();
		
			WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
			Actions action2 = new Actions(driver);
			action2.moveToElement(placeOrder).click().perform();
			
		driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		Thread.sleep(2000);
		driver.findElement(By.id("btncodsubmit")).click();		
		Thread.sleep(1000);
	}
	}
	@AfterClass
	public void tearDown() {

		driver.close();
	}
}
