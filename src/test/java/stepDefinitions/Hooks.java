package stepDefinitions;

import Cucumber.AutomationFramework.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	@Before("@MobileTest")
	public void beforevalidation() {
		System.out.println("Before Mobile Hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("After Mobile Hook");
	}
	
	@After("@SeleniumTest")
	public void AfterSeleniumTest() {
		driver.close();
	}
}
