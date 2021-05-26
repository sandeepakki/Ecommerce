package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://siteadminvedson.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("txtLogin")).sendKeys("vedson@cstech.in");
		driver.findElement(By.name("txtPassword")).sendKeys("45824582");
		driver.findElement(By.name("btnSubmit")).click();
		WebElement element = driver.findElement(By.id("liCatalog"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Product Categories")).click();
		
	}
	@Test(dataProvider = "testData1")
	public void testAddCategories(String linkText,String Category,String uniUrl,String comm) throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.linkText("Create New")).click();
		driver.findElement(By.linkText(linkText)).click();
		driver.findElement(By.id("TxtCategory")).sendKeys(Category);
		driver.findElement(By.id("txt_uniqueurl")).sendKeys(uniUrl);
		driver.findElement(By.id("txtSortingOrder")).sendKeys("0");
		driver.findElement(By.id("txt_Commission")).sendKeys(comm);
		driver.findElement(By.linkText("Submit Categories")).click();		
	}
	
	@DataProvider(name="testData1")
			public Object[][] getData() {
				String excelPath = "C:\\Users\\sande\\eclipse-workspace\\CSTech\\"+
						"EcomCategoryCreations\\Excel\\Categories.xlsx";
				String sheetName = "Sheet1";
				Object data[][]= testData(excelPath, sheetName);
				return data;
	}
	
	public  Object[][] testData(String excelPath,String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		int rowCount  = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] =new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				
			String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+ " | ");
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
