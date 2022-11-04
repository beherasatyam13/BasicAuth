package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class Getbyidcucu {
	Response res;
	ValidatableResponse validate;

	@When("User is able to retrive the id  using an api is {string}")
	public void user_is_able_to_retrive_the_id_using_an_api_is(String url) {
	    res = RestAssured.get(url);
	}

	@Then("User should Validate The StatusCode is {int}")
	public void user_should_validate_the_status_code_is(Integer int2) {
     validate = res.then();
     validate.assertThat().statusCode(int2).log().all();
     
}
}
                           