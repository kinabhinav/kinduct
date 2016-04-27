package patientClinic;

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
		
		login.wait(".//*[@id='journal_form']/header/div/div[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div/div[2]/a")).click();
		
		String text = login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div[1]/a")).getText();
		
		System.out.println(text);
		SoftAssert sa = new SoftAssert(); 
		//sa.assertFalse(text.equals("new journal entry"));
		//sa.assertTrue(text.equals, "new journal entry");
		
		
		if (text.equalsIgnoreCase("new journal entry")) {
			
			
			  Excel e = new Excel();
				
				e.excelpatient(26,30,"PASS");
				sa.assertEquals(text, "new journal entry");
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(26,30,"FAIL");
				sa.assertEquals(text, "new journal entry");
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
		
		login.wait(".//*[@id='journal_form']/header/div/div[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div/div[2]/a")).click();
		
		//new journal entry
		login.wait(".//*[@id='journal_form']/header/div[1]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='journal_form']/header/div[1]/a")).click();
		
		//Sleep
		
		login.wait(".//*[@id='result17524']");
		
		login.driver.findElement(By.xpath(".//*[@id='result17524']")).clear();
		login.driver.findElement(By.xpath(".//*[@id='result17524']")).sendKeys("3");
		
		//Soreness
		login.wait(".//*[@id='result17525']");
		
		login.driver.findElement(By.xpath(".//*[@id='result17525']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='result17525']")).sendKeys("3");		

		
		//Comment
		
		login.wait(".//*[@id='comments']");
		
		login.driver.findElement(By.xpath(".//*[@id='comments']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='comments']")).sendKeys("Test");
		
		//Submit
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		
		
		login.wait(".//*[@id='journal_form']/div[13]/div");
		
		String text1 = login.driver.findElement(By.xpath(".//*[@id='journal_form']/div[13]/div")).getText();
		
		System.out.println(text1);
		
		
		if (text1.equalsIgnoreCase("Journal entry has been saved")) {
			
			System.out.println("53425");
			  Excel e = new Excel();
				
				e.excelpatient(30,31,"PASS");
				//sa1.assertEquals(text1, "Journal entry has been saved");
				Assert.assertEquals(text1,"Journal entry has been saved");
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(30,31,"FAIL");
				//sa1.assertEquals(text1, "Journal entry has been saved");
				Assert.assertEquals(text1,"Journal entry has been saved");
				login.driver.close();
				
			}
		
		
		
	}


}
