package clients;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import specifications.ReqSpec;
import specifications.RespSpec;

public class RestClients {

	public Response getRequest(String path, int statuscode) {
		return RestAssured.
		given().spec(ReqSpec.getReqSpecification()).
		when().get(path).
		then().spec(RespSpec.resSpec(statuscode)).
		extract().response();

	}

	public Response postRequest(Object body, String path, int statuscode ) {
		return RestAssured.
				given().spec(ReqSpec.getReqSpecification()).body(body).
				when().post(path).
				then().spec(RespSpec.resSpec(statuscode)).
				extract().response();
	}

	public Response putRequest(Object body, String path, int statuscode) {
		return RestAssured.
				given().spec(ReqSpec.getReqSpecification()).body(body).
				when().put(path).
				then().spec(RespSpec.resSpec(statuscode)).
				extract().response();

	}

	public Response patchRequest(Object body, String path, int statuscode) {
		return RestAssured.
				given().spec(ReqSpec.getReqSpecification()).body(body).
				when().patch(path).
				then().spec(RespSpec.resSpec(statuscode)).
				extract().response();

	}

	public Response deleteRequest(String path, int statuscode) {
		return RestAssured.
				given().spec(ReqSpec.getReqSpecification()).
				when().delete(path).
				then().spec(RespSpec.resSpec(statuscode)).
				extract().response();

	}

}
