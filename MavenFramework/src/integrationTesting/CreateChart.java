package integrationTesting;

import org.testng.annotations.Test;

import pageobject.DynRep;
import pageobject.Login;
import pageobject.Organizations;
import pageobject.PatriotsHome;
import pageobject.ProfilePage;
import pageobject.ProfileResourcePage;

public class CreateChart {
	@Test
	public void notes() throws Exception
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			DynRep pp = new DynRep();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.dynamicR(login.driver);
			
			pp.DynRep(login.driver);
		}

}
