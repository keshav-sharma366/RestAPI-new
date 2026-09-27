package httprequests;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

/*
given()
  content type, set cookies, add auth, add param, set headers info etc....

when()
  get, post, put, delete

then()
  validate status code, extract response, extract headers cookies & response body....

*/

public class GetUser {
	@Test
	public void getUser()
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users/2")
		
		.then();
	}

}
