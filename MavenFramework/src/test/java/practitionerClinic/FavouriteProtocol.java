package practitionerClinic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.kinduct.MavenFramework.SortTextPrac;

public class FavouriteProtocol {
	
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
		
		
		//Favorite Protocols  
		
		login.wait(".//*[@id='favourite-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
		
		String xpathfilter =".//*[@id='favourite_table']/thead/tr/th[1]";
		
		String xpathtext = ".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathfilter,xpathtext,70,73);
				
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
		
		//Favorite Protocols  
		
		login.wait(".//*[@id='favourite-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
		
		String xpathsort =".//*[@id='favourite_table']/thead/tr/th[3]";
		
		String xpathtext = ".//*[@id='favourite_table']/tbody/tr[1]/td[3]/a";
		
		SortTextPrac filter = new SortTextPrac();
		
		filter.sorttext(login.driver,xpathsort,xpathtext,73,74);
				
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
	
	//Favorite Protocols  
	
	login.wait(".//*[@id='favourite-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
	
	String xpathsort =".//*[@id='favourite_table']/thead/tr/th[4]";
	
	String xpathtext = ".//*[@id='favourite_table']/tbody/tr[1]/td[4]/a";
	
	SortTextPrac filter = new SortTextPrac();
	
	filter.sorttext(login.driver,xpathsort,xpathtext,74,75);
			
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
	
	//Favorite Protocols  
	
	login.wait(".//*[@id='favourite-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
	
	String xpathsort =".//*[@id='favourite_table']/thead/tr/th[5]";
	
	String xpathtext = ".//*[@id='favourite_table']/tbody/tr[1]/td[5]/a";
	
	SortTextPrac filter = new SortTextPrac();
	
	filter.sorttext(login.driver,xpathsort,xpathtext,75,76);
			
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
	
	//Favorite Protocols  
	
	login.wait(".//*[@id='favourite-workouts-tab']/a");
	
	login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
	
	String xpathsort =".//*[@id='favourite_table']/thead/tr/th[6]";
	
	String xpathtext = ".//*[@id='favourite_table']/tbody/tr[1]/td[6]/a";
	
	SortTextPrac filter = new SortTextPrac();
	
	filter.sorttext(login.driver,xpathsort,xpathtext,76,77);
			
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
		
		//Favorite Protocols  
		
		login.wait(".//*[@id='favourite-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
		

		
		//Copy
		
		login.wait(".//*[@id='favourite_table']/tbody/tr[1]/td[7]/a[1]/span");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite_table']/tbody/tr[1]/td[7]/a[1]/span")).click();
		
		//Workout name
		
		login.wait(".//*[@id='workout_name']");
		
		login.driver.findElement(By.xpath(".//*[@id='workout_name']")).clear();
		
		login.driver.findElement(By.xpath(".//*[@id='workout_name']")).sendKeys("PLANK");
		
		//Save
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		//title
		
		//String protocol = login.driver.getTitle();
		
		Status s = new Status();
		
		s.statusTitle(77, 79, login.driver,"Kinduct Clinic - Protocols");
				
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
		
		//Favorite Protocols  
		
		login.wait(".//*[@id='favourite-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
		
		// Protocol name
		
		login.wait(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a");
		
		String text = login.driver.findElement(By.xpath(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a")).getText();
		
		//Hide
		
		login.wait(".//*[@id='favourite_table']/tbody/tr[1]/td[7]/a[2]/span");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite_table']/tbody/tr[1]/td[7]/a[2]/span")).click();
		
		// Protocol name
		
		login.wait(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a");
		
		String texthide = login.driver.findElement(By.xpath(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a")).getText();
		
		
		boolean test = !text.equalsIgnoreCase(texthide);
		
		System.out.println(test);
		Status s = new Status();
		
		s.statusBooleanTrue(79,80, login.driver,test);
				
		}
	
	@Test(priority=8)

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
		
		
		//Favorite Protocols  
		
		login.wait(".//*[@id='favourite-workouts-tab']/a");
		
		login.driver.findElement(By.xpath(".//*[@id='favourite-workouts-tab']/a")).click();
		
		
		
		// Protocol name
		
		login.wait(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a");
		
		String text = login.driver.findElement(By.xpath(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a")).getText();
		
		//Hide
		
		login.wait(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[2]/span");
		
		login.driver.findElement(By.xpath(".//*[@id='generic_table']/tbody/tr[1]/td[7]/a[2]/span")).click();
		
		// Protocol name
		

		
		login.wait(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a");
		
		String texthide = login.driver.findElement(By.xpath(".//*[@id='favourite_table']/tbody/tr[1]/td[1]/a")).getText();
		
		
		boolean test = !text.equalsIgnoreCase(texthide);
		
		System.out.println(test);
		Status s = new Status();
		
		s.statusBooleanTrue(80, 81, login.driver,test);
				
		}


}
