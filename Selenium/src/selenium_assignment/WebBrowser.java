package selenium_assignment;

import org.openqa.selenium.chrome.ChromeDriver;


public class WebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.getTitle();
		
		String ExpectedTitle="Facebook – log in or sign up";
		if (driver.getTitle().equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Expected title matched with Actual title");		
		}
		else {
		System.out.println("Expected title not matched with Actual title");	
		}
		
		System.out.println(driver.getTitle());
		
		driver.close();
	
		
			
		

	}

}
