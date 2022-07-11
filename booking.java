package testngexcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebElement;
import com.google.common.base.Function;
import testngexcel.Utilitycode.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
public class booking {

private WebDriver driver;
private Utilitycode utility;

  @Test(dataProvider = "getTestData")
 
  public void test(String FirstName, String LastName, String Address, String Email, String PhNum,String Date, String Minm,
		  String Maxm) throws InterruptedException {
		  driver.findElement(By.id("firstname")).sendKeys(FirstName);
		  Thread.sleep(1000);
		  driver.findElement(By.id("lastname")).sendKeys(LastName);
		  Thread.sleep(1000);
		  driver.findElement(By.id("address")).sendKeys(Address);
		  Thread.sleep(1000);
		  driver.findElement(By.id("email")).sendKeys(Email);
		  Thread.sleep(1000);
		  driver.findElement(By.id("phonenumber")).sendKeys(PhNum);
		  Thread.sleep(1000);
		  driver.findElement(By.id("DOB")).sendKeys(Date);
		  Thread.sleep(1000);
	
		  Select se = new Select(driver.findElement(By.xpath("//*[@id='girl']")));
		  se.selectByIndex(2);
		  Thread.sleep(2000);
		  WebElement checkboxSelect = driver.findElement(By.id("v1"));
		  Boolean isSelect = checkboxSelect.isSelected();
		  if (isSelect == false)
		  {
		  checkboxSelect.click();
		  }
		  driver.findElement(By.id("min")).sendKeys(Minm);
		  Thread.sleep(1000);
		  driver.findElement(By.id("max")).sendKeys(Maxm);
		  Thread.sleep(1000);
		  driver.findElement(By.id("sub")).click();
		  //driver.findElement(By.id("alert")).click();
		  driver.switchTo().alert().accept();
		  //Thread.sleep(1000);

		  }


  @BeforeMethod
  public void setup() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
  this.driver = new ChromeDriver();

  driver.get("file:///C:/Users/itctesting13/Desktop/project/booking.html");
  Thread.sleep(2000);

  }


  @DataProvider
  public Object[][] getTestData() throws Exception {
 utility = new Utilitycode();

 int totalRows = utility.getRowCount("C:\\Users\\itctesting13\\Documents\\bikegallery.xlsx","Sheet3");
 int totalColumns = utility.getColumnCount("C:\\Users\\itctesting13\\Documents\\bikegallery.xlsx","Sheet3");
 System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

 Object[][] data = new Object[totalRows][totalColumns];
 for (int i = 0; i < totalRows; i++) {
 for (int j = 0; j < totalColumns; j++) {
 data[i][j] = new Utilitycode()
 .getData("C:\\Users\\itctesting13\\Documents\\bikegallery.xlsx", "Sheet3", i, j);
 }
 }
 return data;
 }
  @AfterMethod
  public void reg1()
  {
 	 driver.quit();
  }
  }




