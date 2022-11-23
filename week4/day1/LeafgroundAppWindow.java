package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAppWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//span[text()='Open']")).click();
	    System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println("How many window open"+windowHandles.size());
	    List<String>lstwindow =new ArrayList<String>(windowHandles);
	    driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	    driver.close();
	    driver.switchTo().window(lstwindow.get(2));
	    String text = driver.findElement(By.xpath("//table[@role='grid'][1]//tr[2]//td[3]")).getText();
	    System.out.println(text);
	    driver.switchTo().defaultContent();
	    driver.quit();
	    
	    

	}

}
