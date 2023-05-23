package Flipcart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
	       
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	       
	       driver.get("https://www.flipkart.com/");
	       
	       driver.manage().window().maximize();
	     
	       List<WebElement> searchitem=driver.findElements(By.cssSelector("._331-kn>div>div>div>a>*:nth-child(2)"));
			
			System.out.println("product count is: "+searchitem.size());
			
			for (int i =0; i < searchitem.size() ; i++) {
				System.out.println("Main menu: "+searchitem.get(i).getText());
			}
	       
		   System.out.println(" All Titles ");
		   
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(1)>a>*:nth-child(1)")).click();
	       Thread.sleep(8000);
	        System.out.println(" Top offers -" +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
	      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(2)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println("Mobiles and Tablets - " +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(3)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" Electronics - " +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(4)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" Tvs and Appliances " +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(5)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" Fashion - " +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(6)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" beauty - " +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(7)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" Home and Furniture - " +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(8)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" Flights -" +driver.getTitle());
	       driver.navigate().back();
	       
	       Thread.sleep(5000);
		      
	       driver.findElement(By.cssSelector("._331-kn>div>div>*:nth-child(9)>a>*:nth-child(1)")).click();
	       Thread.sleep(5000);
	       System.out.println(" Grocery - " +driver.getTitle());
	       driver.navigate().back();
	       
	       driver.close();
		}

	}
