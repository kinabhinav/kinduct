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
				
				e.excel(start,end,"PASS");
				
				Assert.assertTrue(true);
				
				driver.quit();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(start,end,"FAIL");
				test =false;
				
				Assert.assertTrue(true);
				
				driver.quit();
				
			}
		
	}public void statusBooleanFalse(int start,int end,WebDriver driver,Boolean test) throws Exception
	{
		
		if (test.equals(false)) {
			
			
			  Excel e = new Excel();
				
				e.excel(start,end,"PASS");
				
				Assert.assertFalse(false);
				
				driver.quit();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(start,end,"FAIL");
				test =true;
				
				Assert.assertFalse(false);
				
				driver.quit();
				
			}
		
	}

}
