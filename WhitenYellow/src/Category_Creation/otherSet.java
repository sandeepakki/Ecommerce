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

public class otherSet {

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
		
		//14
		
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Accelator Tuning");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Accelator-Tuning");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Aerials");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Aerials");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Air Intakes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Air-Intakes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bonnet Bras");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bonnet-Bras");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bonnet Extensions");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bonnet-Extensions");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bonnet Gas Springs");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bonnet-Gas-Springs");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bonnet Scoop");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bonnet-Scoop");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bonnets");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bonnets");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Boot Flaps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Boot-Flaps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Boot Gas Springs");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Boot-Gas-Springs");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bumper Caps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bumper-Caps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bumper Protection Strips");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bumper-Protection-Strips");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bumpers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bumpers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Beading Roll");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Beading-Roll");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Door Panel");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Door-Panel");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Garnish");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Garnish");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Grill Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Grill-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Horns");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Horns");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Lamp Frame");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Lamp-Frame");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Mirror Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Mirror-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Mirror Rain Blocker");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Mirror-Rain-Blocker");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Side Beading");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Side-Beading");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Side Scoop");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Side-Scoop");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Spoilers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Spoilers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Stickers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Stickers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Window Louvers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Window-Louvers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Window Visors");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Window-Visors");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Decorative Strips");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Decorative-Strips");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Door Protection Strips");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Door-Protection-Strips");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Front & Radiator Grills");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Front-Radiator-Grills");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Front Gril Spoilers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Front-Gril-Spoilers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Front Skirts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Front-Skirts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Front Spoilers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Front-Spoilers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Fuel Tank Caps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Fuel-Tank-Caps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Fuel Tank Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Fuel-Tank-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Headlight Brightner");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Headlight-Brightner");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Lamp Hoods");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Lamp-Hoods");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Mirrors");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Mirrors");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Mud Flaps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Mud-Flaps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
////				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Mudguards");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Mudguards");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Skirts)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Skirts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Strips)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Strips");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Protective Frames");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Protective-Frames");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Protective Strips");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Protective-Strips");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Racing Grilles");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Racing Grilles");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rear Skirts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rear-Skirts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rear Spoilers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rear-Spoilers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Reflective Tape");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Reflective-Tape");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Registeration Plate Holders");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Registeration-Plate-Holders");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Replacement Mirror Glasses");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Replacement-Mirror-Glasses");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Side Skirts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Side-Skirts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Sill Plate");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Sill-Plate");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Styling Mouldings Strip");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Styling-Mouldings-Strip");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Sunroofs");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Sunroofs");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Clock");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Clock");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Horn");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Horn");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Styling")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wind Deflector");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wind-Deflector");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//		//15
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Alloy Wheels1");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Alloy Wheels1");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bolt & Nut Covers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bolt-Nut-Covers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Tyre Rim");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Tyre-Rim");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Wheel Tyres");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Wheel-Tyres");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Farm Jacks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Farm-Jacks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Hub Cap Ties");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Hub-Cap-Ties");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Hub Centre Caps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Hub-Centre-Caps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Hub Centric Rings");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Hub-Centric-Rings");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Hubcaps & Wheel Covers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Hubcaps-Wheel-Covers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Lug Wrenches");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Lug-Wrenches");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Motorcycle Tyre Warmers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Motorcycle-Tyre-Warmers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Car Tyres, Rims, Alloys & Tools");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Car-Tyres-Rims-Alloys-Tools");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Portable air Compressors");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Portable-air-Compressors");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Puncture Repair Kits");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Puncture-Repair-Kits");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();

