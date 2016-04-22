package practitionerClinic;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.kinduct.MavenFramework.Excel;

//import adminClinic.PostMessage;

public class RespondMessage {
	
	@Test
	public void respondmessage() throws Exception
	{
		
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
				
				
				
				boolean  flag = true;
				
				//login.wait(".//*[@id='content']/article/header/div/a[1]");
				
				flag =login.driver.findElements(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[3]/span[1]")).size() > 0;
				
				System.out.println(flag);
				
				
						if (flag==false) {
							
							flag=false;
							
						  Excel e = new Excel();
							
							e.excel(260,264,"PASS");
							
							Assert.assertTrue(flag);
							
							
						}
						else
						{
							Excel e = new Excel();
							flag=true;
							e.excel(260,264,"FAIL");
							Assert.assertTrue(flag);

						}
					
				login.driver.close();
				
			
		
	}

}
