package test;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{ 
	public WebDriver driver; 
	public String baseUrl = "https://www.google.com/";  
	
	@Test             
	public void test1() {      
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(baseUrl);
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Google";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		driver.close();
	}     
}
