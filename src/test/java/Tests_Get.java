import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_Get {

	@Test
	public void test_1()
	{
		given()
		  //.header("Content-Type", "application/json")
		  //.param(parameterName, parameterValues)
		   .get("https://reqres.in/api/users?page=2")
		.then()
		   .statusCode(200)
		   .body("data.id[1]", equalTo(8))
		  // .log().all();
		   .body("data.first_name",hasItems("Michael", "Lindsay"));
		
		
		
	}
	
	
	
}
