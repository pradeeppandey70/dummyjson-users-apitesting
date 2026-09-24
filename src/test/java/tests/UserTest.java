package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import models.response.GetAllUsers;
import services.UserServices;

public class UserTest {
	UserServices users = new UserServices();
	
	@Test
	public void getAllUsers() {
		Response response = users.getAllUser();
		
		GetAllUsers Alluser  = response.as(GetAllUsers.class);
		Assert.assertEquals(Alluser.getTotal(),208);
		Assert.assertEquals(Alluser.getUsers().get(0).getFirstName(),"Emily");
		
	}

}
