package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//label[text()='Click on this image to go home page']")).getText());
		driver.findElement(By.xpath("//img[contains(@src,'../images/home.png')]")).click();
		driver.navigate().back();
		WebElement image = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		if(image.getAttribute("src")!= "0") {
			System.out.println("the image is broken");
		}
		else {
			System.out.println("not a broken image");
		}
		WebElement keyboard = driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//img)[3]"));
        Actions obj=new Actions(driver);
        obj.click(keyboard).perform();
        String title = driver.getTitle();
        System.out.println(title);

		
		}

}
