package crudOperation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class hbh {

	@Test
	public 
	{
		// TODO Auto-generated method stub
JSONObject o1=new JSONObject();
o1.put("name","cinu");
o1.put("Job", "TestEngineer"

RequestSpecification req=RestAssured.given();
req.body(o1);
req.contentType(ContentType.JSON);
Response res=req.post("https://reqres.in/api/users");

String contenttype=res.getContentType();
Assert.assertEquals("application/json; charset=utf-8,contenttype);"


	}

}
