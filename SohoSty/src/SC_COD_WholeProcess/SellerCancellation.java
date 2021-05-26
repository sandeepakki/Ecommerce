package SC_COD_WholeProcess;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SellerCancellation extends BaseClass {

	@BeforeMethod
	public void login() {
		driver.get("https://seller.sohostyle.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakki03@gmail.com");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
	}
	@Test
	public void testSellerCancellation() throws InterruptedException, AWTException, IOException {	
		//Cancellation of the buyer Pending order
		WebElement Orders = driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(Orders).build().perform();
driver.findElement(By.xpath("//a[contains(text(),'Pending Orders')]")).click();
try {
		List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
		for(int i=0;i<ManageOrder.size();i++){
			System.out.println(ManageOrder.get(i).getText());
		}
				ManageOrder.get(0).click();
				WebElement CancelOrder = driver.findElement(By.id("orderstatustype"));
				Select option= new Select(CancelOrder);
				option.selectByVisibleText("Seller Cancellation");
				driver.findElement(By.name("txt_rejection_reason")).sendKeys("Cancellaton");
				takeScreenshot("6"); 
				driver.findElement(By.xpath("//a[@id='btn_reject']")).click();
			//	driver.findElement(By.xpath("//button[@class='confirm']")).click();
}
				catch(StaleElementReferenceException e){
					System.out.println(e.getStackTrace());
				} 
         takeScreenshot("7");
		
		}
	@AfterMethod
	public void Screenshot() throws IOException, InterruptedException {
		
		WebElement element =driver.findElement(By.xpath("//a[@href='logout.aspx']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.get("https://www.sohostyle.in/myaccount");
//		driver.findElement(By.xpath("//a[@href='/login']")).click();
//		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
//		driver.findElement(By.id("left_txtpwd")).sendKeys("Ykaft8n1");
//		driver.findElement(By.id("signin_btnlogin")).click();
		driver.findElement(By.xpath("//a[@href='storecredit']")).click();
		Thread.sleep(5000);
		takeScreenshot("8");
		driver.navigate().to("https://seller.sohostyle.in/");
	}
	
}
