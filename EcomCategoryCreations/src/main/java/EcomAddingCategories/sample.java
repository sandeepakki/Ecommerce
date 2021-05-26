package EcomAddingCategories;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample {



		WebDriver driver;
		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		@Test
		public void testadmincancel() throws InterruptedException, AWTException {
		
			driver.get("http://siteadminvedson.cstechns.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("txtLogin")).sendKeys("vedson@cstech.in");
			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
			driver.findElement(By.name("btnSubmit")).click();
			WebElement element = driver.findElement(By.id("liCatalog"));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.linkText("Product Categories")).click();
			Thread.sleep(1000);

			
			
			
		}

		@AfterClass
		public void tearDown() {
			driver.close();
		}
	}

