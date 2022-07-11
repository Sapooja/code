package testngexcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class Regtest {

private WebDriver driver;
private Utilitycode utility;

  @Test(dataProvider = "getTestData")
 
  public void test(String FullName, String Username, String Email, String PhoneNum, String Paswrd, String ConPass)
  throws InterruptedException {
  driver.findElement(By.id("name")).sendKeys(FullName);
  Thread.sleep(1000);
  driver.findElement(By.id("username")).sendKeys(Username);
  Thread.sleep(1000);
  driver.findElement(By.id("mail")).sendKeys(Email);
  Thread.sleep(1000);
  driver.findElement(By.id("phone")).sendKeys(PhoneNum);
  Thread.sleep(1000);
  driver.findElement(By.id("pass")).sendKeys(Paswrd);
  Thread.sleep(1000);
  driver.findElement(By.id("conpass")).sendKeys(ConPass);
  Thread.sleep(1000);
  WebElement radioboxSelect = driver.findElement(By.id("girl"));
  Boolean isSelect = radioboxSelect.isSelected();
  if (isSelect == false) {
  radioboxSelect.click();
  }
  driver.findElement(By.id("sub")).click();
  Thread.sleep(2000);
  driver.switchTo().alert().accept();
  driver.close();
  }
  

  @BeforeMethod
  public void setup() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
  this.driver = new ChromeDriver();

  driver.get("file:///C:/Users/itctesting13/Desktop/project/register.html");
  Thread.sleep(2000);

  }


  @DataProvider
  public Object[][] getTestData() throws Exception {
 utility = new Utilitycode();

 int totalRows = utility.getRowCount("C:\\Users\\itctesting13\\Documents\\bikegallery.xlsx","Sheet2");
 int totalColumns = utility.getColumnCount("C:\\Users\\itctesting13\\Documents\\bikegallery.xlsx","Sheet2");
 System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

 Object[][] data = new Object[totalRows][totalColumns];
 for (int i = 0; i < totalRows; i++) {
 for (int j = 0; j < totalColumns; j++) {
 data[i][j] = new Utilitycode()
 .getData("C:\\Users\\itctesting13\\Documents\\bikegallery.xlsx", "Sheet2", i, j);
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




