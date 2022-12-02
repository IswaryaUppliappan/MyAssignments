package marathon.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
	     option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(1000);
	    String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("number of buses shown as results" + text);
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]"));
		driver.executeScript("arguments[0].click();",drop);
		Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//div[text()='V2K Travels']")).getText();
		System.out.println(text1);
		WebElement drop1 = driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]"));
		driver.executeScript("arguments[0].click();",drop1);
		Actions builder =new Actions(driver);
		builder.scrollToElement(drop1).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./seat/snap.png");
		FileUtils.copyFile(source, dest);
		
			
	}

}
