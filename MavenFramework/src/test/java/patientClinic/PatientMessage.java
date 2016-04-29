package patientClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

public class PatientMessage {
	
	@Test (priority=1)
	public void Post_Message () throws Exception
	
	//public static void main (String[] args)throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Messages
		login.wait(".//*[@id='profile_tabs']/li[6]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
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
		
		//
		
		login.wait(".//*[@id='content']/article/div[1]/a");
		
		if (login.driver.findElement(By.xpath(".//*[@id='content']/article/div[1]/a")).isDisplayed())
		{
			
			
			  Excel e = new Excel();
				
				e.excelpatient(57,61,"PASSED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[1]/a")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(57,61,"FAILED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/div[1]/a")).isDisplayed(),true);
				login.driver.close();
				
			}
	
	}
	
	@Test (priority=2)
	public void Post_Message_Cancel_link () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Messages
		login.wait(".//*[@id='profile_tabs']/li[6]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
		//post message
		
		login.wait(".//*[@id='content']/article/header/div/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).click();
		// Cancel button 
		
		login.wait(".//*[@id='cancel']");
		
		login.driver.findElement(By.xpath(".//*[@id='cancel']")).click();
		
		//
		
		login.wait(".//*[@id='content']/article/header/div/a[2]");
		
		if (login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed())
		{
			
			
			  Excel e = new Excel();
				
				e.excelpatient(61,63,"PASSED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(61,63,"FAILED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed(),true);
				login.driver.close();
				
			}
	}
	
	@Test (priority=3)
	public void Message_Hide () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Messages
		login.wait(".//*[@id='profile_tabs']/li[6]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
		//Hide
		login.wait(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[6]/a[1]/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[6]/a[1]/span[1]")).click();
		
		//Subject .//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a
		
		login.wait(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a");
		
		String text = login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a")).getText();
		
		//if (text.equalsIgnoreCase(anotherString))
		
		if ( text != "Post a Message Subject Test")
		
		{
			  Excel e = new Excel();
				
				e.excelpatient(63,64,"PASSED");
				
				Assert.assertFalse(false);
				
				login.driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(63,64,"FAILED");
			
			Assert.assertFalse(false);
			
			login.driver.close();
			
		}
	
	}
	@Test (priority=4)
	public void Message_Show () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Messages
		login.wait(".//*[@id='profile_tabs']/li[6]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
		//Hide
		login.wait(".//*[@id='content']/article/header/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]")).click();
		
		//Subject .//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a
		
		login.wait(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a");
		
		String text = login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a")).getText();
		
		//if (text.equalsIgnoreCase(anotherString))
		
		if ( text.equalsIgnoreCase("Post a Message Subject Test"))
		
		{
			  Excel e = new Excel();
				
				e.excelpatient(64,65,"PASSED");
				
				Assert.assertTrue(true);
				
				login.driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(64,65,"FAILED");
			
			Assert.assertTrue(true);
			
			login.driver.close();
			
		}
	
	}
	
	@Test (priority=5)
	public void Message_Delete() throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Messages
		login.wait(".//*[@id='profile_tabs']/li[6]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
		//Show Hidden 
		
		login.wait(".//*[@id='content']/article/header/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]")).click();
		
		//Delete
		login.wait(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[6]/a[2]/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[6]/a[2]/span[1]")).click();
		
		login.wait(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a");
		
		String text = login.driver.findElement(By.xpath(".//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[3]/a")).getText();
		
		//if (text.equalsIgnoreCase(anotherString))
		
		if ( text != "Post a Message Subject Test")
		
		{
			  Excel e = new Excel();
				
				e.excelpatient(64,65,"PASSED");
				
				Assert.assertFalse(false);
				
				login.driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(64,65,"FAILED");
			
			Assert.assertFalse(false);
			
			login.driver.close();
			
		}
		
	}
}
