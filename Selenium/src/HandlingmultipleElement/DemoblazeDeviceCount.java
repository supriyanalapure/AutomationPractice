package HandlingmultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoblazeDeviceCount {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome");
		
		driver.get("https://www.demoblaze.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //for name		
		List<WebElement> searchitem=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		
		System.out.println("searchitem count is: "+searchitem.size());
		
		
		
		for (int i =0; i < searchitem.size() ; i++) {
			System.out.println("serach name is: "+searchitem.get(i).getText());
		}
		//for price
        List<WebElement> price=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		System.out.println("searchitem count is: "+price.size());
		
		
		
		for (int i =0; i < price.size() ; i++) {
			System.out.println("serach name is: "+price.get(i).getText());
		}
		
	}
	public static WebDriver setUp(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
			
			return new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\geckodriver.exe");
			
			return new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			
			return new InternetExplorerDriver();
		}
		return null;
	}

}