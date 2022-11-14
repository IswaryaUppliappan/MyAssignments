package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Iswarya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Uppliappan");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[contains(@data-type,'password')]")).sendKeys("crmfsa");
		WebElement source = driver.findElement(By.xpath("//select[@id='day']"));
		Select drop1 =new Select(source);
		drop1.selectByValue("4");
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select drop2 =new Select(month);
		drop2.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select drop3 =new Select(year);
		drop3.selectByVisibleText("1998");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	
		
	}
	}
