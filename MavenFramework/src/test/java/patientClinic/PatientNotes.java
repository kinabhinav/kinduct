package patientClinic;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

public class PatientNotes {
	
	@Test (priority=1)
	public void Add_Note () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Notes
		login.wait(".//*[@id='profile_tabs']/li[5]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[5]/a")).click();
		
		//add note
		
		login.wait(".//*[@id='profile_notes']/div[1]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).click();
		
		//Note:
		
		login.wait(".//*[@id='note']");
		 
		login.driver.findElement(By.xpath(".//*[@id='note']")).sendKeys("Automation Testing Note");
		
		
		//Save
		
		login.wait(".//*[@id='modal-save']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
		//login.wait(".//*[@id='notes_table']/tbody/tr[1]/td[2]");
		
		//String text = login.driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[2]")).getText();
		
		//if (text.equalsIgnoreCase("Automation Testing Note")) 
		
		login.wait(".//*[@id='profile_notes']/div[1]/a");
		
		if (login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed())
		{
			
			
			  Excel e = new Excel();
				
				e.excelpatient(45,49,"PASSED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(45,49,"FAILED");
				//Assert.assertEquals(text, "Automation Testing Note");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				login.driver.close();
				
			}
		
		
	}
	
	@Test (priority=2)
	public void Notes_Add_Cancel_link () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Notes
		login.wait(".//*[@id='profile_tabs']/li[5]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[5]/a")).click();
		
		//Add Note
		
		login.wait(".//*[@id='profile_notes']/div[1]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).click();
		

		//Cancel 		
		
		login.wait(".//*[@id='modal-close']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-close']")).click();
		
		//add note button
		
		
		if (login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed())
		{
			  Excel e = new Excel();
				
				e.excelpatient(49,51,"PASSED");
				
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				
				login.driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(49,51,"FAILED");
			
			Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
			
			login.driver.close();
			
		}
	}
	@Test (priority=3)
	public void Notes_Edit () throws Exception
	//public static void main (String [] args) throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Notes
		login.wait(".//*[@id='profile_tabs']/li[5]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[5]/a")).click();
		
		//Edit		
		
		login.wait(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[1]/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[1]/span[1]")).click();
		
		//Edit note 
		
		login.wait(".//*[@id='note']");
		
		login.driver.findElement(By.xpath(".//*[@id='note']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='note']")).sendKeys("Automation Testing Note EDIT");
		
		//Save 
		
		login.wait(".//*[@id='modal-save']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
		//.//*[@id='notes_table']/tbody/tr[1]/td[2]
		//login.wait(".//*[@id='notes_table']/tbody/tr[1]/td[2]");
		
		//String note1 = login.driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[2]")).getText();
		
		//System.out.println(note1);
		login.wait(".//*[@id='profile_notes']/div[1]/a");
		
		if (login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed())
		
		//if (note1.equalsIgnoreCase("Automation Testing Note EDIT") ) 
		{
			
			
			  Excel e = new Excel();
				
				e.excelpatient(51,53,"PASSED");
				
				//Assert.assertEquals(note1, "Automation Testing Note EDIT");
				
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(51,53,"FAILED");
				//Assert.assertEquals(note1, "Automation Testing Note EDIT");
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				login.driver.close();
				
			}
	}
	@Test (priority=4)
	public void Notes_Edit_Cancel_link () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Notes
		login.wait(".//*[@id='profile_tabs']/li[5]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[5]/a")).click();
		
		//Edit		
		
		login.wait(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[1]/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[1]/span[1]")).click();
		
		//Cancel link
		
		//Cancel 		
		
		login.wait(".//*[@id='modal-close']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-close']")).click();
		
		login.wait(".//*[@id='profile_notes']/div[1]/a");
		
		if (login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed())
		{
			  Excel e = new Excel();
				
				e.excelpatient(53,55,"PASSED");
				
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				
				login.driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(53,55,"FAILED");
			
			Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
			
			login.driver.close();
			
		}
		
	}
	@Test (priority=5)
	public void Notes_Delete () throws Exception
	//public static void main (String [] args) throws Throwable 
	{
		Login login = new Login();
		
		login.login();
		
		//Notes
		login.wait(".//*[@id='profile_tabs']/li[5]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[5]/a")).click();
		
		//Delete
		login.wait(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[2]/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[4]/a[2]/span[1]")).click();
		
		//Yes
		
		login.wait(".//*[@id='modal-save']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
		
		/*
		try
		{
			
			login.wait(".//*[@id='notes_table']/tbody/tr[1]/td[2]");
			login.driver.findElement(By.xpath(".//*[@id='notes_table']/tbody/tr[1]/td[2]")).isDisplayed();
			System.out.println("NOt As Expected");
		}
		catch ( NoSuchElementException e)
		{
			System.out.println("As Expected");
			System.out.println(e.getMessage());
		}
		
		*/
		
		login.wait(".//*[@id='profile_notes']/div[1]/a");
		
		if (login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed())
		{
			  Excel e = new Excel();
				
				e.excelpatient(55,56,"PASSED");
				
				Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
				
				login.driver.close();
			
		}
		else
		{
			Excel e = new Excel();
			
			e.excelpatient(55,56,"FAILED");
			
			Assert.assertEquals(login.driver.findElement(By.xpath(".//*[@id='profile_notes']/div[1]/a")).isDisplayed(),true);
			
			login.driver.close();
			
		}
		
	
	
	}
	

}
