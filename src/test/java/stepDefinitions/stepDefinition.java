package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Browser is validated");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check is browser is started$")
    public void check_is_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }
    
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("User is on landing page");
    }

    /*@When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("User logged in successfully");
    }*/
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        //code
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));	        
    }
    
    @When("^User login to application with username (.+) and password (.+)$")
    public void user_login_to_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page validated");
    }

    /*@And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards validated");
    }*/
    
    @And("Cards displayed are {string}")
    public void cards_displayed_are(String string) { 
        System.out.println(string);
    }
    
}
