package patientClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

public class PatientCalendar {
	
	@Test (priority=1)
	public void Calendar_Add_Event () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Calendar
		login.wait(".//*[@id='profile_tabs']/li[7]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[7]/a")).click();
		
		//Add Event
		
		login.wait(".//*[@id='content']/article/div[3]/div[2]/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).click();
		
		login.wait(".//*[@id='type']");
		
		WebElement event = login.driver.findElement(By.xpath(".//*[@id='type']"));
		
		Select event_type = new Select(event);
		
		event_type.selectByIndex(4);
		
		login.wait(".//*[@id='notify_type']");
		
		WebElement notification = login.driver.findElement(By.xpath(".//*[@id='notify_type']"));
		
		Select notification_type = new Select(notification);
		
		notification_type.selectByIndex(1);
		
		//Title  
		
		login.wait(".//*[@id='subject']");
		
		login.driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys("TEST ADD EVENT");
		
		//Location 
		
		login.wait(".//*[@id='location']");
		
		login.driver.findElement(By.xpath(".//*[@id='location']")).sendKeys("TEST ADD EVENT LOCATION");
		
		
		//Description
		
		login.wait(".//*[@id='body']");
		
		login.driver.findElement(By.xpath(".//*[@id='body']")).sendKeys("TEST ADD EVENT Description");
		
		//Save  
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		//add event button verification
		
		login.wait(".//*[@id='content']/article/div[3]/div[2]/a[1]");
		
		if (login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed())
		{
			
			
			  Excel e = new Excel();
				
				e.excelpatient(67,72,"PASSED");
				//Assert.assertEquals(text, "Automation Testing Note");
				AssertJUnit.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(67,72,"FAILED");
				//Assert.assertEquals(text, "Automation Testing Note");
				AssertJUnit.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed(),true);
				login.driver.close();
				
			}
		
		
		
	}
	
	@Test (priority=2)
	public void Calendar_Add_Event_Cancel () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Calendar
		login.wait(".//*[@id='profile_tabs']/li[7]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[7]/a")).click();
		
		//Add Event
		
		login.wait(".//*[@id='content']/article/div[3]/div[2]/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).click();
		
		//Cancel  
		
		login.wait(".//*[@id='account_buttons']/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='account_buttons']/a[2]")).click();
		
		//add event button verification
		
				login.wait(".//*[@id='content']/article/div[3]/div[2]/a[1]");
				
				if (login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed())
				{
					
					
					  Excel e = new Excel();
						
						e.excelpatient(72,74,"PASSED");
						//Assert.assertEquals(text, "Automation Testing Note");
						AssertJUnit.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed(),true);
						login.driver.close();
						
					}
					else
					{
						Excel e = new Excel();
						
						e.excelpatient(72,74,"FAILED");
						//Assert.assertEquals(text, "Automation Testing Note");
						AssertJUnit.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed(),true);
						login.driver.close();
						
					}
	}
	
	@Test (priority=3)
	public void Calendar_Export () throws Exception
	
	//public static void main(String[] args) throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Calendar
		login.wait(".//*[@id='profile_tabs']/li[7]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[7]/a")).click();
		
		//Export
		
		login.wait(".//*[@id='content']/article/div[3]/div[2]/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[2]")).click();
		

		login.wait(".//*[@id='content']/article/div[3]/div[2]/a[1]");
		
		if (login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed())
		{
			
			
			  Excel e = new Excel();
				
				e.excelpatient(74,75,"PASSED");
				//Assert.assertEquals(text, "Automation Testing Note");
				AssertJUnit.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(74,75,"FAILED");
				//Assert.assertEquals(text, "Automation Testing Note");
				AssertJUnit.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/div[2]/a[1]")).isDisplayed(),true);
				login.driver.close();
				
			}
		
		
	}

}
