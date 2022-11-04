

		package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PostRequestTest {

	@Test
	public void postRequestTest()
	{
		JSONObject object=new JSONObject();
		object.put("name", "Alan Walker");
		object.put("Job", "DJ");
		 
		
	given()
	.contentType(ContentType.JSON)
	.body(object)
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.assertThat().statusCode(201)
	.log()
	.all();
		 
		
		
		

	}

}
