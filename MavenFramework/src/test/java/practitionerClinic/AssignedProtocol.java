package practitionerClinic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.SortTextPrac;

public class AssignedProtocol {
@Test (priority=1)
public void protocol() throws Exception
	
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		// Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		//Assigned Protocol
		
		login.wait(".//*[@id='assigned-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='assigned-workouts-tab']/a")).click();
		
		
		String xpathfilter =".//*[@id='assigned_table']/thead/tr/th[1]";
		
		String xpathtext = ".//*[@id='assigned_table']/tbody/tr[1]/td[1]/a";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathfilter,xpathtext,46,49);
	}

@Test (priority=2)
public void protocol_Created_By() throws Exception
	
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		// Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		//Assigned Protocol
		
		login.wait(".//*[@id='assigned-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='assigned-workouts-tab']/a")).click();
		
		//Created By
		
		
		
		String xpathfilter =".//*[@id='assigned_table']/thead/tr/th[2]";
		
		String xpathtext = ".//*[@id='assigned_table']/tbody/tr[1]/td[2]";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathfilter,xpathtext,49,50);
	}

@Test (priority=3)
public void protocol_Assigned_To() throws Exception
	
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		// Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		//Assigned Protocol
		
		login.wait(".//*[@id='assigned-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='assigned-workouts-tab']/a")).click();
		
		//Assigned To
		
		
		
		String xpathfilter =".//*[@id='assigned_table']/thead/tr/th[3]";
		
		String xpathtext = ".//*[@id='assigned_table']/tbody/tr[1]/td[3]";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathfilter,xpathtext,50,51);
	}

@Test (priority=4)
public void protocol_Date() throws Exception
	
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		// Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		//Assigned Protocol
		
		login.wait(".//*[@id='assigned-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='assigned-workouts-tab']/a")).click();
		
		//Assigned To
		
		
		
		String xpathfilter =".//*[@id='assigned_table']/thead/tr/th[4]";
		
		String xpathtext = ".//*[@id='assigned_table']/tbody/tr[1]/td[4]";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathfilter,xpathtext,51,52);
	}

@Test(priority=5)

public void protocol_delete () throws Exception

{
PracLogin login = new PracLogin();
	
	login.login();
	
	//Rehab 
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
	
	
	//Protocols
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
	
	// Protocol name
	
	login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a");
	
	String text = login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a")).getText();
	
	//Hide
	
	login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[2]/span");
	
	login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[2]/span")).click();
	
	// Protocol name
	
	login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a");
			
	String texthide = login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a")).getText();
	
	
	boolean test = !text.equalsIgnoreCase(texthide);
	
	System.out.println(test);
	Status s = new Status();
	
	
	s.statusBooleanTrue(54, 55, login.driver,test);
			
	}

@Test(priority=6)

public void protocol_hide () throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Rehab 
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
	
	
	//Protocols
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
	
	// Protocol name
	
	login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a");
	
	String text = login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a")).getText();
	
	//Hide
	
	login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[2]/span");
	
	login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[2]/span")).click();
	
	// Protocol name
	
	login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a");
			
	String texthide = login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[1]/a")).getText();
	
	
	boolean test = !text.equalsIgnoreCase(texthide);
	
	System.out.println(test);
	Status s = new Status();
	
	s.statusBooleanTrue(55, 56, login.driver,test);
			
	}

}
