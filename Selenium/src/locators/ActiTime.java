package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ActiTime {

	private static Object wait;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://demo.actitime.com/login.do");
       
       //Login
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
      
       //logout
       WebElement logoutLink=driver.findElement(By.id("logoutLink"));
       
     
       
       
       driver.getTitle();
       System.out.println(driver.getTitle());
      
       
       String expectedTitle="actiTIME - Login";
       if(driver.getTitle().equalsIgnoreCase(expectedTitle)){
    	   System.out.println("Expected title matched with Actual title");
       }
       else {
    	   System.out.println("Expected title not matched with Actual title");
       }
       System.out.println(driver.getTitle());
      // driver.close();
	}

}
