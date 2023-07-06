package webmath.project1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class PlotsGeometry {

	public static WebDriver driver;
	// String path= "C:/Users/ACER/Desktop/Module2.xls";
	Workbook wb;
	Sheet sh;
	int numrow;

	@BeforeTest
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.webmath.com/");
	}

	@Test(priority = 0)
	public void dropdown() {

		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[6]/a")).click();
		// drop down
		Select drpSelect = new Select(driver.findElement(By.name("topicItem"))); // click on Coins, Counting to check
																					// dropdown functionality
		driver.findElement(By.name("topicItem")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drpSelect.selectByVisibleText("Calculus, Derivatives");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

	}

	@Test(priority = 1)
	public static void HelpTypingMath() {
		WebElement link = driver
				.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[2]/a"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
			driver.navigate().back();
			// driver.navigate().back();
		}
	}

	@Test(priority = 2) // Go Tab verification
	public static void go() {
		WebElement tabgo = driver
				.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/div/a/img"));
		tabgo.click();
		driver.navigate().back();
	}

	@Test(priority = 3) // The Equation of a Line Two points verification
	public static void twoPoints() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[1]"))
				.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
			driver.navigate().back();
			driver.navigate().back();

		}
	}

	@Test(priority = 4)
	public static void backTo() {
		driver.navigate().back();
	}

	@Test(priority = 5)
	public static void pointAndSlope() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[2]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 6)
	public static void slopeAndYint() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[3]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();

	}

	@Test(priority = 7)
	public static void ConicSections() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[1]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();

	}

	@Test(priority = 8)
	public static void Circles() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[2]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();

	}

	@Test(priority = 9)
	public static void Parabolas() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[3]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 10)
	public static void Ellipses() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[4]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 11)
	public static void Hyperbolas() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/font/font/a[5]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 12)
	public static void XYPlot() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[1]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 13)
	public static void Inequalities() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[2]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 14)
	public static void PolarPlot() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[3]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 15)
	public static void Points() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[3]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 15)
	public static void Lines() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/font/a[5]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 16)
	public static void Circles1() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[1]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 17)
	public static void Squares() {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[2]"))
				.click();
		String pageTitle = driver.getTitle();
		System.out.println("Current Title: " + pageTitle);
		driver.navigate().back();
	}

	@Test(priority = 18, dataProvider = "Two Points")
	public static void equationOfaLine(String Value1, String Value2, String Value3, String Value4) {
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[1]/input[1]"))
				.sendKeys(Value1);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[1]/input[2]"))
				.sendKeys(Value2);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[3]/input[1]"))
				.sendKeys(Value3);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[3]/input[2]"))
				.sendKeys(Value4);
		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[4]/input[1]"))
				.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// driver.navigate().back();
	}

	@DataProvider(name = "Two Points")
	public Object[][] Testdatafeed() throws JXLException, IOException {
		// reading the data from excel
		wb = Workbook.getWorkbook(new File("C:/Users/ACER/Desktop/Module2/Book2.xls"));

		// wb = Workbook.getWorkbook(new File("C:/Users/ACER/Desktop/Book1.xls"));
		sh = wb.getSheet(0);
		numrow = sh.getRows();
		Object[][] data = new Object[numrow][sh.getColumns()];
		for (int i = 0; i < numrow; i++) {
			data[i][0] = sh.getCell(0, i).getColumn();
			data[i][1] = sh.getCell(1, i).getColumn();
			data[i][2] = sh.getCell(2, i).getColumn();
			data[i][3] = sh.getCell(3, i).getColumn();
		}
		return data;
	}

	@AfterTest
	public static void Exit() {
		driver.close();
		driver.quit();
	}
}
