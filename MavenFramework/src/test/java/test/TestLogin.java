package test;

import java.util.concurrent.TimeUnit;

import org.apache.maven.model.Organization;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

import practitionerClinic.PracLogin;

import pages.PractitionerLogin;

public class TestLogin { 
	@Test
	public void log() throws Exception
	
	{
PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
		
		for(int i=0;i<2;i++)
		{
		
		//post message
		
		login.wait(".//*[@id='content']/article/header/div/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).click();
		
		//Select a recipient  
		
		login.wait(".//*[@id='select_link']");
		
		login.driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		// Demo Practitioner recipient  
		
		login.wait(".//*[@id='user_giu006k4vhs1eze6']");
		
		login.driver.findElement(By.xpath(".//*[@id='user_giu006k4vhs1eze6']")).click();
	
		// Select button 
		
		login.wait(".//*[@id='multi_select_user']/div[2]/div/div[3]/button");
		
		login.driver.findElement(By.xpath(".//*[@id='multi_select_user']/div[2]/div/div[3]/button")).click();
		
		if(i==0)
		{
		// Subject
		
		login.wait(".//*[@id='subject']");
		
		login.driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys("Post a Message Subject Test");
		
				
		//Message
		
		login.driver.switchTo().frame(login.driver.findElement(By.cssSelector("iframe[title='Rich text editor, body_html']")));
		
		//(new WebDriverWait(login.driver,10)).until(ExpectedConditions.elementToBeClickable(By.className("cke_show_borders")));
		
						
		login.driver.findElement(By.className("cke_show_borders")).sendKeys("Post a Message Test ");
		
		login.driver.switchTo().defaultContent();
		
		// Send button 
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		}
		if(i==1)
		{
			// Subject
			
			login.wait(".//*[@id='subject']");
			
			login.driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys(" Subject Test 2");
			
					
			//Message
			
			login.driver.switchTo().frame(login.driver.findElement(By.cssSelector("iframe[title='Rich text editor, body_html']")));
			
			//(new WebDriverWait(login.driver,10)).until(ExpectedConditions.elementToBeClickable(By.className("cke_show_borders")));
			
							
			login.driver.findElement(By.className("cke_show_borders")).sendKeys(" Message Test 2 ");
			
			login.driver.switchTo().defaultContent();
			
			// Send button 
			
			login.wait(".//*[@id='submit_button']");
			
			login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();	
			
			login.wait(".//*[@id='content']/article/header/div/a[2]");
			
			if (login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed())
			{
				
				
				  Excel e = new Excel();
					
					e.excel(57,61,"PASSED");
					//Assert.assertEquals(text, "Automation Testing Note");
					Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed(),true);
					login.driver.close();
					
				}
				else
				{
					Excel e = new Excel();
					
					e.excel(57,61,"FAILED");
					//Assert.assertEquals(text, "Automation Testing Note");
					Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed(),true);
					login.driver.close();
					
				}
			
		//
			}
		}
	}
}
	
	

  
 
    



