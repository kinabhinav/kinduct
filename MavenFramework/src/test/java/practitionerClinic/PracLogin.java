package practitionerClinic;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.kinduct.MavenFramework.Excel;

public class PracLogin {
	
	public  WebDriver driver;  
	public void wait(  String text)
		
		{
		
		 
				(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
		

		}
		
		
		@Test
		public  void login() throws Exception
		{
			 driver = new FirefoxDriver(); 
		
			
			
			driver.get("https://qa3.kinductdev.com/login");
			
			driver.manage().window().maximize();
			//driver.manage().window().setPosition(new Point(0,0));
			//driver.manage().window().setSize(new Dimension(1024,768));
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("admin");
			
			
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("L3@d3r!");
			
			wait(".//*[@id='login_form']/div[3]/div/button");
			
			//Login button
			
			
			
			driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/div/button")).click();
			
			
			
			//----------------
			
			wait(".//*[@id='link_405']");
			
			//Login button
			
			
			
			driver.findElement(By.xpath(".//*[@id='link_405']")).click();
			
			///
			wait(".//*[@id='child-organizations']/tbody/tr[21]/td[1]/a");
			
			//Login button
			
			
			
			driver.findElement(By.xpath(".//*[@id='child-organizations']/tbody/tr[21]/td[1]/a")).click();
			
			WebElement Image = driver.findElement(By.xpath(".//*[@id='link_83356']"));
			
			Point point = Image.getLocation();
			
			int xcord = point.getX();
			
			System.out.println(xcord);
			int ycord = point.getY();
			System.out.println(ycord);
			
			((JavascriptExecutor)driver).executeScript("71", 413);
			
			wait(".//*[@id='link_83356']");
			
			//Kinduct Clinic
			
			driver.findElement(By.xpath(".//*[@id='link_83356']")).click();
			
			
			
			//Demo Practitioner
			
			WebElement element =driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("javascript:window.scrollBy(250,350)");
			
			//(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")));
			wait(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]");

			driver.findElement(By.xpath(".//*[@id='users']/tbody/tr[6]/td[5]/a[3]/span[1]")).click();
			
			/*
			Status s = new Status();
			
			s.statusTitle(1,5,driver,"Kinduct Clinic - Home");
		
		
			*/
			
			
			
					
			
		}


}
