package practitionerClinic;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

import adminClinic.PostMessage;



public class HideMessage {
	@Test
	public void hidemessage() throws Exception
	{
		
		PostMessage admin = new PostMessage();
		
		admin.postmessage();
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
		
				
		//hide
		
		login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]");
						
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[1]/span[1]")).click();
		
		boolean  flag = false;
		
		login.wait(".//*[@id='content']/article/header/div/a[1]");
		
		flag =login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(250,253,"PASS");
					
					Assert.assertTrue(flag);
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(250,253,"FAIL");
					Assert.assertTrue(flag);
					
				}
			
		login.driver.close();
		
	
				
			
		
	}
	
	

}
