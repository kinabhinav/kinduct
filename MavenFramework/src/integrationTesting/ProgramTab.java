package integrationTesting;

import org.testng.annotations.Test;

import pageobject.Login;
import pageobject.Organizations;
import pageobject.PatriotsHome;
import pageobject.ProfilePage;
import pageobject.ProfileProgramPage;

public class ProgramTab {
	
	@Test
	public void program()
	
		{
			
			Login login = new Login();
			login.login();
			Organizations org = new Organizations();
			
			PatriotsHome pat = new PatriotsHome();
			ProfilePage p = new ProfilePage();
			
			ProfileProgramPage pp = new ProfileProgramPage();
			
			
			org.Patriots(login.driver);
			pat.Home(login.driver);
			p.Program(login.driver);
			
			pp.clear_filter(login.driver);
			pp.log(login.driver);
			pp.view(login.driver);
			pp.edit(login.driver);
		}

}
