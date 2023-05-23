package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Orangehrmllive {
        static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = setUp("chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("content task")).click();
		
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		//logout
		
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		driver.findElement(By.linkText("Logout")).click();
			
		
	}

	public static WebDriver setUp(String browsername) {		
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\geckodriver.exe");
			
			driver= new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\IEDriverServer.exe");
			
			driver= new InternetExplorerDriver();
		}
		return driver;
	}
}
