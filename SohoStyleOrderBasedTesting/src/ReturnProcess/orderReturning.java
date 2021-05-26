package ReturnProcess;

import java.io.IOException;
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

public class orderReturning {

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
	public void testCase1() throws InterruptedException, IOException {
		
		driver.get("http://sohostyle.cstechns.com/");
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
		Thread.sleep(5000);
//1		
	driver.navigate().to("http://sohostyle.cstechns.com/ReturnOrderdeatilView/165-S1325863-SKU123?prdtxt=BMP-S1325863|SKU123|Blue|S|0|0|0|0|0|0");
	driver.findElement(By.linkText("Return")).click();
	 
	WebElement qty = driver.findElement(By.id("ddlquantity"));
	Select s1 = new Select(qty);
	s1.selectByValue("1");
	
	WebElement reason = driver.findElement(By.id("ddlreason"));
	Select s2 = new Select(reason);
	s2.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type = driver.findElement(By.id("ddlreturnstatus"));
	Select s3 = new Select(type);
	s3.selectByVisibleText("Replace");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
	
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	driver.findElement(By.xpath("//span[@class='btn-orange']/a")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
//2
	driver.navigate().to("http://sohostyle.cstechns.com/ReturnOrderdeatilView/165-S1325863-SKU123?prdtxt=BMP-S1325863|SKU123|Blue|S|0|0|0|0|0|0");
	driver.findElement(By.linkText("Return")).click();
	 
	WebElement qty2 = driver.findElement(By.id("ddlquantity"));
	Select s7 = new Select(qty2);
	s7.selectByValue("1");
	
	WebElement reason3 = driver.findElement(By.id("ddlreason"));
	Select s8 = new Select(reason3);
	s8.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type2 = driver.findElement(By.id("ddlreturnstatus"));
	Select s9 = new Select(type2);
	s9.selectByVisibleText("Refund");
	
	WebElement credit = driver.findElement(By.id("ddlCreadittype"));
	Select s13 = new Select(credit);
	s13.selectByVisibleText("Store Credit");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
	
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	driver.findElement(By.xpath("//span[@class='btn-orange']/a")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);

//3	
	driver.navigate().to("http://sohostyle.cstechns.com/ReturnOrderdeatilView/165-S1325863-SKU123?prdtxt=BMP-S1325863|SKU123|Blue|S|0|0|0|0|0|0");
	driver.findElement(By.linkText("Return")).click();
	 
	WebElement qty1 = driver.findElement(By.id("ddlquantity"));
	Select s4 = new Select(qty1);
	s4.selectByValue("1");
	
	WebElement reason1 = driver.findElement(By.id("ddlreason"));
	Select s5 = new Select(reason1);
	s5.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type1 = driver.findElement(By.id("ddlreturnstatus"));
	Select s6 = new Select(type1);
	s6.selectByVisibleText("Replace");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
	
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	driver.findElement(By.xpath("//span[@class='btn-orange']/a")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
//4
	driver.navigate().to("http://sohostyle.cstechns.com/ReturnOrderdeatilView/165-S1325863-SKU123?prdtxt=BMP-S1325863|SKU123|Maroon|S|0|0|0|0|0|0");
	driver.findElement(By.linkText("Return")).click();
	 
	WebElement qty3 = driver.findElement(By.id("ddlquantity"));
	Select s14 = new Select(qty3);
	s14.selectByValue("1");
	
	WebElement reason12 = driver.findElement(By.id("ddlreason"));
	Select s15 = new Select(reason12);
	s15.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type3 = driver.findElement(By.id("ddlreturnstatus"));
	Select s16 = new Select(type3);
	s16.selectByVisibleText("Refund");
	
	WebElement credit1 = driver.findElement(By.id("ddlCreadittype"));
	Select s17 = new Select(credit1);
	s17.selectByVisibleText("Store Credit");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Refund of Product");
	
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	driver.findElement(By.xpath("//span[@class='btn-orange']/a")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
//5	
	driver.navigate().to("http://sohostyle.cstechns.com/ReturnOrderdeatilView/165-S1325863-MP120?prdtxt=BMP-S1325863|MP120|Pink|S|0|0|0|0|0|0");
	driver.findElement(By.linkText("Return")).click();
	 
	WebElement qty5 = driver.findElement(By.id("ddlquantity"));
	Select s10 = new Select(qty5);
	s10.selectByValue("1");
	
	WebElement reason4 = driver.findElement(By.id("ddlreason"));
	Select s11 = new Select(reason4);
	s11.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type4 = driver.findElement(By.id("ddlreturnstatus"));
	Select s12 = new Select(type4);
	s12.selectByVisibleText("Refund");
	
	WebElement credit2 = driver.findElement(By.id("ddlCreadittype"));
	Select s18 = new Select(credit2);
	s18.selectByVisibleText("Store Credit");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Refnd of Product");
	
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	driver.findElement(By.xpath("//span[@class='btn-orange']/a")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);

	//6
		driver.navigate().to("http://sohostyle.cstechns.com/ReturnOrderdeatilView/165-S1325863-SKU123?prdtxt=BMP-S1325863|SKU123|Blue|S|0|0|0|0|0|0");
		driver.findElement(By.linkText("Return")).click();
		 
		WebElement qty6 = driver.findElement(By.id("ddlquantity"));
		Select s19 = new Select(qty6);
		s19.selectByValue("1");
		
		WebElement reason5 = driver.findElement(By.id("ddlreason"));
		Select s20 = new Select(reason5);
		s20.selectByVisibleText("Unhappy with the product quality");
		
		WebElement type6 = driver.findElement(By.id("ddlreturnstatus"));
		Select s21 = new Select(type6);
		s21.selectByVisibleText("Replace");
		
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
		
		
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
		
		driver.findElement(By.xpath("//span[@class='btn-orange']/a")).click();
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(2000);
	
}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
