import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class orderReturnRequest {

	public static WebDriver driver;
	
//	public static void takeScreenshot(String fileName) throws IOException {	
//		
//			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file,new File("C:\\Users\\sande\\eclipse-workspace\\CSTech\\SportALookNewCases\\"+
//			"src\\Ordering\\screenshots"+fileName+".jpg"));
//		}


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
//		
		
	driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
		"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(2000);
//1		
	driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2420-S1162019");
	driver.findElement(By.linkText("Return")).click();
	driver.navigate().to("https://www.sportalook.com/ReturnOrderdeatilView/2420-S1162019-TESTSKU01?prdtxt=BMP-S1162019|TESTSKU01|Dark%20Blue|S|0|0|0|0|0|0");
	WebElement qty1 = driver.findElement(By.id("ddlquantity"));
	Select s1 = new Select(qty1);
	s1.selectByValue("1");	
	WebElement reason1 = driver.findElement(By.id("ddlreason"));
	Select s2 = new Select(reason1);
	s2.selectByVisibleText("Unhappy with the product quality");	
	WebElement type1 = driver.findElement(By.id("ddlreturnstatus"));
	Select s3 = new Select(type1);
	s3.selectByVisibleText("Replace");
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replace");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
//2	
	driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2420-S1162019");
	driver.findElement(By.linkText("Return")).click();
	driver.navigate().to("https://www.sportalook.com/ReturnOrderdeatilView/2420-S1162019-TESTSKU01?prdtxt=BMP-S1162019|TESTSKU01|Dark%20Blue|S|0|0|0|0|0|0");
	WebElement qty2 = driver.findElement(By.id("ddlquantity"));
	Select s4 = new Select(qty2);
	s4.selectByValue("1");	
	WebElement reason2 = driver.findElement(By.id("ddlreason"));
	Select s5 = new Select(reason2);
	s5.selectByVisibleText("Unhappy with the product quality");	
	WebElement type2 = driver.findElement(By.id("ddlreturnstatus"));
	Select s6 = new Select(type2);
	s6.selectByVisibleText("Refund");	
	WebElement credit = driver.findElement(By.id("ddlCreadittype"));
	Select s7 = new Select(credit);
	s7.selectByVisibleText("Store Credit");
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Refund");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);	
	
//3	
	driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2420-S1162019");
	driver.findElement(By.linkText("Return")).click();
	 driver.navigate().to("https://www.sportalook.com/ReturnOrderdeatilView/2420-S1162019-TESTSKU01?prdtxt=BMP-S1162019|TESTSKU01|Dark%20Green|S|0|0|0|0|0|0");
	WebElement qty3 = driver.findElement(By.id("ddlquantity"));
	Select s8 = new Select(qty3);
	s8.selectByValue("1");
	
	WebElement reason3 = driver.findElement(By.id("ddlreason"));
	Select s9 = new Select(reason3);
	s9.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type3 = driver.findElement(By.id("ddlreturnstatus"));
	Select s10 = new Select(type3);
	s10.selectByVisibleText("Replace");
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replace");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);

//4
	driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2420-S1162019");
	driver.findElement(By.linkText("Return")).click();
	driver.navigate().to("https://www.sportalook.com/ReturnOrderdeatilView/2420-S1162019-TESTSKU01?prdtxt=BMP-S1162019|TESTSKU01|Dark%20Blue|S|0|0|0|0|0|0");
	WebElement qty4 = driver.findElement(By.id("ddlquantity"));
	Select s11 = new Select(qty4);
	s11.selectByValue("1");
	
	WebElement reason4 = driver.findElement(By.id("ddlreason"));
	Select s12 = new Select(reason4);
	s12.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type4 = driver.findElement(By.id("ddlreturnstatus"));
	Select s13 = new Select(type4);
	s13.selectByVisibleText("Refund");
	
	WebElement credit2 = driver.findElement(By.id("ddlCreadittype"));
	Select s14 = new Select(credit2);
	s14.selectByVisibleText("Store Credit");
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Refund");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");	
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
//5
	driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2420-S1162019");
	driver.findElement(By.linkText("Return")).click();
	 driver.navigate().to("https://www.sportalook.com/ReturnOrderdeatilView/2420-S1162019-TESTSKU03?prdtxt=BMP-S1162019|TESTSKU03|Red|UK3m6g5|0|0|0|0|0|0");
	WebElement qty5 = driver.findElement(By.id("ddlquantity"));
	Select s15 = new Select(qty5);
	s15.selectByValue("1");
	
	WebElement reason5 = driver.findElement(By.id("ddlreason"));
	Select s16 = new Select(reason5);
	s16.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type5 = driver.findElement(By.id("ddlreturnstatus"));
	Select s17 = new Select(type5);
	s17.selectByVisibleText("Refund");
	
	WebElement credit3 = driver.findElement(By.id("ddlCreadittype"));
	Select s18 = new Select(credit3);
	s18.selectByVisibleText("Store Credit");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Refund");
	
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
//6
	driver.navigate().to("https://www.sportalook.com/orderdetailsreturns/2420-S1162019");
	driver.findElement(By.linkText("Return")).click();
	 driver.navigate().to("https://www.sportalook.com/ReturnOrderdeatilView/2420-S1162019-TESTSKU01?prdtxt=BMP-S1162019|TESTSKU01|Dark%20Blue|S|0|0|0|0|0|0");
	WebElement qty6 = driver.findElement(By.id("ddlquantity"));
	Select s19 = new Select(qty6);
	s19.selectByValue("1");
	
	WebElement reason6 = driver.findElement(By.id("ddlreason"));
	Select s20 = new Select(reason6);
	s20.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type6 = driver.findElement(By.id("ddlreturnstatus"));
	Select s21 = new Select(type6);
	s21.selectByVisibleText("Replace");
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replace");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
		
}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
