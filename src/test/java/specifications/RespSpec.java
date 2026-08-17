package specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class RespSpec {
	public static ResponseSpecification resSpec(int statuscode) {
		return new ResponseSpecBuilder().
		expectContentType(ContentType.JSON).
		expectStatusCode(statuscode).build();
	}
}

