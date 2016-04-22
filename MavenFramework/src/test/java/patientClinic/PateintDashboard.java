package patientClinic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.Excel;

public class PateintDashboard {
	
	
	
	@Test (priority=2)
	public void condition() throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[1]/h3");
		
		//.//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/a/img
		
		
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/a/img")).click();
		
		login.wait(".//*[@id='modal-video']");
		
		boolean  flag = false;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(6,9,"PASS");
					AssertJUnit.assertTrue(flag);
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(6,9,"FAIL");
					AssertJUnit.assertTrue(flag);
					
				}
			
		login.driver.close();
		
	}

	
	@Test (priority=1)
	public void procedure() throws Exception
	{
		Login login = new Login();
		
		login.login();
		
		login.wait(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[1]/h3");
		
		System.out.println("test1");
		// login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[1]/h3")).click();
		 
		 System.out.println("test2");
		/* 
		 WebElement element= login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[2]/div/div[2]/a/img"));

		 JavascriptExecutor executor = (JavascriptExecutor) login.driver;
		 executor.executeScript("arguments[0].click();", element);
		
		 System.out.println("test4");*/
		 
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[2]/div[1]/div[3]/div/div[2]/div[1]/div/a/img")).click();
		
		login.wait(".//*[@id='modal-video']");
		
		boolean  flag = false;
		
		flag =login.driver.findElement(By.xpath(".//*[@id='modal-video']")).isDisplayed();
		
		
		
		
				if (flag==true) {
					
					flag=true;
					
				  Excel e = new Excel();
					
					e.excel(9,10,"PASS");
					AssertJUnit.assertTrue(flag);
					
				}
				else
				{
					Excel e = new Excel();
					flag=false;
					e.excel(6,9,"FAIL");
					AssertJUnit.assertTrue(flag);
					
				}
			
		login.driver.close();
		
	}

}
