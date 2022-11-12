package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Bond with Buttons']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[text()='Get Position']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).isDisplayed());

	}

}
