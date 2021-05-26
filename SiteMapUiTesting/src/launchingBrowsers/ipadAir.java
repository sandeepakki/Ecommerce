package launchingBrowsers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ipadAir {
	private static String[] links=null;
	private static int tagCount=0;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension dimension=new Dimension(820 , 1180);				
		driver.manage().window().setSize(dimension);
		driver.get("https://www.sohostyle.in/sitemap.xml");
		driver.getPageSource().contains("https://www.sportalook.com");
		List<WebElement> tagSize = driver.findElements(By.xpath("//*[contains(text(),'http://sohostyle.in')]"));
		tagCount = tagSize.size();
		System.out.println("Total no of tags Available: "+tagCount);
		links = new String[tagCount];
		for(int i=0;i<tagCount;i++)
		{
		links[i] = tagSize.get(i).getText();
		System.out.println("All Tags"+links[i]);
	
		}
	// navigate to each Link on the webpage
		for(int i=tagCount/2;i<=368;i++)
	{
		driver.navigate().to(links[i]);		
		Thread.sleep(3000);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
       ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\sande\\OneDrive\\Documents\\Sohostyle\\ipadAir4th\\SS"+i+".png") );
	   
		}
}

}
