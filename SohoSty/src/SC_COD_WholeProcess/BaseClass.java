package SC_COD_WholeProcess;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseClass {

	public static WebDriver driver;
	public static void takeScreenshot(String fileName) throws IOException {	
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\sande\\OneDrive\\Documents\\SohostyleOrders\\SC+Cod\\ss"+fileName+".png") );
		   
		}
	@BeforeTest
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
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
