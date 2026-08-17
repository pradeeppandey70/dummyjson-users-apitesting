package services;

import base.ConfigReader;
import clients.RestClients;
import io.restassured.response.Response;

public class UserServices {
	 private final RestClients clients = new RestClients();
	 private static final String users = ConfigReader.getProperty("path.users");
	 
	 public Response getAllUser() {
		 return clients.getRequest(users, 200);
	 }
	 
	 
	 

}
