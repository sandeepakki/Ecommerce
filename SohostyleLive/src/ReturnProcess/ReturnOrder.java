package ReturnProcess;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReturnOrder {
	
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
		driver.get("https://sohostyle.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
				"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
				driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
				driver.findElement(By.id("left_txtpwd")).sendKeys("Ykaft8n1");
				driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(3000);
//1		same set - Replace
	driver.navigate().to("https://www.sohostyle.in/orderdetailsreturns/214-S1764929");
	Thread.sleep(2000);
	 driver.navigate().to("https://www.sohostyle.in/ReturnOrderdeatilView/214-S1764929-SKU002?prdtxt=BMP-S1764929|SKU002|Blue|0|0|0|0|0|0|0");
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
	WebElement element1 = driver.findElement(By.xpath("//span[@class='btn-orange']/a"));
	Thread.sleep(2000);
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).click().perform();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
//1 Same set  - Refund
	driver.navigate().to("https://www.sohostyle.in/orderdetailsreturns/214-S1764929");
	Thread.sleep(2000);
	 driver.navigate().to("https://www.sohostyle.in/ReturnOrderdeatilView/214-S1764929-SKU002?prdtxt=BMP-S1764929|SKU002|Blue|0|0|0|0|0|0|0");
	WebElement qty1 = driver.findElement(By.id("ddlquantity"));
	Select s4 = new Select(qty1);
	s4.selectByValue("1");
	
	WebElement reason1 = driver.findElement(By.id("ddlreason"));
	Select s5 = new Select(reason1);
	s5.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type1 = driver.findElement(By.id("ddlreturnstatus"));
	Select s6 = new Select(type1);
	s6.selectByVisibleText("Refund");
	
	WebElement credit = driver.findElement(By.id("ddlCreadittype"));
	Select s13 = new Select(credit);
	s13.selectByVisibleText("Store Credit");
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Refund");
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	WebElement element2 = driver.findElement(By.xpath("//span[@class='btn-orange']/a"));
	Actions action2 = new Actions(driver);
	action2.moveToElement(element2).click().perform();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
//2 Same product  - Replace
	driver.navigate().to("https://www.sohostyle.in/orderdetailsreturns/214-S1764929");
	Thread.sleep(2000);
	driver.navigate().to("https://www.sohostyle.in/ReturnOrderdeatilView/214-S1764929-SKU002?prdtxt=BMP-S1764929|SKU002|Blue|0|0|0|0|0|0|0");
	WebElement qty2 = driver.findElement(By.id("ddlquantity"));
	Select s7 = new Select(qty2);
	s7.selectByValue("1");
	
	WebElement reason3 = driver.findElement(By.id("ddlreason"));
	Select s8 = new Select(reason3);
	s8.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type2 = driver.findElement(By.id("ddlreturnstatus"));
	Select s9 = new Select(type2);
	s9.selectByVisibleText("Replace");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	WebElement element3 =	driver.findElement(By.xpath("//span[@class='btn-orange']/a"));
	Actions action3 = new Actions(driver);
	action3.moveToElement(element3).click().perform();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
//2 Same Product - Refund
	driver.navigate().to("https://www.sohostyle.in/orderdetailsreturns/214-S1764929");
	Thread.sleep(2000);
	driver.navigate().to("https://www.sohostyle.in/ReturnOrderdeatilView/214-S1764929-SKU002?prdtxt=BMP-S1764929|SKU002|Maroon|0|0|0|0|0|0|0");
	 
	WebElement qty3 = driver.findElement(By.id("ddlquantity"));
	Select s10 = new Select(qty3);
	s10.selectByValue("1");
	
	WebElement reason4 = driver.findElement(By.id("ddlreason"));
	Select s11 = new Select(reason4);
	s11.selectByVisibleText("Unhappy with the product quality");
	
	WebElement type3 = driver.findElement(By.id("ddlreturnstatus"));
	Select s12 = new Select(type3);
	s12.selectByVisibleText("Refund");
	
	WebElement credit1 = driver.findElement(By.id("ddlCreadittype"));
	Select s14 = new Select(credit1);
	s14.selectByVisibleText("Store Credit");
	
	driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
	
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
	driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
	
	WebElement element4 =driver.findElement(By.xpath("//span[@class='btn-orange']/a"));
	Actions action4 = new Actions(driver);
	action4.moveToElement(element4).click().perform();
	
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
	//3 Different Product  - Replace
		driver.navigate().to("https://www.sohostyle.in/orderdetailsreturns/214-S1764929");
		Thread.sleep(2000);
		driver.navigate().to("https://www.sohostyle.in/ReturnOrderdeatilView/214-S1764929-SKU002?prdtxt=BMP-S1764929|SKU002|Blue|0|0|0|0|0|0|0");
		 
		WebElement qty4 = driver.findElement(By.id("ddlquantity"));
		Select s15 = new Select(qty4);
		s15.selectByValue("1");
		
		WebElement reason5 = driver.findElement(By.id("ddlreason"));
		Select s16 = new Select(reason5);
		s16.selectByVisibleText("Unhappy with the product quality");
		
		WebElement type4 = driver.findElement(By.id("ddlreturnstatus"));
		Select s17 = new Select(type4);
		s17.selectByVisibleText("Replace");
		
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
		
		
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
		
		WebElement element5 =driver.findElement(By.xpath("//span[@class='btn-orange']/a"));
		Actions action5 = new Actions(driver);
		action5.moveToElement(element5).click().perform();
		
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(2000);
		
	//3 Different Product - Refund
		driver.navigate().to("https://www.sohostyle.in/orderdetailsreturns/214-S1764929");
		Thread.sleep(2000);
		driver.navigate().to("https://www.sohostyle.in/ReturnOrderdeatilView/214-S1764929-SKU003?prdtxt=BMP-S1764929|SKU003|Pink|0|0|0|0|0|0|0");
		 
		WebElement qty5 = driver.findElement(By.id("ddlquantity"));
		Select s18 = new Select(qty5);
		s18.selectByValue("1");
		
		WebElement reason6 = driver.findElement(By.id("ddlreason"));
		Select s19 = new Select(reason6);
		s19.selectByVisibleText("Unhappy with the product quality");
		
		WebElement type5 = driver.findElement(By.id("ddlreturnstatus"));
		Select s20 = new Select(type5);
		s20.selectByVisibleText("Refund");
		
		WebElement credit2 = driver.findElement(By.id("ddlCreadittype"));
		Select s21= new Select(credit2);
		s21.selectByVisibleText("Store Credit");
		
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Replacement of Product");
		
		
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i3.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i2.jpg");
		driver.findElement(By.id("filewithboximg")).sendKeys("C:\\Users\\sande\\Dropbox\\My PC (Sandeep)\\Downloads\\i1.jpg");
		
		WebElement element6 =driver.findElement(By.xpath("//span[@class='btn-orange']/a"));
		Actions action6 = new Actions(driver);
		action6.moveToElement(element6).click().perform();
		
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='Orderreturn']")).click();
		
	}

	@AfterMethod // return Approving
	public void approve() throws IOException {
		
		driver.get("http://siteadmin.sohostyle.in/");
		driver.findElement(By.name("txtLogin")).sendKeys("sohostyle@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element =	driver.findElement(By.id("liSales_parent"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Return Request")).click();
	//1	
		for (int j=0;j<=5;j++) {
		List<WebElement> VPTR = driver.findElements(By.linkText("View Product to be Returned"));
		for(int i=0;i<VPTR.size();i++){
			System.out.println(VPTR.get(i).getText());
		}
				VPTR.get(0).click();
				
				WebElement status1= driver.findElement(By.id("ddlpaystatus"));
				Select s1 = new Select(status1);
				s1.selectByVisibleText("Approved");
				
				driver.findElement(By.id("txt_desc")).sendKeys("return approved");
				
				driver.findElement(By.linkText("Submit")).click();
		
		}

		driver.close();
	}


}
