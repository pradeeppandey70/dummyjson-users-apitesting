package models.response;

import java.util.List;

public class GetAllUsers {
	public List<Users> users;
	public int total;
	public int skip;
	public int limit;
	
	
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}

}
