package Category_Creation;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addingCategories {

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
		//---- sub categories
		//1
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Bedding");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Bedding");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("8.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Furniture");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Furniture");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("8.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Gear");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Gear");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("8.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Room Decor");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Room-Decor");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("8.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Room Lighting");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Room-Lighting");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Safety");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Safety");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("8.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText("Baby Furniture & Safety")).click();
		driver.findElement(By.id("TxtCategory")).sendKeys("Car Seats & Accessories");
		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car Seats & Accessories");
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys("7.00");
		driver.findElement(By.linkText("Submit Categories")).click();
		//2
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Diapering & Wipes");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Diapering-Wipes");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		//3
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Feeding & Nursing");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Feeding-Nursing");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		//4
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Food & Nutrition");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Food-Nutrition");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("8.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//
//		//5
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Health Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Health-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		//6
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Baby Potty");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Baby-Potty");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		//7
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Bath Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bath-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		//8
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Ear & Nose Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Ear-Nose-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		//9
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Hair Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Hair-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("4.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		//10
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Maternity Wear");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Maternity-Wear");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		//11
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Mosquito Repellant");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Mosquito-Repellant");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		//12
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Nail Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Nail-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		//13	
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Oral Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Oral-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();		
//		//14
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Other Baby Care & Accessories");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Baby-Care-Accessories");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();		
		//15
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Skin Care");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Skin-Care");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//		driver.findElement(By.linkText("Submit Categories")).click();		
		//16
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Drive Belts");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Drive-Belts");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		
//		//17
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Baby Care & Accessories")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Drive Shafts & Accessories");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Drive-Shafts-Accessories");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		
////		//18
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Engine, Parts & Tools");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Engine-Parts-Tools");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		
////		//19
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Exhaust System & Tools");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Exhaust-System-Tools");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
//		
////		//20
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Filters");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Filters");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//21
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Gearboxes");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Gearboxes");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//22
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Ignition & Tools");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Ignition-Tools");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//23
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Parts");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Parts");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//24
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Car Steering & Suspension");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Steering-Suspension");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//25
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Fuses");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Fuses");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//26
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Instruments");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Instruments");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();
////		
////		//27
//		driver.findElement(By.linkText("Create New")).click();
//		driver.findElement(By.linkText("Automotive Spare Parts")).click();
//		driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Oil, Fluid & Lubricants");
//		driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Oil-Fluid-Lubricants");
//		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//		driver.findElement(By.id("txt_Commission")).sendKeys("6.00");
//		driver.findElement(By.linkText("Submit Categories")).click();

		
		
		
	}
		@AfterClass
		public void tearDown() {
			driver.close();
		}
	}
