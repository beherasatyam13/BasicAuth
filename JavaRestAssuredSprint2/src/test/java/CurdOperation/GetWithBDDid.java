package CurdOperation;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWithBDDid{

	@Test
	public void GetWithBDDid()
	{
			
		baseURI ="http://localhost:8080";
		when()
		.get("/sales/2")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}
	
}
