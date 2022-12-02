package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableActivity {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		System.out.println("Row count is  " + row.size());
		List<WebElement> column = driver.findElements(By.xpath("//table//th"));
		System.out.println("Column count is "+ column.size());
		String text = driver.findElement(By.xpath("//table//tr[3]//td[2]")).getText();
		System.out.println("Progress value of learn to interact element is " + text);
		for (int j = 1; j < row.size(); j++) {
			//print all the progress value using dynamic handle
			List<WebElement> progress = driver.findElements(By.xpath("//table//tr["+j+"]/td"));
			for (int i = 0; i < progress.size(); i++) {
			System.out.println(progress.get(i).getText());
		}
			List<WebElement> table = driver.findElements(By.tagName("table"));
			for (int i = 0; i < table.size(); i++) {
				System.out.println(table.get(i).getText());
				
			}
		
		
	}
	
	}}

