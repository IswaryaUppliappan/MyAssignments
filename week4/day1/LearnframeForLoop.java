package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnframeForLoop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//how many frames in this page
		
		List<WebElement> iframeOuter = driver.findElements(By.tagName("iframe"));
		
		System.out.println(iframeOuter.size());
		int size=iframeOuter.size();
		
		int count=0;
		for (int i = 0; i < iframeOuter.size(); i++) {
			driver.switchTo().frame(iframeOuter.get(i));
			List<WebElement> iframeInner = driver.findElements(By.tagName("iframe"));
			count=count+iframeInner.size();
			driver.switchTo().defaultContent();
			
		}
		System.out.println(count+size);
		
	}

}
