package testngexcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class hometest {
WebDriver driver;
WebDriverWait wait;
HSSFWorkbook workbook;
HSSFSheet sheet;
XSSFCell cell;
 @BeforeClass
 public void beforeClass() {
 System.out.println("home page");
 }
 @BeforeMethod
 public void beforeMethod() {
 String path1="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
 driver=new ChromeDriver();
 driver.get("file:///C:/Users/itctesting13/Desktop/project/home.html");
 }

  @Test(priority=1)
  public void admin() throws Exception {
 File src=new File("C:\\Users\\itctesting13\\Documents\\home.xlsx");
 FileInputStream fis=new FileInputStream(src);
 XSSFWorkbook wb=new XSSFWorkbook(fis);
 XSSFSheet sheet1=wb.getSheetAt(0);
 System.out.println("Admin login");
 cell = sheet1.getRow(0).getCell(0);
 XSSFCell cell1 = sheet1.getRow(0).getCell(1);
 cell = sheet1.getRow(0).getCell(0);
 driver.findElement(By.xpath("About")).click();
 driver.findElement(By.xpath("product")).click();
 driver.findElement(By.xpath("Booking")).click();
 driver.findElement(By.xpath("Contact Us")).click();
 driver.findElement(By.xpath("Team")).click();
 

 Alert alert=driver.switchTo().alert();
 alert.accept();
  }
  @AfterMethod
  public void afterMethod() {
 //driver.close();
  }

  @AfterClass
  public void afterClass() {
 System.out.println("After Class");
  }

}

  

	
