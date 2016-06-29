package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ProfileAssessmentPage {
	
	@Test
	public void createnewscreen(WebDriver driver) throws Exception
	
	{
		WaitForElement w = new WaitForElement();
		
		//create new screen
		
		w.isElementHiddenNow(".//*[@id='assessments-table_wrapper']/div[1]/a", driver);
		
		driver.findElement(By.xpath(".//*[@id='assessments-table_wrapper']/div[1]/a")).click();
		
		Thread.sleep(3000);
		
		//FMS
		
		w.isElementHiddenNow(".//*[@id='modal-body']/div/div/div[1]/a/img", driver);
		
		driver.findElement(By.xpath(".//*[@id='modal-body']/div/div/div[1]/a/img")).click();
		
		//Deep Squat
		
		w.isElementHiddenNow(".//*[@id='deep-squat']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='deep-squat']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[2]")).click();
		
		//Hurdle Step
		
		w.isElementHiddenNow(".//*[@id='hurdle-step']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='hurdle-step']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[2]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='hurdle-step']/div/div[1]/div/div[2]/div[1]/div[3]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='hurdle-step']/div/div[1]/div/div[2]/div[1]/div[3]/div/div/label[2]")).click();
		
		//Inline Lunge
		
		w.isElementHiddenNow(".//*[@id='in-line-lunge']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='in-line-lunge']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='in-line-lunge']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='in-line-lunge']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]")).click();
		
		
		//Shoulder Mobility
		
		w.isElementHiddenNow(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[3]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[3]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[4]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[4]/div/div/label[2]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[5]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='shoulder-mobility']/div/div[1]/div/div[2]/div[1]/div[5]/div/div/label[2]")).click();
		
		
		//Active Straight Leg Raise
		
		w.isElementHiddenNow(".//*[@id='active-straight-leg-raise']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='active-straight-leg-raise']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='active-straight-leg-raise']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='active-straight-leg-raise']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]")).click();
		
		//Trunk Stability Push-Up
		
		w.isElementHiddenNow(".//*[@id='trunk-stability-push-up']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='trunk-stability-push-up']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='trunk-stability-push-up']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='trunk-stability-push-up']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[2]")).click();
		
		//Rotary Stability
		
		w.isElementHiddenNow(".//*[@id='rotary-stability']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='rotary-stability']/div/div[1]/div/div[2]/div[1]/div[1]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='rotary-stability']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]", driver);
		
		driver.findElement(By.xpath(".//*[@id='rotary-stability']/div/div[1]/div/div[2]/div[1]/div[2]/div/div/label[3]")).click();
		
		//
		w.isElementHiddenNow(".//*[@id='rotary-stability']/div/div[1]/div/div[2]/div[1]/div[3]/div/div/label[2]", driver);
		
		driver.findElement(By.xpath(".//*[@id='rotary-stability']/div/div[1]/div/div[2]/div[1]/div[3]/div/div/label[2]")).click();
		
		
		
		//Save
		
		w.isElementHiddenNow(".//*[@id='save']", driver);
		
		//driver.findElement(By.xpath(".//*[@id='save']")).click();
	}

}
