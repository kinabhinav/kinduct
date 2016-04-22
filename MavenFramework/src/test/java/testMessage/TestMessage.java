package testMessage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import practitionerClinic.HideMessage;
import practitionerClinic.PracLogin;
import practitionerClinic.ShowHiddenMessage;


public class TestMessage {

	
@Test (priority=1)
	
	public void hidemessage() throws Exception
	{
	
		
		HideMessage test = new HideMessage();
		
		test.hidemessage();
		
			
	}

@Test (priority=2)

public void showhiddenmessage() throws Exception
{

	
	ShowHiddenMessage test = new ShowHiddenMessage();
	
	test.showhiddenmessage();
	
	
}

}
