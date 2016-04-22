package practitionerClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

public class DeleteMessage {
	
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
		
		//delete icon
		
		login.wait(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[2]/span[1]");
						
		login.driver.findElement(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[7]/a[2]/span[1]")).click();
		
		
		boolean  flag = true;
		
		//login.wait(".//*[@id='content']/article/header/div/a[1]");
		
		flag =login.driver.findElements(By.xpath(".//*[@id='content']/article/div/table/tbody/tr[1]/td[5]")).size() > 0;
		
		System.out.println(flag);
		
		
				if (flag==false) {
					
					flag=false;
					
				  Excel e = new Excel();
					
					e.excel(265,268,"PASS");
					
					AssertJUnit.assertFalse(flag);
					
					
				}
				else
				{
					Excel e = new Excel();
					flag=true;
					e.excel(265,268,"FAIL");
					AssertJUnit.assertFalse(flag);

				}
			
		login.driver.close();
	}

}
