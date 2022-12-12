package week5.day1.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1  {
@Test
	public void runCreateLead1() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	System.out.println(driver);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Iswarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Uppliappan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Iswarya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium is an automation tool");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("uiswaryaa@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
	}



	}


