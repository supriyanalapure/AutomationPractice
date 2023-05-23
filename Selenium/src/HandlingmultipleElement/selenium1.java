package HandlingmultipleElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class selenium1 {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome");
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		
List<WebElement> searchitem=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
		
		System.out.println("searchitem count is: "+searchitem.size());
		
		//System.out.println("First device name is: "+deviceList.get(0).getText());
		
		for (int i =0; i < searchitem.size() ; i++) {
			System.out.println("serach name is: "+searchitem.get(i).getText());
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