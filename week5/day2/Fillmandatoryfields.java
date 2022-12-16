package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Fillmandatoryfields extends ServiceNowCond {
@Test
	public void runMandatoryFields() throws InterruptedException {
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.setImplicitWait(15);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("knowledge");
		driver.findElement(By.xpath("//span[text()='Knowledge']")).click();
		WebElement newframe = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(newframe);
		driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement newframe1 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(newframe1);
		driver.findElement(By.xpath("//button[@aria-label='Look up value for field: Knowledge base']")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String> winhan=new ArrayList<String>(wh);
		driver.switchTo().window(winhan.get(1));
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(winhan.get(0));
		Thread.sleep(1000);
		WebElement win1 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(win1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='lookup.kb_knowledge.kb_category']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@aria-label='IT,level1 choose a category and click right arrow to navigate to its respective level2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Java,level2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("knowledge record");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();


	}
		
	}


