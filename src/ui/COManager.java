package ui;
import obj.*;
import db.*;
import resources.*;

public class COManager {

	private User active;
	private static DBManager db = DBManager.getInstance();
	
	
	public COManager(){
		this.active = null;
		db.connect();
	}
	
	public boolean initialize(String user, String pass){
		
		//active = db.getUser(user, pass);
		if(active == null){
			return false;
		}
		else return true;
	}
	
	public void disconnect(){
		this.db = null;
		this.active = null;
	}
	
}
