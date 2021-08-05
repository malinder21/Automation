package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.AutomationFramework.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class mystepDefinition {	
	public WebDriver driver;
	HomePage h;

	@Given("^User is on GreenKart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {   
		driver= Base.getDriver();        
    }

    @When("^User searched for \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	// how to get xpath = //tagname[@attribute='value']
    	h = new HomePage(driver);
    	h.getSearch().sendKeys(strArg1);        
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
        driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1);
    }
    
    @Then("^Verify selected \"([^\"]*)\" items are displayed in Check out page$")
    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
    	driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1);
    }

    @And("^Added items to the cart$")
    public void added_items_to_the_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
     driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
     driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }
}
