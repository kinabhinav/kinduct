package practitionerClinic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.kinduct.MavenFramework.Excel;

public class Status {
	
	public void statusTitle(int start,int end,WebDriver driver,String title) throws Exception
	{
		
		if (driver.getTitle().equalsIgnoreCase(title)) 
		{
			System.out.println(title);
			Excel e = new Excel();
		 
			Assert.assertEquals(driver.getTitle(), title);
			e.excel(start,end,"PASS");
			driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			Assert.assertEquals(driver.getTitle(), title);
			e.excel(start,end,"FAIL");
			driver.close();
			
		}
	}
	
	public void statusTitlepatient(int start,int end,WebDriver driver,String title) throws Exception
	{
		
		if (driver.getTitle().equalsIgnoreCase(title)) 
		{
			System.out.println(title);
			Excel e = new Excel();
		 
			Assert.assertEquals(driver.getTitle(), title);
			e.excelpatient(start,end,"PASS");
			driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			Assert.assertEquals(driver.getTitle(), title);
			e.excelpatient(start,end,"FAIL");
			driver.close();
			
		}
	}
	
	public void statusBooleanTrue(int start,int end,WebDriver driver,Boolean test) throws Exception
	{
		
		if (test.equals(true)) {
			
			
			  Excel e = new Excel();
				
				e.excel(start,end,"PASS");
				
				Assert.assertTrue(true);
				
				driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(start,end,"FAIL");
				test =false;
				
				Assert.assertTrue(true);
				
				driver.close();
				
			}
		
	}
	
	public void statuspatientBooleanTrue(int start,int end,WebDriver driver,Boolean test) throws Exception
	{
		
		if (test.equals(true)) {
			
			
			  Excel e = new Excel();
				
				e.excel(start,end,"PASS");
				
				Assert.assertTrue(true);
				
				driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(start,end,"FAIL");
				test =false;
				
				Assert.assertTrue(true);
				
				driver.close();
				
			}
		
	}
	
	public void statusBooleanFalse(int start,int end,WebDriver driver,Boolean test) throws Exception
	{
		
		if (test.equals(false)) {
			
			
			  Excel e = new Excel();
				
				e.excel(start,end,"PASS");
				
				Assert.assertFalse(false);
				
				driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excel(start,end,"FAIL");
				test =true;
				
				Assert.assertFalse(false);
				
				driver.close();
				
			}
		
	}
	
	public void statuspatientBooleanFalse(int start,int end,WebDriver driver,Boolean test) throws Exception
	{
		
		if (test.equals(false)) {
			
			
			  Excel e = new Excel();
				
				e.excelpatient(start,end,"PASS");
				
				Assert.assertFalse(false);
				
				driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(start,end,"FAIL");
				test =true;
				
				Assert.assertFalse(false);
				
				driver.close();
				
			}
		
	}


}
