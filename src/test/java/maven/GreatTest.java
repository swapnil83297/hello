package maven;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GreatTest extends Great1{
	@Test
	public void j2()
	{
		SoftAssert sc=new SoftAssert();
		Great1 g=new Great1();
		g.j1();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8956544046");
	      driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("12345671");
	
	      //driver.findElement(By.xpath("//button[contains(@class,\"_2KpZ6l _2HKlqd \")]")).click();
	Assert.assertEquals(1,1,"due to baaaadddd boy");	
	sc.assertEquals(true, true);
 String st=	driver.getWindowHandle();
 System.out.println(st);
	}
	
	

}