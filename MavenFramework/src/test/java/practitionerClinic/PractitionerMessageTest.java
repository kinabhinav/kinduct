package practitionerClinic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

import patientClinic.Login;

public class PractitionerMessageTest {
	
	@Test(priority=1)
	public void postmessage() throws Exception
	
	//public static void main(String[] args)throws Exception
	
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
		
		
	
	
	@Test(priority=2)
	public void postmessage_cancel_link() throws Exception
		{

		PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
		
				
		//post message
		
		login.wait(".//*[@id='content']/article/header/div/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).click();

		
		//cancel link
		
		login.wait(".//*[@id='cancel']");
		
		login.driver.findElement(By.xpath(".//*[@id='cancel']")).click();
		
		
		login.wait(".//*[@id='content']/article/header/div/a[2]");
		
		if (login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed())
		{
			
			
			  Excel e = new Excel();
				
				e.excel(62,63,"PASSED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(62,63,"FAILED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).isDisplayed(),true);
				login.driver.close();
				
			}
		
	
		}
	
	@Test(priority=3)
	public void postmessage_hide_message() throws Exception
		{

			PracLogin login = new PracLogin();
			
			login.login();
		
			//communication
		
			login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
			login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
			//message center
		
			login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
			login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
			
			String text = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]/div")).getText();

			
			////hide
			
			login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]");
							
			login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]")).click();
			
			
			String textafter = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]/div")).getText();

			Boolean test = text.equalsIgnoreCase(textafter);
			
			Status s = new Status();
			
			s.statusBooleanFalse(64, 65, login.driver, test);
			
		
					
				
			
		
		}
	
	@Test(priority=4)
	public void postmessage_show_hidden_message() throws Exception
		{

			PracLogin login = new PracLogin();
			
			login.login();
		
			//communication
		
			login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
			login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
			//message center
		
			login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
			login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
			
			String text = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]/div")).getText();

			
			////hide
			
			login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]");
							
			login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]")).click();
			
			//show hidden button
			
			login.wait(".//*[@id='content']/article/header/div/a[1]");
							
			login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]")).click();		
			
			String textafter = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]/div")).getText();

			Boolean test = text.equalsIgnoreCase(textafter);
			
			Status s = new Status();
			
			s.statusBooleanTrue(65, 66, login.driver, test);
			
		
					
				
			
		
		}
	
	@Test(priority=5)
	public void delete_message() throws Exception
		{

			PracLogin login = new PracLogin();
			
			login.login();
		
			//communication
		
			login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
			login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
			//message center
		
			login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
			login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
			
			String text = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]/div")).getText();

			
			//delete
			
			login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]");
							
			login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]")).click();
			
			
			String textafter = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]/div")).getText();

			Boolean test = text.equalsIgnoreCase(textafter);
			
			Status s = new Status();
			
			s.statusBooleanFalse(67, 68, login.driver, test);
			
		
					
				
			
		
		}
	@Test(priority =6)
	public void respondmessage() throws Exception
	//public static void main (String []args)throws Exception
	{
Login loginpatient = new Login();
		
loginpatient.login();
		
		//Messages
loginpatient.wait(".//*[@id='profile_tabs']/li[6]/a");
		
loginpatient.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[6]/a")).click();
		
		//post message
		
loginpatient.wait(".//*[@id='content']/article/header/div/a[2]");
		
loginpatient.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).click();
		
		//Select a recipient  
		
loginpatient.wait(".//*[@id='select_link']");
		
loginpatient.driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		// Demo Practitioner recipient  
		
loginpatient.wait(".//*[@id='user_giu006k4vhs1eze6']");
		
loginpatient.driver.findElement(By.xpath(".//*[@id='user_giu006k4vhs1eze6']")).click();
	
		// Select button 
		
loginpatient.wait(".//*[@id='multi_select_user']/div[2]/div/div[3]/button");
		
loginpatient.driver.findElement(By.xpath(".//*[@id='multi_select_user']/div[2]/div/div[3]/button")).click();
		
		// Subject
		
loginpatient.wait(".//*[@id='subject']");
		
loginpatient.driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys("Respond Subject Test");
		
				
		//Message
		
loginpatient.driver.switchTo().frame(loginpatient.driver.findElement(By.cssSelector("iframe[title='Rich text editor, body_html']")));
		
		//(new WebDriverWait(login.driver,10)).until(ExpectedConditions.elementToBeClickable(By.className("cke_show_borders")));
		
						
loginpatient.driver.findElement(By.className("cke_show_borders")).sendKeys("Respond Message Test ");
		
loginpatient.driver.switchTo().defaultContent();
		
		// Send button 
		
		loginpatient.wait(".//*[@id='submit_button']");
		
		loginpatient.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		//
		loginpatient.driver.quit();
		//PostMessage admin = new PostMessage();
		
		//admin.postmessage();
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
		
		
		
		//respond to a message
		
		login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[3]/span[1]");
										
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[3]/span[1]")).click();
				
		//Subject	
		login.wait(".//*[@id='subject']");
										
		login.driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys(" REPLY");
				
				
				
		//Message
				
		login.driver.switchTo().frame(login.driver.findElement(By.cssSelector("iframe[title='Rich text editor, body_html']")));
				
		login.driver.findElement(By.className("cke_show_borders")).sendKeys("Response to TEST MESSAGE ");
			
				//login.wait(".//*[@id='cke_body_html']/span[2]/span");
				
			//	login.driver.findElement(By.xpath(".//*[@id='cke_body_html']/span[2]/span")).sendKeys("TEST MESSAGE");
				
				login.driver.switchTo().defaultContent();
												
				//login.driver.findElement(By.xpath(".//*[@id='cke_body_html']/span[2]/span")).sendKeys("TEST MESSAGE");
				
				//Save
				
				login.wait(".//*[@id='submit_button']");
				
				
														
				login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
				
				//Testing no such element
				
				
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
				
		
	}



	}



