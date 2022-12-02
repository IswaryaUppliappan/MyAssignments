package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChittorgarhWeb {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.chittorgarh.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Click on stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		//Click on NSE bulk Deals
//				    hint-(Table-2)
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals'][1]")).click();
//				4. Get all the Security names
		List<WebElement> securityList = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));
		
		List<String>securityNames = new LinkedList<String>();
		
		for (int i = 0; i <  securityList.size(); i++) {
			String text =  securityList.get(i).getText();
			securityNames.add(text);
		}
		//5. Ensure whether there are duplicate Security names
		Set<String>dupSet = new HashSet<String>(securityNames );
		
		System.out.println(securityNames.size());
		System.out.println(dupSet.size());
	}

}
