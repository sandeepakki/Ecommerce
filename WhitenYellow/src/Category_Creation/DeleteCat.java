package Category_Creation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteCat {

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
		public void testCouponDiscount() throws InterruptedException {
			
			driver.get("https://b2cdemositeadmin.retaxis.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.findElement(By.name("txtLogin")).sendKeys("sportalook@cstech.in");
			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
			
			driver.findElement(By.name("btnSubmit")).click();
//10 percent discount coupon			
			WebElement element = driver.findElement(By.id("liSales_parent"));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.linkText("Coupon Codes")).click();
			for(int i=0;i<=70;i++)
			try {
				List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='Delete']"));
				for(int j=0;j<ManageOrder.size();j++){
					System.out.println(ManageOrder.get(j).getText());
				}
						ManageOrder.get(i).click();
						driver.switchTo().alert().accept();
						}
						catch(Exception f) {
							
							f.printStackTrace();
						}
			
		}
		@AfterClass()
		public void tearDown() {
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			driver.quit();
		}

}
