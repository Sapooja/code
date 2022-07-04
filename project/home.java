package Gallery;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting13/Desktop/project/home.html");
		driver.findElement(By.xpath("//*[@id='About']"));
		driver.findElement(By.xpath("//*[@id='Product']"));
		driver.findElement(By.xpath("//*[@id='Booking']"));
		driver.findElement(By.xpath("//*[@id='Contact us']"));
		driver.findElement(By.xpath("//*[@id='Team']"));
		//driver.close();
		

	}

}
