package selenium_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
       
       ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
       
       driver.get("https://www.google.com/");
       System.out.println(driver.getCurrentUrl());
       
       driver.getPageSource();
      
       driver.close();
       
       
	}

}
