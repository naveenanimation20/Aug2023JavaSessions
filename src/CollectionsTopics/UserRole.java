package CollectionsTopics;

import java.util.HashMap;

public class UserRole {
	
	public static String getUserCredentials(String role) {
		HashMap<String, String> userMap = new HashMap<String,String>();
		userMap.put("admin", "admin;admin@123");
		userMap.put("seller", "seller;seller@123");
		userMap.put("vendor", "vendor;vendor@123");
		userMap.put("manager", "manager;manager@123");

		return userMap.get(role);
		
	}
	
	public static void doLogin(String un, String pwd) {
		System.out.println("login with:" + un + ":"+pwd);
	}
	

	public static void main(String[] args) {
		
		String credsData = getUserCredentials("manager");
		System.out.println(credsData);
		String userName = credsData.split(";")[0];
		String password = credsData.split(";")[1];
		
		doLogin(userName, password);

	}

}
