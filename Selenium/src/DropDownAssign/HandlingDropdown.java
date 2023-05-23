package DropDownAssign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\supriya\\Selenium\\Executable\\chromedriver.exe");
	       
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
	       
	      driver.get("http://demo.automationtesting.in/Register.html");
	      
	      WebElement YearDropdown = driver.findElement(By.id("yearbox"));
	    
		  Select selectYear = new Select(YearDropdown );
		  //Multiselect
		  System.out.println("Is dropdown is allowing you to select multiple option: " + selectYear.isMultiple());
		
		 //DefaultValue
		System.out.println("Already selected option name: " + selectYear.getFirstSelectedOption().getText());
		
		 
		//OptionCount
		List<WebElement> options = selectYear.getOptions();
		System.out.println("Option count is:" + options.size());
		
		//Print one by one option
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Option " + i + ": " + options.get(i).getText());
		
		}
	    //Checking the order of skills	
	  		Select Yeardrop=new Select(driver.findElement(By.id("daybox")));
	  		List<Integer> Years=new ArrayList<Integer>();
	  		for(int i=1;i<Yeardrop.getOptions().size();i++) {
	  			String Year=Yeardrop.getOptions().get(i).getText();
	  			Years.add(Integer.parseInt(Year));
	  		}
	  		List<Integer> dupYear=new ArrayList<Integer>(Years);		
	  		Collections.sort(dupYear);
	  		System.out.println(Years.equals(dupYear));			
	  		}
	    
	   
		
		
		
	}


