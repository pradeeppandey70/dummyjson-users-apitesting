package specifications;

import base.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ReqSpec {
	
	
	public static RequestSpecification getReqSpecification() {
		return new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("BASEURI")).
		setContentType(ContentType.JSON).
		setAccept(ContentType.JSON).build();
	}

}
