package patientClinic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

import junit.framework.Assert;

public class PatientAssessment {
	
	@Test (priority=1)
	public void Assessment_view_icon () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Assessments
		login.wait(".//*[@id='profile_tabs']/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[2]/a")).click();
		
		
		//View
		login.wait(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span");
				
		login.driver.findElement(By.xpath(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span")).click();
		
		String title = login.driver.getTitle();
		
		if (login.driver.getTitle().equalsIgnoreCase("Kinduct Clinic - FMS Report")) {
			
			
			  Excel e = new Excel();
				
				e.excelpatient(21,22,"PASS");
				Assert.assertEquals("Kinduct Clinic - FMS Report", title);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(21,22,"FAIL");
				Assert.assertEquals("Kinduct Clinic - FMS Report", title);
				login.driver.close();
				
			}
		
		
		
	}
	@Test (priority=2)
	public void Assessment_view_email () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Assessments
		login.wait(".//*[@id='profile_tabs']/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[2]/a")).click();
		
		
		//View
		login.wait(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span");
				
		login.driver.findElement(By.xpath(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span")).click();
		
		//Email
		login.wait(".//*[@id='email-fms-report']");
				
		login.driver.findElement(By.xpath(".//*[@id='email-fms-report']")).click();		
		
		//Recipient
		login.wait(".//*[@id='modal-body']/form/div[3]/div/a");
				
		login.driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[3]/div/a")).click();			
		
		
		//Demo Practitioner
		login.wait(".//*[@id='user_giu006k4vhs1eze6']");
				
		login.driver.findElement(By.xpath(".//*[@id='user_giu006k4vhs1eze6']")).click();		
		
		//Select
		login.wait(".//*[@id='multi_select_user']/div[2]/div/div[3]/button");
				
		login.driver.findElement(By.xpath(".//*[@id='multi_select_user']/div[2]/div/div[3]/button")).click();		
		
				
		
		//text
		login.wait(".//*[@id='modal-body']/form/div[4]/textarea");
				
		login.driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[4]/textarea")).sendKeys("TEST");	
		
		//Send
		login.wait(".//*[@id='modal-body']/form/div[5]/button");
				
		login.driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[5]/button")).click();	
		
		
		//CLose
		login.wait(".//*[@id='modal-close']");
				
		login.driver.findElement(By.xpath(".//*[@id='modal-close']")).click();			
		
		
		String title = login.driver.getTitle();
		
		if (login.driver.getTitle().equalsIgnoreCase("Kinduct Clinic - FMS Report")) {
			
			
			  Excel e = new Excel();
				
				e.excelpatient(22,23,"PASS");
				Assert.assertEquals("Kinduct Clinic - FMS Report", title);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(22,23,"FAIL");
				Assert.assertEquals("Kinduct Clinic - FMS Report", title);
				login.driver.close();
				
			}
		
		
		
	}
	

	@Test (priority=3)
	public void Assessment_View_Print () throws Exception
	
	
	{
		Login login = new Login();
		
		login.login();
		
		//Assessments
		login.wait(".//*[@id='profile_tabs']/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[2]/a")).click();
		
		
		//View
		login.wait(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span");
				
		login.driver.findElement(By.xpath(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span")).click();
		
		//Print
		login.wait(".//*[@id='screening-view']/div[3]/div[2]/a[2]");
				
		login.driver.findElement(By.xpath(".//*[@id='screening-view']/div[3]/div[2]/a[2]")).click();
		
		String title = login.driver.getTitle();
		
	
		
		if (login.driver.getTitle().equalsIgnoreCase("Kinduct Clinic - FMS Report")) {
			
			
			  Excel e = new Excel();
				
				e.excelpatient(23,24,"PASS");
				Assert.assertEquals("Kinduct Clinic - FMS Report", title);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(23,24,"FAIL");
				Assert.assertEquals("Kinduct Clinic - FMS Report", title);
				login.driver.close();
				
			}
	}
	@Test (priority=4)
	public void Assessment_View_Back () throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//Assessments
		login.wait(".//*[@id='profile_tabs']/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_tabs']/li[2]/a")).click();
		
		
		//View
		login.wait(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span");
				
		login.driver.findElement(By.xpath(".//*[@id='assessments-table']/tbody/tr[1]/td[6]/a/span")).click();
		
		//back button
		login.wait(".//*[@id='backlink']");
				
		login.driver.findElement(By.xpath(".//*[@id='backlink']")).click();		
		
		String title = login.driver.getTitle();
		
		if (login.driver.getTitle().equalsIgnoreCase("Kinduct Clinic - Home")) {
			
			
			  Excel e = new Excel();
				
				e.excelpatient(24,25,"PASS");
				Assert.assertEquals("Kinduct Clinic - Home", title);
				login.driver.close();
				
			}
			else
			{
				Excel e = new Excel();
				
				e.excelpatient(24,25,"FAIL");
				Assert.assertEquals("Kinduct Clinic - Home", title);
				login.driver.close();
				
			}
		
	}
}
