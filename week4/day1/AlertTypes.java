package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTypes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//simple alert
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		Alert sa = driver.switchTo().alert();
		String msg1=sa.getText();
		sa.accept();
		System.out.println("simple alert"  +msg1);
		
		//confirm alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		Alert ca = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String msg=ca.getText();
		System.out.println("confirm alert"  +msg);
		ca.accept();
		
		String verify = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(verify);
		
		//prompt alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		Alert pa = driver.switchTo().alert();
		pa.sendKeys("Testleaf");
		Thread.sleep(3000);
		String text2 = pa.getText();
		System.out.println("prompt message"+text2);
		pa.accept();
		//print the result of text entered 
		String promsg = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(promsg);
		
		//Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following::span[text()='Show'][1]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		String text3= driver.findElement(By.xpath("//p[contains(text(),'You have clicked and open a dialog that can be inspectable')]")).getText();
		System.out.println("sweet alert(simple dialoge) :" + text3);
		
		//Sweet Modal Dialog
		driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']/following::span[text()='Show'][1]")).click();
		Thread.sleep(2000);
		String text4 = driver.findElement(By.xpath("//p[text()='Unless you close this, you cannot interact with other element. But am inspectable !']")).getText();
		System.out.println("Sweet modal dialog: " + text4);
		driver.findElement(By.xpath("(//span[text()='Modal Dialog (Sweet Alert)'])/following::span[1]")).click();
		
		//Sweet alert confirmation
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Yes']")).getText();
		System.out.println("User clicked: " + text);
		
		//Minimize and Maximize
		driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following::span[text()='Show'][1]")).click();
		driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following::span[5]")).click();
		
		String text5= driver.findElement(By.xpath("//p[contains(text(),'I am Sweet Alert and can be maximized or minimized. By the way, am not a new window')]")).getText();
		System.out.println("Minimize and Maximize :" + text5);
		
		driver.quit();
		
		
	}

}
