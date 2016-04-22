package testMessage;

import org.testng.annotations.Test;
import practitionerClinic.HideMessage;
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
