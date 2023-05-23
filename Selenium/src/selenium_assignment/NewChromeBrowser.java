package selenium_assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
       
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.actitime.com/");
       driver.manage().window().maximize();
       driver.getTitle();
       System.out.println(driver.getTitle());
       driver.getTitle().length();
       System.out.println(driver.getTitle().length());
       driver.getCurrentUrl();
       System.out.println(driver.getCurrentUrl());
       driver.getPageSource();
       System.out.println(driver.getPageSource());
       driver.getPageSource().length();
       System.out.println(driver.getPageSource().length());
       driver.close(); 
       
       
	}

}
