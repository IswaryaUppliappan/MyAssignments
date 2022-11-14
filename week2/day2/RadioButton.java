package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		System.out.println(driver.findElement(By.xpath("//h1[text()='Play with Radio Buttons']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'no')]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@name='news'][1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@name='age'][2]")).isDisplayed());
		

	}

}
