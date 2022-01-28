package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Great1 {
	

	static WebDriver driver;
    @Test
	public void j1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91895\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		
		
	}

}
