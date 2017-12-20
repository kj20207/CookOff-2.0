package testing;

import obj.*;

public class Test {

	public static void main(String args[]){
		/*Recipe rec = new Recipe();
		User u = new User("llkdfj", "kj", "kj", "kj@lol.com", "kel", "john", "USA", 15, "WOW", true);
		Review r = new RecipeReview(rec, u);
		
		r.setRating(4);
		System.out.println(r.getRating());
		System.out.println(r.getUser().getEmail());*/
		
		Action a = new Action(1, "Test", "Description");
		System.out.println(a.getDescription() + a.getName());
		a.setDescription("something");
		a.setID(654);
		System.out.println(a.getChanges() + a.getDescription() + a.getID());
		
		/*DBManager dbm = DBManager.getInstance();
		dbm.connect();
		
		User u = new User("llkdfj", "kj", "kj", "kj@lol.com", "kel", "john", "USA", 15, "WOW", true);
		//dbm.createUser(u);
		//dbm.deleteUser(u);
		//u = dbm.getUser("kj20207", "pass");
		if(u == null){
			System.out.println("Nullll");
		}
		else{
			
		}
		
		System.out.println(u.getUsername() + u.getAge() + u.getName());
		*/
		
	}
	
	
}