//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rim Brushes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rim-Brushes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rim Cleaners");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rim-Cleaners");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rim Cleaning Rags");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rim-Cleaning-Rags");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rim Sealants");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rim-Sealants");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Scissor Lift Jacks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Scissor-Lift-Jacks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Snow Chains");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Snow-Chains");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Spare Tire Hoist");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Spare-Tire-Hoist");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Spare Tyre Covers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Spare-Tyre-Covers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Spare Wheel Covers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Spare-Wheel-Covers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Stabiliser Jacks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Stabiliser-Jacks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Three Wheel Tyres");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Three-Wheel-Tyres");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tire Valve Core Tool");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tire-Valve-Core-Tool");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Torque Wrenches");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Torque-Wrenches");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Transmission Jacks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Transmission-Jacks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Trolley Jacks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Trolley-Jacks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Two Wheel Tyres");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Two-Wheel-Tyres");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre & Rim Stand");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Rim-Stand");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Air Pump");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Air-Pump");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Balancing Machines");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Balancing-Machines");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Cleaner");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Cleaner");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Gloss");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Gloss");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Inflators");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Inflators");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Lever Machines");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Lever-Machines");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Pencils");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Pencils");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Pressure Guage");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Pressure-Guage");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Sealant");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Sealant");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Tread Depth Gauges");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Tread-Depth-Gauges");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Valve Cap");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Valve-Cap");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tyre Valve Tools");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tyre-Valve-Tools");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Valve Caps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Valve-Caps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Valve Extension");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Valve-Extension");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Tyre Tubes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Tyre-Tubes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Tyres");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Tyres");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Wheel Studs");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Wheel-Studs");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Alignment Machine");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Alignment-Machine");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Alignment Tools");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Alignment-Tools");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Bolts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Bolts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Chocks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Chocks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Locking Bolts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Locking-Bolts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Locking Nuts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Locking-Nuts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Nuts");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Nuts");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Car Tyres, Rims, Alloys & Tools")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wheel Studs");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wheel-Studs");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//		//16
				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Air Flow Sensor Cleaners");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Air-Flow-Sensor-Cleaners");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Carburator Cleaners");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Carburator-Cleaners");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Degreasers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Degreasers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Engine Dressings");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Engine-Dressings");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Engine Cleaner Foams");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Engine-Cleaner-Foams");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Enging Cleaner Spray");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Enging-Cleaner-Spray");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Glossy Sealings");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Glossy-Sealingss");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Engine Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Engine Care)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Engine-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//		//17
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Fillers, Adhesives & Sealants")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Addhesives");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Addhesives");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("6.50");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Fillers, Adhesives & Sealants")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Fillers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Fillers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("6.50");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Fillers, Adhesives & Sealants")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Sealants");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Sealants");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("6.50");
//				driver.findElement(By.linkText("Submit Categories")).click();
//		//18
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Glass Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Convertible Rear Window Cleaners");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Convertible-Rear-Window-Cleaners");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Glass Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Glass Care)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Glass-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Glass Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Window Cleaner");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Window-Cleaner");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Glass Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Window Cleaning Polishes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Window-Cleaning-Polishes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Glass Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Window Seals");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Window-Seals");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("10.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
////19
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Interior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Vacuums");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Vacuums");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Interior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Dashboard & Trim Care");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Dashboard-Trim-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Interior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Interior Care)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Interior-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Interior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Plastic & Rubber Care");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Plastic-Rubber-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Interior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Upholstery Care");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Upholstery-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
////20
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Other Accessories")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Mirrors");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Mirrors");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
////21				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Additives");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Additives");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Cleaner");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Cleaner");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Cleaning Modelling Clays");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Cleaning-Modelling-Clays");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//			
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Covering Material");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Covering-Material");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Grinding Material");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Grinding-Material");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Grinding Polishing Pastes & Liquids");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Grinding-Polishing-Pastes-Liquids");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Paint & Exterior Care)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Paint-Exterior-Care");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Paint Cleaners");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Paint-Cleaners");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Paint Guns");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Paint-Guns");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Paint Guns Accessories");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Paint-Guns-Accessories");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Paint Protective Foils");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Paint-Protective-Foils");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Paint Workshop");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Paint-Workshop");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Paint Workshop Accessories");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Paint-Workshop-Accessories");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Painter Protection");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Painter-Protection");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Painting Pens");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Painting-Pens");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Polishes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Polishes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Polishing & Grinding Material Sets");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Polishing-Grinding-Material-Sets");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Polishing & Waxing Kits");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Polishing-Waxing-Kits");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Polishing Machines");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Polishing-Machines");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Pressure Washer");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Pressure-Washer");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Primers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Primers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rust Prevention");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rust-Prevention");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rust Removers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rust-Removers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Shampoos");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Shampoos");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Spot Remover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Spot-Remover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Spray Cans");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Spray-Cans");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Tapes & Reflectors");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Tapes-Reflectors");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Topcoat & Clear Paints");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Topcoat-Clear-Paints");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Paint & Exterior Care")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Waxes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Waxes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
////22
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Seats, Benches & Accessories")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Benches");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Benches");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Seats, Benches & Accessories")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Driver Seat");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Driver-Seat");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Seats, Benches & Accessories")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Seats, Benches & Accessories)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Seats-Benches-Accessories");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Seats, Benches & Accessories")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Passenger Seat");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Passenger-Seat");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Seats, Benches & Accessories")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Rear Seat");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rear-Seat");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
////23				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Covers")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Covers")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Three Wheel Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Three-Wheel-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Covers")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Two Wheeler Cover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Two-Wheeler-Cover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
////24				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Door Lock De-Icers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Door-Lock-De-Icers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Ice Protection Foils");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Ice-Protection-Foils");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Ice Scrapers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Ice-Scrapers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Vehicle Winter Goods)");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Vehicle-Winter-Goods");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Snow Brushes");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Snow-Brushes");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Snow Chains");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Snow-Chains");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				

