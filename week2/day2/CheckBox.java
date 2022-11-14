package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		System.out.println(driver.findElement(By.xpath("//h1[text()='Interact with Checkboxes']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[3]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[5]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[6]")).isSelected());

	}

}
