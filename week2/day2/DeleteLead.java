package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("445");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8767890765");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("leadID");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String message = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(message);
		if (message.equals("No records to display")) {
			System.out.println("Text matched");
		}
		else {
			System.out.println("Text mismatched");
		}
		
		driver.close();	

	}}


