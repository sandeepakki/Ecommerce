package ReturnProcess;

import java.awt.AWTException;
import java.util.List;
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

public class returnApproval {

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
	public void testadminreturnReqst() throws InterruptedException, AWTException {
	
		driver.get("http://siteadminsohostyle.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("sohostyle@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		
		driver.findElement(By.name("btnSubmit")).click();
		
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
	
}
@AfterClass
public void tearDown() {
	driver.close();
}
}
