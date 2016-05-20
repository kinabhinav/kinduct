package practitionerClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Edit_Patient_Dashboard {

	
	@Test(priority=1)

	public void EPD_Account() throws Exception

	//public static void main(String[] args) throws Exception

	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Search patient
				
		login.wait(".//*[@id='user-search-term']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("DemoPatient1");
		
		
		//Search button
		
		login.wait(".//*[@id='user-list-search']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list-search']")).click();

		
		//Click on patient
		
		login.wait(".//*[@id='user-list']/tbody/tr/td[1]/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list']/tbody/tr/td[1]/span/a")).click();
		
		//Click on Edit Patient Dashboard
		
		login.wait(".//*[@id='profile_main']/article/div[1]/div/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).click();
		
		//First Name
		
		login.wait(".//*[@id='fields-profile']/div/div[1]/label");
		
		String fname = login.driver.findElement(By.xpath(".//*[@id='fields-profile']/div/div[1]/label")).getText();
		
		//Last Name
		
		login.wait(".//*[@id='fields-profile']/div/div[2]/label");
		
		String lname = login.driver.findElement(By.xpath(".//*[@id='fields-profile']/div/div[2]/label")).getText();
		
		Boolean flag;
		//
		
		if(fname.equalsIgnoreCase("First Name:")&&lname.equalsIgnoreCase("Last Name:"))
			
		{
			flag= true;
			
			Assert.assertTrue(flag);
			
		}
		
		else
		{
			flag= false;
			
			Assert.assertTrue(flag);
			
		}
		
		//JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
	   // js1.executeScript("javascript:window.scrollBy(250,350)");
		
		login.driver.close();
		
		
	}
	
	@Test(priority=2)

	public void EPD_BodyPart() throws Exception

	//public static void main(String[] args) throws Exception

	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Search patient
				
		login.wait(".//*[@id='user-search-term']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("DemoPatient1");
		
		
		//Search button
		
		login.wait(".//*[@id='user-list-search']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list-search']")).click();

		
		//Click on patient
		
		login.wait(".//*[@id='user-list']/tbody/tr/td[1]/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list']/tbody/tr/td[1]/span/a")).click();
		
		//Click on Edit Patient Dashboard
		
		login.wait(".//*[@id='profile_main']/article/div[1]/div/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).click();
		
		//Reset Bodypart
		
		login.wait(".//*[@id='reset-body-part']");
		
		login.driver.findElement(By.xpath(".//*[@id='reset-body-part']")).click();
		
		//Select Body part
		
				login.wait(".//*[@id='fields-body-part']/div/div/div/div/div/button");
				
				login.driver.findElement(By.xpath(".//*[@id='fields-body-part']/div/div/div/div/div/button")).click();
				
				//select Elbow
				login.wait(".//*[@id='fields-body-part']/div/div/div/div/div/ul/li[4]/a/label/input");
				
				login.driver.findElement(By.xpath(".//*[@id='fields-body-part']/div/div/div/div/div/ul/li[4]/a/label/input")).click();
				
				login.wait(".//*[@id='fields-body-part']/div/div/div/div/div/button");
				
				login.driver.findElement(By.xpath(".//*[@id='fields-body-part']/div/div/div/div/div/button")).click();
				
		
		
		
		//JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
	   // js1.executeScript("javascript:window.scrollBy(250,350)");
		
		login.driver.close();
		
		
	}
	
	@Test(priority=3,groups={"p1"})

	public void EPD_Cancel_button() throws Exception

	//public static void main(String[] args) throws Exception

	{
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Search patient
				
		login.wait(".//*[@id='user-search-term']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-search-term']")).sendKeys("DemoPatient1");
		
		
		//Search button
		
		login.wait(".//*[@id='user-list-search']");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list-search']")).click();

		
		//Click on patient
		
		login.wait(".//*[@id='user-list']/tbody/tr/td[1]/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='user-list']/tbody/tr/td[1]/span/a")).click();
		
		//Click on Edit Patient Dashboard
		
		login.wait(".//*[@id='profile_main']/article/div[1]/div/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) login.driver;
		js1.executeScript("javascript:window.scrollBy(250,350)");
		
		//Cancel button
		
		login.wait(".//*[@id='patient-form']/span/a");
		
		login.driver.findElement(By.xpath(".//*[@id='patient-form']/span/a")).click();
		
		Assert.assertTrue(login.driver.findElement(By.xpath(".//*[@id='profile_main']/article/div[1]/div/div/a[1]")).isDisplayed());
		
		login.driver.close();
		
	}

}
