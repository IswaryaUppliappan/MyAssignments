package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouseHover = driver.findElement(By.xpath("//span[contains(@class,'catText')][1]"));
		
		//Mousehover
		//Actions is a class we have to create object
		//driver as argument
		Actions builder =new Actions(driver);
		builder.moveToElement(mouseHover).perform();
		
		//How to take snap shot
         File source = driver.getScreenshotAs(OutputType.FILE);//ctrl+2+l
         
        File dest =new File(".");
        
         FileUtils.copyFile(source, dest);
		
	}

}
