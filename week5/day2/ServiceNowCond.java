package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowCond {
	public ChromeDriver driver;
	@BeforeMethod

	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://dev142572.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("64j/J^FHduvM");
		driver.findElement(By.id("sysverb_login")).click();
		
	}
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
//<class name="week5.day2.NewCaller"/>
//<class name="week5.day2.NewProposal"/>
//<class name="week5.day2.OrderingMobile"/>
