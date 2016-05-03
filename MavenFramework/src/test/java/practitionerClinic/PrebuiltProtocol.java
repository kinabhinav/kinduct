package practitionerClinic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.SortTextPrac;

public class PrebuiltProtocol {
	
@Test(priority=1)
	
	public void protocol() throws Exception
	
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		//Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		
		//Prebuilt protocol
		
		login.wait(".//*[@id='prebuilt-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
		
		
		
		String xpathfilter =".//*[@id='prebuilt_table']/thead/tr/th[1]";
		
		String xpathtext = ".//*[@id='prebuilt_table']/tbody/tr[1]/td[1]/a";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathfilter,xpathtext,59,62);
				
	}
	
@Test(priority=2)
	
	public void protocol_sort_BodyPart() throws Exception
	
	{
		
		
		PracLogin login = new PracLogin();
		
		login.login();
		
		//Rehab 
				
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
		
		
		//Protocols
		
		login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		
		//Prebuilt protocol
		
		login.wait(".//*[@id='prebuilt-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
		
		
		String xpathsort =".//*[@id='prebuilt_table']/thead/tr/th[2]";
		
		String xpathtext = ".//*[@id='prebuilt_table']/tbody/tr[1]/td[2]";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathsort,xpathtext,62,63);
				
	}
@Test(priority=3)

public void protocol_sort_Tags() throws Exception

{
	
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Rehab 
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
	
	
	//Protocols
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
	
	//Prebuilt protocol
	
	login.wait(".//*[@id='prebuilt-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
	
	
	String xpathsort =".//*[@id='prebuilt_table']/thead/tr/th[3]";
	
	String xpathtext = ".//*[@id='prebuilt_table']/tbody/tr[1]/td[3]";
	
	SortTextPrac filter = new SortTextPrac();
	
	filter.sorttext(login.driver,xpathsort,xpathtext,63,64);
			
}
@Test(priority=4)

public void protocol_sort_Created () throws Exception

{
	
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Rehab 
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
	
	
	//Protocols
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
	
	//Prebuilt protocol
	
	login.wait(".//*[@id='prebuilt-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
	
	
	String xpathsort =".//*[@id='prebuilt_table']/thead/tr/th[4]";
	
	String xpathtext = ".//*[@id='prebuilt_table']/tbody/tr[1]/td[4]";
	
	SortTextPrac filter = new SortTextPrac();
	
	filter.sorttext(login.driver,xpathsort,xpathtext,64,65);
			
}

@Test(priority=5)

public void protocol_sort_Status () throws Exception

{
	
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Rehab 
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
	
	
	//Protocols
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
	
	//Prebuilt protocol
	
	login.wait(".//*[@id='prebuilt-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
	
	
	String xpathsort =".//*[@id='prebuilt_table']/thead/tr/th[5]";
	
	String xpathtext = ".//*[@id='prebuilt_table']/tbody/tr[1]/td[5]";
	
	SortTextPrac filter = new SortTextPrac();
	
	filter.sorttext(login.driver,xpathsort,xpathtext,65,66);
			
}
@Test(priority=6)

public void protocol_copy () throws Exception

{
	
	PracLogin login = new PracLogin();
	
	login.login();
	
	//Rehab 
			
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/a/span[1]")).click();
	
	
	//Protocols
	
	login.wait(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a");
	
	login.driver.findElement(By.xpath(".//*[@id='primary']/div[2]/ul/li[2]/ul/li[2]/a")).click();
	
	//Prebuilt protocol
	
	login.wait(".//*[@id='prebuilt-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
	
	//Copy
	
	login.wait(".//*[@id='prebuilt_table']/tbody/tr[1]/td[6]/a[1]/span");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt_table']/tbody/tr[1]/td[6]/a[1]/span")).click();
	
	//Workout name
	
	login.wait(".//*[@id='workout_name']");
	
	login.driver.findElement(By.xpath(".//*[@id='workout_name']")).clear();
	
	login.driver.findElement(By.xpath(".//*[@id='workout_name']")).sendKeys("Brendon M");
	
	//Save
	
	login.wait(".//*[@id='submit_button']");
	
	login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
	
	//title
	
	//String protocol = login.driver.getTitle();
	
	Status s = new Status();
	
	s.statusTitle(65, 67, login.driver,"Kinduct Clinic - Protocols");
			
	}

@Test(priority=7)

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
	
	//Prebuilt protocol
	
	login.wait(".//*[@id='prebuilt-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt-workouts-tab']/a")).click();
	
	// Protocol name
	
	login.wait(".//*[@id='prebuilt_table']/tbody/tr[1]/td[1]/a");
	
	String text = login.driver.findElement(By.xpath(".//*[@id='prebuilt_table']/tbody/tr[1]/td[1]/a")).getText();
	
	//Hide
	
	login.wait(".//*[@id='prebuilt_table']/tbody/tr[1]/td[6]/a[2]/span");
	
	login.driver.findElement(By.xpath(".//*[@id='prebuilt_table']/tbody/tr[1]/td[6]/a[2]/span")).click();
	

	
	// Protocol name
	
	login.wait(".//*[@id='prebuilt_table']/tbody/tr[1]/td[1]/a");
	
	String texthide = login.driver.findElement(By.xpath(".//*[@id='prebuilt_table']/tbody/tr[1]/td[1]/a")).getText();
	
	
	boolean test = !text.equalsIgnoreCase(texthide);
	
	System.out.println(test);
	Status s = new Status();
	
	s.statusBooleanTrue(67, 68, login.driver,test);
			
	}

}
