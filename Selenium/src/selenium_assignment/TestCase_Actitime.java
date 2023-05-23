package selenium_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	       driver.get("https://demo.actitime.com/login.do");
	       
	       //Login
	       driver.findElement(By.id("username")).sendKeys("admin");
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       
	       Thread.sleep(2000);
	       driver.findElement(By.id("container_tasks")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.cssSelector(".addNewButton>*:nth-child(3)")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.cssSelector(".dropdownContainer>*:nth-child(3)")).click();
	       Thread.sleep(500);
	       driver.findElement(By.cssSelector(".taskTable>div>table>colgroup>*:nth-child(1)")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.className("//body[1]/div[51]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).sendKeys("automation task");
	       
	       driver.manage().window().maximize();
			
			
	       //driver.findElement(By.cssSelector("container_tasks")).click();
			
	      
	       //logout
	      // WebElement logoutLink=driver.findElement(By.id("logoutLink"));
	       
	     
	       
	       
		}

	}
