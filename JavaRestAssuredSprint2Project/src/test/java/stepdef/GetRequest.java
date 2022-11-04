package stepdef;

import org.json.simple.JSONObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.*;

public class GetRequest {
	
	
	@Given("User is able To Retrive the data in JSON Formate")
	public void user_is_able_to_retrive_the_data_in_json_formate() {
	    
	}

	@When("User is able to get the Data by using api is {string}")
	public void user_is_able_to_get_the_data_by_using_api_is(String string) {
	    
	}

	@Then("User should Validate The StatusCode as {int}")
	public void user_should_validate_the_status_code_as(Integer int1) {
	    

	}
}
