package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Branchesteps {
	WebDriver driver;
	@Given("launch Browser")
	public void launch_browser() throws Throwable {
		driver=FunctionLibrary.startBrowser();
	}

	@When("launch url {string} in a browser")
	public void launch_url_in_a_browser(String url) {
		FunctionLibrary.openUrl(url);
	}

	@When("wait for username with {string} and {string}")
	public void wait_for_username_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("click Login button with {string} and {string}")
	public void click_login_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("click branch link with {string} and {string}")
	public void click_branch_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("wait for newbranch with {string} and {string}")
	public void wait_for_newbranch_with_and(String string, String string2) {
		FunctionLibrary.waitForElement(string, string2, "10");
	}

	@When("click on NewBranch link with {string} and {string}")
	public void click_on_new_branch_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("wait for BranchName with {string} and {string}")
	public void wait_for_branch_name_with_and(String LocatorType, String LocatorVlaue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorVlaue, "10");
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue)
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

//	@When("user Select CountryList with {string} and {string} and {string}")
//	public void user_select_country_list_with_and_and(String LocatorType, String LocatorValue, String TestData) {
//		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
//	}
//
//	@When("user Select StateList with {string} and {string} and {string}")
//	public void user_select_state_list_with_and_and(String LocatorType, String LocatorValue, String TestData) {
//		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
//	}
//
//	@When("user Select CityList with {string} and {string} and {string}")
//	public void user_select_city_list_with_and_and(String LocatorType, String LocatorValue, String TestData) {
//		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
//	}
	@When("user Select {string} with {string} and {string}")
	public void user_select_with_and(String TestData, String LocatorType, String LocatorValue) {
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	
	@When("click Submit button with {string} and {string}")
	public void click_submit_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	
	@When("accept alert Ok")
	public void accept_alert_ok() throws Throwable {
	   FunctionLibrary.alertOk();
	}
	
	@When("click DeleteIcon with {string} and {string}")
	public void click_delete_icon_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("click delete Ok")
	public void click_delete_ok()  throws Throwable {
		   FunctionLibrary.alertOk();
	}
	@When("accept delete alert Ok")
	public void accept_delete_alert_ok() throws Throwable {
		   FunctionLibrary.alertOk();
	}
	
	@When("user Select CountryList with {string} and {string} and {string}")
	public void user_select_country_list_with_and_and(String LocatorType, String LocatorValue, String TestData) {
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	@When("user Select StateList with {string} and {string} and {string}")
	public void user_select_state_list_with_and_and(String LocatorType, String LocatorValue, String TestData) {
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	@When("user Select CityList with {string} and {string} and {string}")
	public void user_select_city_list_with_and_and(String LocatorType, String LocatorValue, String TestData) {
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	@When("click on search button with {string} and {string}")
	public void click_on_search_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("close browser")
	public void close_browser() throws Throwable {
		FunctionLibrary.closeBrowser();
	}
	
	@When("click Roles link with {string} and {string}")
	public void click_roles_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for NewRole with {string} and {string}")
	public void wait_for_new_role_with_and(String LocatorType, String LocatorVlaue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorVlaue, "10");
	}
	@When("click on NewRole link with {string} and {string}")
	public void click_on_new_role_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for RoleName with {string} and {string}")
	public void wait_for_role_name_with_and(String LocatorType, String LocatorVlaue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorVlaue, "10");
	}

}
