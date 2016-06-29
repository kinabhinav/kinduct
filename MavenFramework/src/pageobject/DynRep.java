package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynRep {
	public WaitForElement w= new WaitForElement();
	
	@Test
	public void DynRep(WebDriver driver) throws Exception
	
		{

        
        //Add Widget  .//*[@id='grid-container']/header[2]/a[5]
		w.isElementHiddenNow(".//*[@id='grid-container']/header[2]/a[5]", driver);
		
        driver.findElement(By.xpath(".//*[@id='grid-container']/header[2]/a[5]")).click();
        
        Thread.sleep(1000);
        
        //Chart    
		w.isElementHiddenNow(".//*[@id='modal-body']/div/div[1]/a", driver);
		
        driver.findElement(By.xpath(".//*[@id='modal-body']/div/div[1]/a")).click();
        
        Thread.sleep(1000);
        
        //Group
		w.isElementHiddenNow(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[3]/div[1]", driver);
		
        driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[3]/div[1]")).click();
        
        //Player
        
		w.isElementHiddenNow(".//*[@id='mCSB_4_container']/li[3]/a", driver);
		
        driver.findElement(By.xpath(".//*[@id='mCSB_4_container']/li[3]/a")).click();
        
        //
		w.isElementHiddenNow(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[3]/div[1]", driver);
		
        driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[3]/div[1]")).click();
        
        //Metrics
		w.isElementHiddenNow(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[4]/div[1]", driver);
		
        driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[4]/div[1]")).click();
        
        //Body Composition
        
		w.isElementHiddenNow(".//*[@id='mCSB_2_container']/li[2]/a", driver);
		
        driver.findElement(By.xpath(".//*[@id='mCSB_2_container']/li[2]/a")).click();
        
        //
		w.isElementHiddenNow(".//*[@id='mCSB_2_container']/li[2]/ul/li[1]/a", driver);
		
        driver.findElement(By.xpath(".//*[@id='mCSB_2_container']/li[2]/ul/li[1]/a")).click();
        
        //Metrics
		w.isElementHiddenNow(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[4]/div[1]", driver);
		
        driver.findElement(By.xpath(".//*[@id='modal-body']/form/div[2]/div/div[1]/div[4]/div[1]")).click();
        
        //create widget 
		w.isElementHiddenNow(".//*[@id='modal-save']", driver);
		
        driver.findElement(By.xpath(".//*[@id='modal-save']")).click();
	
		}

}
