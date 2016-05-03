package practitionerClinic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BuildProtocol {
	
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
		
		//Build Protocol
		
		login.wait(".//*[@id='content']/div[1]/a");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/div[1]/a")).click();
		
		//Workout name
		
		login.wait(".//*[@id='workout_name']");
		
		login.driver.findElement(By.xpath(".//*[@id='workout_name']")).sendKeys(" Second Protocol Test");
		
		//
		
		//Body Part focus
		
		login.wait(".//*[@id='workout_builder_header']/div/div[1]/div[2]/div/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='workout_builder_header']/div/div[1]/div[2]/div/div/div/button")).click();
		
		//Ankle
		
		login.wait(".//*[@id='workout_builder_header']/div/div[1]/div[2]/div/div/div/ul/li[3]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='workout_builder_header']/div/div[1]/div[2]/div/div/div/ul/li[3]/a/label/input")).click();
		
		//Body Part focus
		
		login.wait(".//*[@id='workout_builder_header']/div/div[1]/div[2]/div/div/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='workout_builder_header']/div/div[1]/div[2]/div/div/div/button")).click();
		
		//Library
		
		login.wait(".//*[@id='exercise_find_box']/div[2]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise_find_box']/div[2]/div/button")).click();
		
		//Any
		
		login.wait(".//*[@id='exercise_find_box']/div[2]/div/ul/li[1]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise_find_box']/div[2]/div/ul/li[1]/a/label/input")).click();
		
		//Library
		
		login.wait(".//*[@id='exercise_find_box']/div[2]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise_find_box']/div[2]/div/button")).click();
		
		//Body part
		
		login.wait(".//*[@id='exercise-filters']/div[1]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[1]/div/button")).click();
		
		//Any
		
		login.wait(".//*[@id='exercise-filters']/div[1]/div/ul/li[1]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[1]/div/ul/li[1]/a/label/input")).click();
		
		//Body part
		
		login.wait(".//*[@id='exercise-filters']/div[1]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[1]/div/button")).click();
		
		//Equipment
		
		login.wait(".//*[@id='exercise-filters']/div[2]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[2]/div/button")).click();
		
		//Any
		
		login.wait(".//*[@id='exercise-filters']/div[2]/div/ul/li[1]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[2]/div/ul/li[1]/a/label/input")).click();
		
		//Equipment
		
		login.wait(".//*[@id='exercise-filters']/div[2]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[2]/div/button")).click();
		
		//Type
		
		login.wait(".//*[@id='exercise-filters']/div[3]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[3]/div/button")).click();
		
		//Any
		
		login.wait(".//*[@id='exercise-filters']/div[3]/div/ul/li[1]/a/label/input");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[3]/div/ul/li[1]/a/label/input")).click();
		
		//Type
		login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.wait(".//*[@id='exercise-filters']/div[3]/div/button");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-filters']/div[3]/div/button")).click();
		System.out.println("sdsadsa");
		
		//Hide Filter
		
		login.wait(".//*[@id='exercise-menu']/a[2]");
		
		login.driver.findElement(By.xpath(".//*[@id='exercise-menu']/a[2]")).click();
		
		System.out.println("sdsadsa");

		
		login.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login.wait(".//*[@id='add_exercise_div_perf_three_point_lunge']");
		login.driver.findElement(By.xpath(".//*[@id='add_exercise_div_perf_three_point_lunge']")).click();
		

		
		//Submit
		
		login.wait(".//*[@id='submit_button']");
		
		login.driver.findElement(By.xpath(".//*[@id='submit_button']")).click();
		
		//back  .//*[@id='content']/article/header/div/a[1]
		
		login.wait(".//*[@id='content']/article/header/div/a[1]");
		
		login.driver.findElement(By.xpath(".//*[@id='content']/article/header/div/a[1]")).click();
		
		login.driver.quit();
	}	

}
