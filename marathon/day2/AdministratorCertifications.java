package marathon.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(1000);
		//String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		//convert set into list
		List<String> lstname=new ArrayList<String>(windowHandles);
		//move the control into second open window
		driver.switchTo().window(lstname.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(1000);
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[contains(text(),'Learning')]").click();
		Thread.sleep(1000);
		WebElement mouseHover = shadow.findElementByXPath("/span[contains(text(),'Learning on Trailhead')]");
		Actions builder =new Actions(driver);
		builder.moveToElement(mouseHover).perform();
		Thread.sleep(1000);
		WebElement drop = shadow.findElementByXPath("//a[contains(text(),'Salesforce Certification')]");
		driver.executeScript("arguments[0].click();",drop);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='credentials-card_title'])[1]")).click();
		System.out.println(driver.getCurrentUrl());
		Set<String> windowHandles1 = driver.getWindowHandles();
		//convert set into list
		List<String> lstname1=new ArrayList<String>(windowHandles1);
		//move the control into second open window
		driver.switchTo().window(lstname1.get(1));
		Thread.sleep(1000);
		List<WebElement> admin = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i <admin.size(); i++) {
			System.out.println(admin.get(i).getText());
		}
		//8. Verify the Certifications available for Administrator Certifications should be displayed
        WebElement scroll = driver.findElement(By.xpath("//h1[text()='Earn your Credential']"));
        builder.scrollToElement(scroll).perform();
    
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshot/snap1.png");
		 FileUtils.copyFile(source, dest);
	}
	

}
