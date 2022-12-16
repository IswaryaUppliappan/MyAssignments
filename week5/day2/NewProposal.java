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

public class NewProposal extends ServiceNowCond {
@Test
	public void runProposal() throws InterruptedException {
	
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.setImplicitWait(15);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("proposal");
		
		shadow.findElementByXPath("//a[@aria-label='My Proposals']").click();
	    WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	    driver.switchTo().frame(frame1);

		driver.findElement(By.id("sysverb_new")).click();
//		driver.executeScript("arguments[0].click();",drop);
//		   Thread.sleep(1000);
		String windows = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
		//driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("hi");
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("no of windows:" + windowHandles.size());
		List<String> windowlist=new ArrayList<String>(windowHandles);
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(windowlist.get(1));
//		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[text()='Standard Changes']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(windowlist.get(0));
	//	System.out.println(driver.getWindowHandle());
		WebElement frame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	    driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		driver.findElement(By.id("std_change_proposal.short_description")).sendKeys("Selenium Webdriver");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		WebElement verifyproposal = driver.findElement(By.xpath("//td[text()='Selenium Webdriver']"));
		if(verifyproposal.getText().contains("Selenium Webdriver")) {
			
			System.out.println("Proposal created");
		}
		}

	}


