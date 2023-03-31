package service;

import java.util.ArrayList;

import model.users.BussinessUser;
import model.users.GuestUser;
import model.users.PrivateUser;
import model.users.User;

public class MainService {

	public static ArrayList<User> allRegisterdUsers = new ArrayList<>();
	
	
	public static void main(String[] args) {
		// TODO 
		//1. create 2 Guest User objects
		GuestUser u1 = new GuestUser();
		GuestUser u2 = new GuestUser();
		
		System.out.println(u1);
		System.out.println(u2);
		
		//TODO create register function for users 
		//TODO create UserTYpe as enum - privateUser, businessUser
		//public boolean register(String name, String surname, String username, String password, UserType userType)
		
		//2. create 2 Private user objects
		PrivateUser u3 = new PrivateUser("Karina", "Skirmante", "karina.skirmante", "123");
		PrivateUser u4 = new PrivateUser("Janis", "Berzins", "janis.berzins", "321");
		allRegisterdUsers.add(u3);
		allRegisterdUsers.add(u4);
		
		//3. create 2 Business User objects
		
		BussinessUser u5 = new BussinessUser("SIA", "Ziedi", "sia.ziedi", "987");
		BussinessUser u6 = new BussinessUser("SIA", "Dators", "sia.dators", "789");
		allRegisterdUsers.add(u5);
		allRegisterdUsers.add(u6);
		
		//4. create 1 private and 1 public posts for each Private User
		//5. create page for private user --> it is not allowed in our system
		//6. create at least one page for each Business User
		//7. create at least one post in each page
		
		//8. verify login func.
		//9. verify followPage func.
		//10. verify addFollower func.
		//11. verify removeFollower func.
		//12. verify increaseLikes func.

	}

}
