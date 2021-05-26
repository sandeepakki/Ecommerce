package SC_COD_WholeProcess;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderPlacing extends BaseClass {
	

		@BeforeMethod
		public void testCase3() throws InterruptedException, IOException {
			
			driver.get("https://sohostyle.in/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
		driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[@id='header-wrap']"+
			"/div[@id='fixedElement_relative']/div[@id='head']/div[@id='container']/div[@id='right']/div[@id='user']/span[1]/a[1]/div[1]")).click();
			driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
			driver.findElement(By.id("left_txtpwd")).sendKeys("Ykaft8n1");
			driver.findElement(By.id("signin_btnlogin")).click();
			Thread.sleep(1000);
		}
			@Test
			public void testSCCOD() throws IOException, InterruptedException {
	 	for(int i=0;i<=0;i++) {
	 		//p1			
	 				driver.navigate().to("https://www.sohostyle.in/BMP-S1638584/products/thisistestproduct/Black/BMP-S1638584#.YC48a2gzbIU");
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"bb1001\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1638584\",\"products\");']")).click();

	 		//P2
	 				driver.navigate().to("https://www.sohostyle.in/search&searchkey=Footwear%20Designer/products/FootwearDesigner/Brown/BMP-S1764929#.YC5Dt2gzbIU");
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"Skucde099\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1764929\",\"products\");']")).click();
	 				
	 		//p3
	 				
	 				driver.navigate().to("https://www.sohostyle.in/search&searchkey=Belts/products/Belts/Black/BMP-S1764929#.YC5DPWgzbIU");
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"skcode088\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1764929\",\"products\");']")).click();
	 				
	 		//p4
	 				driver.navigate().to("https://www.sohostyle.in/search&searchkey=MenKurtas/products/MenKurtas/Blue/BMP-S1325863#.YC4_u2gzbIU");
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"skucode125\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
	 				
	 		//p5
	 				driver.navigate().to("https://www.sohostyle.in/search&searchkey=MenKurtas/products/MenKurtas/Blue/BMP-S1325863#.YC4_u2gzbIU");
	 				Thread.sleep(2000);
	 				driver.findElement(By.xpath("//a[@title='Maroon']")).click();
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"skucode125\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
	 			
	 		//p6
	 				driver.navigate().to("https://www.sohostyle.in/BMP-S1325863/products/Self-Design-Fashion-Chiffon-Saree--m4gOrangem5g/Pink/BMP-S1325863#.YC5E_WgzbIU");
	 				driver.findElement(By.linkText("S")).click();
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"MP120\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1325863\",\"products\");']")).click();
	 				
	 		//p7
	 				driver.navigate().to("https://www.sohostyle.in/search&searchkey=OrangeCap/products/OrangeCap/Orange/BMP-S1390576");
	 			//	driver.findElement(By.linkText("M")).click();
	 				driver.findElement(By.xpath("//a[@onclick='javascript:add_into_cart(\"skucode1234\",\"Retaxis\",\"No\",\"SupplierCode|SKUCode|Color|Size|Variants|Model|test|0|0|0\",\"BMP-S1390576\",\"products\");']")).click();
	 				
	 				//cart
	 				WebElement cart = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"));
	 				Actions action = new Actions(driver);
	 				action.moveToElement(cart).build().perform();
	 				
	 				driver.findElement(By.linkText("VIEW BAG")).click();
	 				
	 			
	 				WebElement qty1 =driver.findElement(By.id("drpdownQty_0"));
	 				Select s1 = new Select(qty1);
	 				s1.selectByIndex(1);
	 				driver.findElement(By.className("confirm")).click();
	 				
	 				WebElement qty2 =driver.findElement(By.id("drpdownQty_1"));
	 				Select s2 = new Select(qty2);
	 				s2.selectByIndex(2);
	 				driver.findElement(By.className("confirm")).click();
	 				
	 				WebElement qty3 =driver.findElement(By.id("drpdownQty_2"));
	 				Select s3= new Select(qty3);
	 				s3.selectByIndex(1 );
	 				driver.findElement(By.className("confirm")).click();
	 				
	 				WebElement qty4 =driver.findElement(By.id("drpdownQty_3"));
	 				Select s4= new Select(qty4);
	 				s4.selectByIndex(3);
	 				driver.findElement(By.className("confirm")).click();
	 				takeScreenshot("1");
	 				Thread.sleep(3000);
	 				WebElement Element = driver.findElement(By.xpath("//a[text()='Proceed to Checkout']"));
	 				Actions action1 = new Actions(driver);
	 				action1.moveToElement(Element).click().perform();
	 				
	 				Thread.sleep(1000);
	 				driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
	 				Thread.sleep(1000);
	 				//storecredit
	 				driver.findElement(By.xpath("//div[@id='Applystorecra']/a")).click();   // Store Credit 
	 				driver.findElement(By.id("display_storecredit")).sendKeys("500.00");
	 				driver.findElement(By.id("applystorecredit")).click();
	 				//cod
	 				driver.findElement(By.xpath("//a[@id='btnCOD']/div[@id='addid-0']")).click();
	 				takeScreenshot("2");
	 				Thread.sleep(3000);
	 				WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
	 				Actions action2 = new Actions(driver);
	 				action2.moveToElement(placeOrder).click().perform();
	 				
	 					
	 				driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
	 				driver.findElement(By.id("btncodsubmit")).click();		
	 				Thread.sleep(3000);
	 				takeScreenshot("3");
	 	}}
	 				@AfterMethod
	 				public void MyOrderPage() throws IOException, InterruptedException {
	 				
	 				driver.navigate().to("https://www.sohostyle.in/myaccount");
	 				WebElement element = driver.findElement(By.xpath("//a[@href='storecredit']"));
	 				List<WebElement> CancelOrder = driver.findElements(By.linkText("Cancel Product"));
	 				for(int i=0;i<CancelOrder.size();i++){
	 					System.out.println(CancelOrder.get(i).getText());
	 				}
	 						CancelOrder.get(1).click();
	 						Thread.sleep(1000);
	 			driver.findElement(By.xpath("//button[@class='confirm']")).click();
	 			Thread.sleep(3000);
	 			driver.findElement(By.xpath("//button[@class='confirm']")).click();
	 			Thread.sleep(2000);
	 				takeScreenshot("4");
	 				Actions action = new Actions(driver);
	 				action.moveToElement(element).click().build().perform();
	 				Thread.sleep(5000);
	 				takeScreenshot("5");
	 			
	 					
	 	}
		
}
