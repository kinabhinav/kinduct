package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitForElement {
	
	public boolean isElementHiddenNow(String xpath, WebDriver driver) {
		turnOffImplicitWaits(driver);
	    boolean result = false;
	    try {
	       result = ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)).apply(driver);
	    }
	    finally {
	       turnOnImplicitWaits(driver);
	    }
	    return result;
	    
	}

	private void turnOffImplicitWaits(WebDriver driver) {
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

	private void turnOnImplicitWaits(WebDriver driver) {
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

}
