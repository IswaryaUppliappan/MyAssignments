package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("uiswaryaa@gmail.com");
		System.out.println(driver.findElement(By.xpath("//input[contains(@value,'Append')]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[contains(@value,'TestLeaf')]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[contains(@disabled,'true')]")).isDisplayed());
		
	}

}
