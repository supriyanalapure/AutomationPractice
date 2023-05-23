package selenium_assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver","E:\\workspace\\supriya\\Selenium\\Executable\\geckodriver.exe");
       
       FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://demosite.executeautomation.com/Login.html");
       driver.getTitle();
       System.out.println(driver.getTitle());
       driver.getTitle().length();
       System.out.println(driver.getTitle().length());
       driver.getCurrentUrl();
      
       driver.getTitle();
       System.out.println(driver.getTitle());
       driver.getCurrentUrl();
       System.out.println(driver.getCurrentUrl());
       driver.close();
       
       
       
       
	}

}