//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Snow Socks");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Snow-Socks");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Windshield De-Icers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Windshield-De-Icers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();				
//
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Ice Goods")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Winter Car Kits");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Winter-Car-Kits");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("17.00");
//				driver.findElement(By.linkText("Submit Categories")).click();	
//				
////25
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Polishes & Wax")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Body Filler & Putty");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Body-Filler-Putty");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();	
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Polishes & Wax")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Car Polish");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Polish");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();	
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Polishes & Wax")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Dent Remover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Dent-Remover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();	
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Polishes & Wax")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Scratch Remover");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Scratch-Remover");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();	
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Polishes & Wax")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Wax");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Wax");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
//				driver.findElement(By.linkText("Submit Categories")).click();	
////26
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bicycle Mountings");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bicycle-Mountings");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Carriers");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Carriers");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Loading Ramps");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Loading-Ramps");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
//				
//				driver.findElement(By.linkText("Create New")).click();
//				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
//				driver.findElement(By.id("TxtCategory")).sendKeys("Bicycle Mountings");
//				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Bicycle-Mountings");
//				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
//				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
//				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Rood Racks");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Rood-Racks");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Roof Box Accessories");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Roof-Box-Accessories");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Storage & Transportation")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Ski Mounting & Carriers");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Ski-Mounting-Carriers");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("5.00");
				driver.findElement(By.linkText("Submit Categories")).click();
//27
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Brushes & Dusters");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Brushes-Dusters");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Car Interior Cleaner");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Interior-Cleaner");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Car Pressure Washer");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Car-Pressure-Washer");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Chain Cleaner Degreaser");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Chain-Cleaner-Degreaser");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Clothes & Towels");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Clothes-Towels");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Convertible Car Top Cleaners");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Convertible-Car-Top-Cleaners");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Other (Vehicle Washing & Cleaning)");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Other-Vehicle-Washing-Cleaning");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Snow Brushes & Ice Scrappers");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Snow-Brushes-Ice-Scrappers");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Spark Plug Cleaner");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Spark-Plug-Cleaner");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Sponges");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Sponges");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vacuum Cleaners");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vacuum-Cleaners");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Brake Care");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Brake-Care");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Brake Cleaners");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Brake-Cleaners");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Cleaning Kits");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Cleaning-Kits");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Cleaning Tools");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Cleaning-Tools");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Dryers");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Dryers");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Engine Cleaner");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Engine-Cleaner");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Glass Cleaner");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Glass-Cleaner");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Tyre Cleaner");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Tyre-Cleaner");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				driver.findElement(By.linkText("Create New")).click();
				driver.findElement(By.linkText("Vehicle Washing & Cleaning")).click();
				driver.findElement(By.id("TxtCategory")).sendKeys("Vehicle Washer Liquid");
				driver.findElement(By.id("txt_uniqueurl")).sendKeys("Vehicle-Washer-Liquid");
				driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
				driver.findElement(By.id("txt_Commission")).sendKeys("13.00");
				driver.findElement(By.linkText("Submit Categories")).click();
				
				

}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}