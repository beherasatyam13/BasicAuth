package stepdef;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostBycucu {
	
	JSONObject obj=new JSONObject();

	obj.put("date_and_time", "2022-10-31T05:04:30.066Z");
	obj.put("email", "beherasatyam13@gmail.com");
	obj.put("id", 2);
	obj.put("name", "Satyam");
	obj.put("phone","6370809056");
	obj.put("price", 2000);
	obj.put("qty", 1);
	
	@Given("user is able to provide te data in json formate")
	public void user_is_able_to_provide_te_data_in_json_formate() {
	    
	}

	@When("user gives the data by using an api is {string}")
	public void user_gives_the_data_by_using_an_api_is(String string) {
	    
	}

	@Then("user validates the status code is {int}")
	public void user_validates_the_status_code_is(Integer int1) {
	    
	}


}
