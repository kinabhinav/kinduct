package practitionerClinic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.kinduct.MavenFramework.Excel;

public class Status {
	
	public void statusTitle(int start,int end,WebDriver driver,String title) throws Exception
	{
		
		if (driver.getTitle().equalsIgnoreCase(title)) 
		{
		
			Excel e = new Excel();
		 
			Assert.assertEquals(driver.getTitle(), title);
			e.excel(start,end,"PASS");
			driver.quit();
			
		}
		else
		{
			Excel e = new Excel();
			Assert.assertEquals(driver.getTitle(), title);
			e.excel(start,end,"FAIL");
			driver.quit();
			
		}
	}
	
	public void statusBooleanTrue(int start,int end,WebDriver driver,Boolean test) throws Exception
	{
		
		if (test.equals(true)) {
			
			
			  Excel e = new Excel();
				
				e.excel(6,8,"PASS");
				
				Assert.assertTrue(true);
				
				driver.quit();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(6,8,"FAIL");
				test =false;
				
				Assert.assertTrue(true);
				
				driver.quit();
				
			}
		
	}

}
