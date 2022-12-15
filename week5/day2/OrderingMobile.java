package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OrderingMobile {

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
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(15);
		shadow.findElementByXPath("//input[@id='filter']").click();
		shadow.setImplicitWait(15);
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		shadow.setImplicitWait(5);
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
		WebElement seclectMDA = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select drop1=new Select(seclectMDA);
		drop1.selectByIndex(2);
		driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[9]")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		WebElement orderconfirm = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']"));
		System.out.println("Message"+ orderconfirm);
		WebElement serviceno = driver.findElement(By.xpath("//a[@id='requesturl']"));
		System.out.println("request no:" + serviceno.getText());
		
	}

	
}

