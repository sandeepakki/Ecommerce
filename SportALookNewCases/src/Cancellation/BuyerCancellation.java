package Cancellation;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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

public class BuyerCancellation {
	
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
		driver.findElement(By.id("left_txtpwd")).sendKeys("Xyz@123");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(7000);
	
		List<WebElement> CancelOrder = driver.findElements(By.linkText(""));
		for(int i=0;i<CancelOrder.size();i++){
			System.out.println(CancelOrder.get(i).getText());
		}
				CancelOrder.get(3).click();
		
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	
		
		
}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}