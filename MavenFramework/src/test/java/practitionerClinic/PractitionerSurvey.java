package practitionerClinic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import practitionerClinic.PracLogin;

public class PractitionerSurvey {
	
	@Test(priority=1,groups="survey")
	public void create_survey() throws Exception
	
	//public static void main(String[] args)throws Exception
	
	{

		PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a")).click();
		
		//Create a survey
		
		login.isElementHiddenNow(".//*[@id='content']/article/header/div/a/span");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a/span")).click();
		
		//Survey name
		
		login.isElementHiddenNow(".//*[@id='name']");
		
		login.driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Practitioner: Create Survey");
		
		
		//Save 
		
		login.isElementHiddenNow(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		//finish
		
		login.isElementHiddenNow(".//*[@id='content']/article/header/div/a[4]/span");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[4]/span")).click();
		
		//Assign  
		
		login.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span");
		
		login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[3]/span")).click();
		
		//Select Recipient  
		
		login.isElementHiddenNow(".//*[@id='select_link']");
		
		login.driver.findElement(By.xpath(".//*[@id='select_link']")).click();
		
		//Patient 1  
		
		login.isElementHiddenNow(".//*[@id='user_v6nieof8rsdlhpuw']");
		
		login.driver.findElement(By.xpath(".//*[@id='user_v6nieof8rsdlhpuw']")).click();
		
		//Select
		
		login.isElementHiddenNow(".//*[@id='multi_select_user']/div/div/div[3]/button");
		
		login.driver.findElement(By.xpath(".//*[@id='multi_select_user']/div/div/div[3]/button")).click();
		
		
		//Save 
		login.isElementHiddenNow(".//*[@id='submit_button']/span");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']/span")).click();
		
		
		
	}
	
	@Test(priority=2,groups="survey")
	public void delete_survey() throws Exception
	
	//public static void main(String[] args)throws Exception
	
	{

		PracLogin login = new PracLogin();
		
		login.login();
		
		//communication
		
		login.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/a/span[1]")).click();
		
		//message center
		
		login.isElementHiddenNow(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a");
				
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[6]/ul/li[3]/a")).click();
		
		//Create a survey
		
		login.isElementHiddenNow(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[4]/span");
		
		login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[3]/a[4]/span")).click();
		
	}

	
	

}
