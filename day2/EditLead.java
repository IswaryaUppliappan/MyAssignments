package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[contains(@id,'xt-gen248')]")).sendKeys("Iswarya");
		driver.findElement(By.xpath("//button[contains(@id,'ext-gen334')]")).click();
		driver.findElement(By.linkText("11706")).click();
		System.out.println("The title is  " + driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TCS");
		WebElement source = driver.findElement(By.xpath("//input[contains(@value,'Update')]"));
		driver.executeScript("arguments[0].click();",source);   
		WebElement source1 = driver.findElement(By.xpath("//span[text()='TCS (11706)']"));
		String k= source1.getText();
		System.out.println("Text content is : " + k);
	    driver.close();
}
	
}
	
