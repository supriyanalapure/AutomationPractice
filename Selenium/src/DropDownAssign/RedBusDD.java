package DropDownAssign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RedBusDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = setUp("chrome");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.redbus.in/bus-tickets/swargate-to-panjim?fromCityName=Swargate%2C%20Pune&fromCityId=67159&toCityName=Panjim%2C%20Goa&toCityId=66289&onward=22-Jun-2023&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector("ul>li>label[for=\"dtBefore 6 am\"]")).click();
				driver.findElement(By.cssSelector("ul>li>label[for=\"bt_AC\"]")).click();
			     
      List<WebElement> searchitem=driver.findElements(By.cssSelector(".bus-items>div>li>div>div>div>div>.travels"));					
      System.out.println("Bus Names count is: "+searchitem.size());
					
	 for(int i = 0 ; i < searchitem.size() ; i++) {
	 //driver.findElement(By.cssSelector(".bus-items>*:nth-child("+i+")>li>div>div>div>div>div"));
		   Thread.sleep(2000);
	  System.out.println("Bus Name : "+searchitem.get(i).getText());			       
		   Thread.sleep(2000);
					   }
	 List<WebElement> price=driver.findElements(By.cssSelector(".bus-items>div>li>div>div>div>.column-seven>div>div>span"));
	 System.out.println("Bus Price count is:" +price.size());
	
	 for(int i = 0 ; i < searchitem.size() ; i++) {
	 Thread.sleep(2000);
	 System.out.println("Bus Price : "+price.get(i).getText());			       
	 
					   }
		  	
			}
			
public static WebDriver setUp(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
		return new ChromeDriver();
		} 
		else if (browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "E:\\workspace\\supriya\\Selenium\\Executable\\geckodriver.exe");
		return new FirefoxDriver();
		} 
		else if (browsername.equalsIgnoreCase("ie")) {			
	    System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");				
		return new InternetExplorerDriver();
		}
		return null;
		}

		}