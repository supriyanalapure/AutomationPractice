package DropDownAssign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownforMonth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
	       
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	       
	       
	      driver.get("http://demo.automationtesting.in/Register.html");
	      
	      WebElement monthDropdown = driver.findElement(By.id(".form-control "));
	      Select selectmonth = new Select(monthDropdown );
	      
	      System.out.println("Is dropdown is allowing you to select multiple option: " + selectmonth.isMultiple());
	}

}
