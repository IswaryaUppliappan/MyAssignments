package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Get the count of number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='render']//tr"));
		System.out.println("No.of rows: " +rows.size());
		//Get the count of number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='render']//th"));
		System.out.println("No.of columns: " +columns.size());

	}

}
