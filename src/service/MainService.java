package service;

import java.util.ArrayList;

import model.Page;
import model.Post;
import model.PostType;
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
		u3.createPost(new Post("Man patīk programmēt!"), PostType.publicPost);
		u3.createPost(new Post("Man šodien viss ir apnicis!"), PostType.privatePost);
		u4.createPost(new Post("Man šodien jāiet pie ārsta!"), PostType.privatePost);
		
		
		for(Post temp: u3.getAllPrivatePosts()) {
			System.out.println(temp);
		}
		
		for(Post temp: u4.getAllPrivatePosts()) {
			System.out.println(temp);
		}
		
		//5. create page for private user --> it is not allowed in our system
		//u4.addPage();
		//6. create at least one page for each Business User
		Page p1  = new Page("Ziedi Ventspilī", "Informācija par Ventspils Ziedu veikalu!"); 
		u5.addPage(p1);
		Page p2  = new Page("Ziedi Liepājā", "Informācija par Liepājas Ziedu veikalu!"); 
		u5.addPage(p2);
		
		
		
		//7. create at least one post in each page
		u5.createPostInPage(p1, u5.createPost(new Post("Ventspils svētkos 20% atlaide rozēm"), PostType.publicPost));
		u5.createPostInPage(p2, u5.createPost(new Post("Liepājas svētkos 25% atlaide tulpēm"), PostType.publicPost));
		u5.createPostInPage(p1, u5.createPost(new Post("31.03.2023 narcises par brīvu!"), PostType.publicPost));
		
		System.out.println("--------------------------");
		for(Post temp: u5.getAllPages().get(0).getPostsInPage()) {
			System.out.println(temp);
		}
		
		//8. verify login func.
		//9. verify followPage func.
		//10. verify addFollower func.
		//11. verify removeFollower func.
		//12. verify increaseLikes func.

	}

}
