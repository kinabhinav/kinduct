package adminClinic;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PostMessage {
	
	@Test
	
	public void postmessage() throws Exception
		{
		
		AdminLogin login = new AdminLogin();
		
		login.adminlogin();
		
		//communication
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
				
		//message center
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
						
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
				
		//post message button
				
		login.wait(".//*[@id='content']/article/header/div/a[2]");
								
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[2]")).click();
		
		//Select recipient
		
		login.wait(".//*[@id='select_link']");
		
		login.driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		//Select recipient
		
		login.wait(".//*[@id='user_giu006k4vhs1eze6']");
				
		login.driver.findElement(By.xpath(".//*[@id='user_giu006k4vhs1eze6']")).click();
		
		//Select button
		
		login.wait(".//*[@id='multi_select_user']/div[2]/div/div[3]/button");
						
		login.driver.findElement(By.xpath(".//*[@id='multi_select_user']/div[2]/div/div[3]/button")).click();
		
		//Subject
		
		login.wait(".//*[@id='subject']");
								
		login.driver.findElement(By.xpath(".//*[@id='subject']")).sendKeys("TEST MESSAGE");
		
		int size = login.driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		//Message
		
		//login.driver.switchTo().frame(login.driver.findElement(By.cssSelector("iframe[title='Rich text editor, body_html']")));
		
		login.driver.switchTo().frame(0);
		//(new WebDriverWait(login.driver,10)).until(ExpectedConditions.elementToBeClickable(By.className("cke_show_borders")));
		
		login.driver.findElement(By.className("cke_show_borders")).sendKeys(" TEST MESSAGE");
			
		
		login.driver.switchTo().defaultContent();
										
		//login.driver.findElement(By.xpath(".//*[@id='cke_body_html']/span[2]/span")).sendKeys("TEST MESSAGE");
		
		//Save
		
		login.wait(".//*[@id='submit_button']");
												
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
				
		
		
		}

}
