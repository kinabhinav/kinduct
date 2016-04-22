package adminClinic;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdminLogin {
	
	public  WebDriver driver;  
	public void wait(  String text)
		
		{
		
		 
				(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
		
				

		}
		
		
		@Test
		public  void adminlogin() throws Exception
		{
			// driver = new FirefoxDriver();
			 
			File src =  new File("//Users//abhatnagar//Downloads//phantomjs-2.1.1-macosx//bin//phantomjs.exe") ;
			 
			 System.setProperty ("phantomjs.binary.path", src.getAbsolutePath());
			
			driver = new PhantomJSDriver();
			
			driver.get("https://qa3.kinductdev.com/login");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
			
			
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
			
			wait(".//*[@id='login_form']/div[3]/div/button");
			
			//Login button
			
			driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
			
			wait(".//*[@id='link_83356']");
			
			//Kinduct Clinic
			
			driver.findElement(By.xpath(".//*[@id='link_83356']")).click();
			
			wait(".//*[@id='link_83356']");
			
			//Demo Admin
			
			driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[4]/td[5]/a[3]/span[1]")).click();
		}
		

}
