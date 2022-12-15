package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class NewCaller {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://dev142572.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("64j/J^FHduvM");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		//shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.setImplicitWait(15);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		WebElement framecaller = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(framecaller);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);			
		WebElement framecaller1 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(framecaller1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Keerthika");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Kanmani");
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys("Mrs.");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("keerthik@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Business phone']")).sendKeys("+91 7200879651");
		driver.findElement(By.xpath("//input[@aria-label='Mobile phone']")).sendKeys("+91 9876543210");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		shadow.setImplicitWait(15);
		driver.findElement(By.xpath("//select[@role='listbox']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("Keerthika",Keys.ENTER);
		
		//WebElement verifycaller = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
		WebElement verifycaller = driver.findElement(By.xpath("//input[@aria-label='Search column: first name']"));
		Actions builder = new Actions(driver);
		builder.sendKeys("Keerthika");
	////div[text()='No records to display']
		////td[text()='Allan']
		if(driver.findElement(By.xpath("(//td[text()='Keerthika'])[1]")) != null) {
			System.out.println("contact verified");
		}
		else {
			System.out.println("contact unverified");
		}
		
		//driver.close();
	}

}
