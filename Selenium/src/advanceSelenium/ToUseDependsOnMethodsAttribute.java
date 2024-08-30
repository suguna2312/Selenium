package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseDependsOnMethodsAttribute {
	@Test
	public void createAccount()
	{
		Reporter.log("Account created successfully",true);
		
	}
	@Test(dependsOnMethods = "createAccount")
	public void editAccount()
	{
		Reporter.log("Account edited successfully",true);
	}
	//Notu@904
	@Test(dependsOnMethods = "editAccount")
	public void deleteAccount()
	{
		Reporter.log("Account deleted successfully",true);
	}

}
