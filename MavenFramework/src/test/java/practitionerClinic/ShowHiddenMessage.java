package practitionerClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;



public class ShowHiddenMessage {
	
	@Test
	public void showhiddenmessage() throws Exception
	{

		PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[2]/a")).click();
		
		//Show hidden button
		
		login.wait(".//*[@id='content']/article/header/div/a[1]");
						
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]")).click();
		
		//
		
		String textmessage = login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]")).getText();
		
		boolean  flag = false;
		
		login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]");
		
		flag =login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(254,257,"PASS");
					Assert.assertTrue(flag);
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(254,256,"FAIL");
					Assert.assertTrue(flag);
				}
			
		
		
	
		
				
		AssertJUnit.assertEquals("TEST MESSAGE", textmessage);
				
				
	}

}
