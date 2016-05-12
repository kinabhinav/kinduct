package patientClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;


import com.kinduct.MavenFramework.Excel;

public class PatientDashboard {
	
	
	
	@Test (priority=1)
	public void condition() throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[1]/h3");
		
		//.//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/a/img
		
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/a/img")).click();
		
		login.wait(".//*[@id='modal-video']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();
		
		Thread.sleep(2000);
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();
		boolean  flag = false;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excelpatient(6,9,"PASS");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excelpatient(6,9,"FAIL");
					Assert.assertTrue(flag);
					login.driver.close();
				}
			
		login.driver.close();
		
	}

	
	@Test (priority=2)
	public void procedure() throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[1]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[1]")).click();
		 

		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[1]");
			
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[1]")).click();
			 
		login.wait(".//.//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/a/img");
				
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/a/img")).click();
		 
				
		boolean  flag = false;
		
		login.wait(".//*[@id='modal-video']");
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(9,10,"PASS");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(9,10,"FAIL");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
			
		login.driver.close();
		
	}
	@Test (priority=3)
	public void anatomy() throws Exception
	
	//public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/div/h4/a[2]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/div/h4/a[2]")).click();
		 

login.wait(".//*[@id='modal-video']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();
			 
		
		 
				
		boolean  flag = false;
		
		login.wait(".//*[@id='modal-video']");
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(9,10,"PASS");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(9,10,"FAIL");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
			
		login.driver.close();
		
	}
	
	@Test (priority=4)
	public void Functional_Anatomy() throws Exception
	
	//public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[3]/div/div[2]/div/h4/a[2]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[3]/div/div[2]/div/h4/a[2]")).click();
		 

		login.wait(".//*[@id='modal-video']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();
			 
		
		 
				
		boolean  flag = false;
		
		login.wait(".//*[@id='modal-video']");
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(9,10,"PASS");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(9,10,"FAIL");
					Assert.assertTrue(flag);
					login.driver.close();
					
				}
			
		login.driver.close();
		
	}

}
