package patientClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kinduct.MavenFramework.Excel;



public class PatientJournal {
	
	@Test (priority=1)
	public void Journal_View () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Journals
		login.wait(".//*[@id='profile_tabs']/li[3]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[3]/a")).click();
		
		//View Report
		
		login.wait(".//*[@id='journal_form']/header/div/div[2]/a/span[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div/div[2]/a/span[2]")).click();
		
		String text = login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div[1]/a")).getText();
		
		System.out.println(text);
		SoftAssert sa = new SoftAssert(); 
		//sa.assertFalse(text.equals("new journal entry"));
		//sa.assertTrue(text.equals, "new journal entry");
		
		
		if (text.equalsIgnoreCase("new journal entry")) {
			
			
			  Excel e = new Excel();
				
				//e.excelpatient(26,30,"PASS");
				Assert.assertEquals(text, "new journal entry");
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				//e.excelpatient(26,30,"FAIL");
				Assert.assertEquals(text, "new journal entry");
				login.driver.close();
				
			}
		
		
	}
	@Test (priority=2)
	public void Journal_New_Entry () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Journal
		login.wait(".//*[@id='profile_tabs']/li[3]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[3]/a")).click();
		
		//View Report
		
		login.wait(".//*[@id='journal_form']/header/div/div[2]/a/span[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div/div[2]/a/span[2]")).click();
		
		//new journal entry
		login.wait(".//*[@id='journal_form']/header/div[1]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div[1]/a")).click();
		
		//Sleep
		
		login.wait(".//*[@id='result17491']");
		
		login.driver.findElement(By.xpath(".//*[@id='result17491']")).clear();
		login.driver.findElement(By.xpath(".//*[@id='result17491']")).sendKeys("3");
		
		//Soreness
		login.wait(".//*[@id='result17492']");
		
		login.driver.findElement(By.xpath(".//*[@id='result17492']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='result17492']")).sendKeys("3");		

		
		//Comment
		
		login.wait(".//*[@id='comments']");
		
		login.driver.findElement(By.xpath(".//*[@id='comments']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='comments']")).sendKeys("Test");
		
		//Submit
		
		login.wait(".//*[@id='submit_button']/span[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']/span[2]")).click();
		
		
		
		login.wait(".//*[@id='journal_form']/div[12]/div");
		
		String text1 = login.driver.findElement(By.xpath(".//*[@id='journal_form']/div[12]/div")).getText();
		
		System.out.println(text1);
		
		
		if (text1.equalsIgnoreCase("Journal entry has been saved")) {
			
			System.out.println("53425");
			  Excel e = new Excel();
				
			//	e.excelpatient(30,31,"PASS");
				//sa1.assertEquals(text1, "Journal entry has been saved");
				Assert.assertEquals(text1,"Journal entry has been saved");
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				//e.excelpatient(30,31,"FAIL");
				//sa1.assertEquals(text1, "Journal entry has been saved");
				Assert.assertEquals(text1,"Journal entry has been saved");
				login.driver.close();
				
			}
		
		
		
	}


}
