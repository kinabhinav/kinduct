package patientClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.kinduct.MavenFramework.Excel;

import practitionerClinic.Status;

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
		
		boolean  flag = true;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(1, 8, login.driver, flag);
		
		
			
		login.driver.close();
		
	}

	
	@Test (priority=2)
	public void procedure() throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[1]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[1]")).click();
		 
		login.wait(".//*[@id='modal-video']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();		
		
		boolean  flag = true;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(8, 9, login.driver, flag);
		
			
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
		
		boolean  flag = true;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(9, 10, login.driver, flag);
		login.driver.close();
		
	}
	
	@Test (priority=4)
	public void Functional_anatomy() throws Exception
	
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
			 
		boolean  flag = true;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(10,11, login.driver, flag);
		
		login.driver.close();
		
	}
	
	@Test (priority=5)
	public void FAQ() throws Exception
	
	//public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
    	JavascriptExecutor js2 = (JavascriptExecutor) login.driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
        
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[4]/div/div[2]/div/div[1]/a[2]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[4]/div/div[2]/div/div[1]/a[2]")).click();
		 

		login.wait(".//*[@id='modal-video']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();
			 
		boolean  flag = true;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(11,12, login.driver, flag);
		
		login.driver.close();
		
	}
	
	
	@Test (priority=6)
	public void Recent_Activity() throws Exception
	
	//public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
    	JavascriptExecutor js2 = (JavascriptExecutor) login.driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
        
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[5]/div/div[2]/div[1]/a");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[5]/div/div[2]/div[1]/a")).click();
		 

		login.wait(".//*[@id='content']/article/header/div/a");
		
		//login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a")).click();
			 
		boolean  flag = true;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(12,13, login.driver, flag);
		
		login.driver.close();
		
	}
	
	@Test (priority=7)
	public void FMS_Exercise_Program() throws Exception
	
	//public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		//JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
      //  js1.executeScript("javascript:window.scrollBy(250,350)");
		
    	
        
		login.wait(".//*[@id='table_program']/tbody/tr[1]/td[2]/a");
		
		
		login.driver.findElement(By.xpath(".//*[@id='table_program']/tbody/tr[1]/td[2]/a")).click();
		
		login.wait(".//*[@id='modal-video']");
		
		login.driver.findElement(By.xpath(".//*[@id='modal-video']")).click();
		
		Boolean status= true;
		
		status = login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		Status s = new Status();
		
		s.statuspatientBooleanTrue(13, 14, login.driver, status);
	}
	
	//@Test (priority=8)
	//public void Surveys() throws Exception
	
	public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
        JavascriptExecutor js2 = (JavascriptExecutor) login.driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
        
		login.wait(".//*[@id='profile_main']/article/div[2]/div[2]/div[2]/div/div[2]/ul/li[2]/a[1]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[2]/div[2]/div/div[2]/ul/li[2]/a[1]")).click();
		
		login.wait(".//*[@id='content']/article/header/div/a");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a")).click();
		
				
		String title="Kinduct Clinic - Home";
		
		Status s = new Status();
		
		s.statusTitlepatient(14, 15, login.driver, title);
	}
	//Meal Options
	@Test (priority=9)
	public void Meal_Options() throws Exception
	
	//public static void main(String [] args)  throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
        js1.executeScript("javascript:window.scrollBy(250,350)");
		
		JavascriptExecutor js2 = (JavascriptExecutor) login.driver;
        js2.executeScript("javascript:window.scrollBy(250,350)");
        
		login.wait(".//*[@id='profile_main']/article/div[2]/div[2]/div[3]/div/div[2]/h4/a[2]");
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[2]/div[3]/div/div[2]/h4/a[2]")).click();
		
		//Meal Plan
		login.wait(".//*[@id='content-container']/section/div/div/div/div[2]/h1");
		
		//String text=login.driver.findElement(By.xpath(".//*[@id='content-container']/section/div/div/div/div[2]/h1")).getText();
		
				
		String title="Kinduct Clinic - Meal Plan";
		
		Status s = new Status();
		
		s.statusTitlepatient(15, 16, login.driver, title);
	}
	
}
