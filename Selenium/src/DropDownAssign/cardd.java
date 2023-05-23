package DropDownAssign;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class cardd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
	       
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	       driver.get("http://omayo.blogspot.com/");
	       
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		Select selectSkill=new Select(carDropdown);
		
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
		
		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		
		
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
	}
}