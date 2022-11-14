package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement list1 = driver.findElement(By.id("dropdown1")); 
		Select drop1 = new Select(list1);
		drop1.selectByIndex(1);
		
		
		WebElement list2 = driver.findElement(By.name("dropdown2")); 
		Select drop2 = new Select(list2);
		drop2.selectByVisibleText("UFT/QTP");
		
		
		WebElement list3 = driver.findElement(By.name("dropdown3")); 
		Select drop3 = new Select(list3);
		drop3.selectByValue("2");
			
		WebElement list4 = driver.findElement(By.className("dropdown")); 
		Select drop4 = new Select(list4);
		int size = drop4.getOptions().size();
		System.out.println("options available " + size);
		
	
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Loadrunner"); 		
		
		
		WebElement list5 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]")); 
		Select drop5 = new Select(list5);
		drop5.selectByValue("2");
		drop5.selectByValue("4");			

	}

}
