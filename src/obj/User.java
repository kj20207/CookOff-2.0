package obj;

import java.util.ArrayList;

/**
 * The user class of the application. Dictates account information and contians information keeping users from specific pages.
 * @author KFed
 *
 */
public class User  {

	/**
	 * The unique user_id of this user
	 */
	private int user_id;

	/**
	 * The username of this User
	 */
	private String username;

	/**
	 * The password of this User
	 */
	private String password;

	/**
	 * The email address of this user
	 */
	private String email;
	
	/**
	 * The age of this user
	 */
	private int age;

	/**
	 * The location of this user
	 */
	private String location;

	/**
	 * Boolean signifying whether or not this user is an admin type user
	 */
	private boolean admin;
	
	/**
	 * THe pending changes boolean for this User
	 */
	private boolean changes;
	
	/**
	 * Constructor
	 * @param user_id
	 * @param username
	 * @param password
	 * @param email
	 * @param age
	 * @param location
	 * @param admin
	 */
	public User(int user_id, String username, String password, String email, int age, String location, boolean admin){
		
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.location = location;
		this.admin = admin;
		this.changes = false;
	}

	/**
	 * Returns the unique ID of this User
	 * @return
	 */
	public int getID(){
		return this.user_id;
	}
	
	/**
	 * Sets the unique user_id of this User
	 * @param user_id
	 * @return
	 */
	public boolean setID(int user_id){
		this.user_id = user_id;
		return this.setChanges(true);
	}
	/**
	 * Returns the username of this user
	 * @return
	 */
	public String getUserName(){
		return this.username;
	}
	
	/**
	 * Sets the username of this user
	 * @param username
	 * @return
	 */
	public boolean setUserName(String username){
		this.username = username;
		return this.setChanges(true);
	}
	
	/**
	 * Gets the password of this user
	 * @return
	 */
	public String getPassWord(){
		return this.password;
	}
	
	/**
	 * Sets the password of this user
	 * @param password
	 * @return
	 */
	public boolean setPassWord(String password){
		this.password = password;
		return this.setChanges(true);
	}
	
	/**
	 * Gets the email of this User
	 * @return
	 */
	public String getEmail(){
		return this.email;
	}
	
	/**
	 * Sets the email of this User
	 * @param email
	 * @return
	 */
	public boolean setEmail(String email){
		this.email = email;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the age of this User
	 * @return
	 */
	public int getAge(){
		return this.age;
	}
	
	/**
	 * Sets the age of this User
	 * @param age
	 * @return
	 */
	public boolean setAge(int age){
		this.age = age;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the location of this User
	 * @return
	 */
	public String getLocation(){
		return this.location;
	}
	
	/**
	 * Sets the location of this User
	 * @param location
	 * @return
	 */
	public boolean setLocation(String location){
		this.location = location;
		return this.setChanges(true);
		
	}
	
	/**
	 * Returns the admin boolean for this User
	 * @return
	 */
	public boolean getAdmin(){
		return this.admin;
	}
	
	/**
	 * Sets the admin boolean for this User
	 * @param admin
	 * @return
	 */
	public boolean setAdmin(boolean admin){
		this.admin = admin;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the pending changes to DB boolean for this User.
	 * @return
	 */
	public boolean getChanges(){
		return this.changes;
	}
	
	/**
	 * Sets the pending changes boolean for this User.
	 * @param b
	 * @return
	 */
	public boolean setChanges(boolean b){
		this.changes = b;
		return true;
	}
}
