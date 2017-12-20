package db;
import obj.*;
import resources.*;
import java.sql.*;

/**
 * Singleton Class which manages the SQL Database connection and handles all related queries.
 * @author KFed
 *
 */
public class DBManager {

	/**
	 * Singleton instance of this class
	 */
	private static DBManager DBManager;
	
	/**
	 * Connection string
	 */
	private Connection connection = null;
	
	/**
	 * Prepared SQL Statement
	 */
	private Statement statement = null;
	
	/**
	 * SQL Result Set
	 */
	private ResultSet resultSet = null;

	private boolean closed;
	

	/**
	 * Retrives the Singleton Instance of this class
	 * @return
	 */
	public static DBManager getInstance(){
		if(DBManager == null){
			DBManager = new DBManager();
			DBManager.closed = true;
		}
		return DBManager;
	}

	/**
	 * Attempts to connect to the SQL Database
	 * @return
	 */
	public boolean connect(){
		try{
			// signal the mysql jdbc driver
			Class.forName("com.mysql.jdbc.Driver");
			// create connection string
			connection = DriverManager.getConnection("jdbc:mysql://localhost/" + DBConstants.host + "?" + 
					"user=" + DBConstants.user + "&password=" + DBConstants.pass);
			// create a statement object for passing queries
			statement = connection.createStatement();
			DBManager.closed = false;
		}
		catch(Exception e){
			e.printStackTrace();
			// Error on connection, Let user know their connection is faulty
			System.out.println("Error with connection. Check your database connection.");
		}

		return true;
	}
	
	/**
	 * Closes the connection to the database and destroys the class variables
	 * @return
	 */
	public boolean close() throws SQLException{
		this.connection.close();
		this.connection = null;
		this.resultSet.close();
		this.resultSet = null;
		this.statement.close();
		this.statement = null;
		DBManager.closed = true;
		return true;
	}
	
	/**
	 * Returns true if a connection needs to be made before passing SQL Statements
	 * @return
	 */
	public boolean isClosed(){
		return DBManager.closed;
	}
	
	
	public boolean createUser(User u){
	
		return u.setChanges(false);
	}
	
	public User getUser(String username, String password){
		return null;
	}
	
	public boolean deleteUser(){
		return true;
	}
	
	public boolean modifyUser(User u){
		return u.setChanges(false);
	}
	
	
	
	public boolean createRecipe(Recipe r){
		return r.setChanges(false);
	}
	
	public Recipe getRecipe(int rec_id){
		return null;
	}
	
	public boolean deleteRecipe(Recipe r){
		return true;
	}
	
	public boolean modifyRecipe(Recipe r){
		return r.setChanges(false);
	}
	
	
	
	public boolean createMealPlan(MealPlan mp){
		return mp.setChanges(false);
	}
	
	public MealPlan getMealPlan(int mp_id){
		return null;
	}
	
	public boolean deleteMealPlan(MealPlan mp){
		return true;
	}
	
	public boolean modifyMealPlan(MealPlan mp){
		return mp.setChanges(false);
	}
	
	
	
	public boolean createReview(RecipeReview rr){
		return rr.setChanges(false);
	}
	
	public boolean createReview(MealPlanReview mpr){
		return mpr.setChanges(false);
	}
	
	public boolean deleteReview(RecipeReview rr){
		return true;
	}
	
	public boolean deleteReview(MealPlanReview mpr){
		return true;
	}
	
	public boolean modifyReview(RecipeReview rr){
		return rr.setChanges(false);
	}
	
	public boolean modifyReview(MealPlanReview mpr){
		return mpr.setChanges(false);
	}
	
	
	
	public boolean createAction(Action a){
		return a.setChanges(false);
	}
	
	public Action getAction(int act_id){
		return null;
	}
	
	public boolean deleteAction(Action a){
		return true;
	}
	
	public boolean modifyAction(Action a){
		return a.setChanges(false);
	}
	
	
	
	public boolean createInstruction(Instruction i){
		return i.setChanges(false);
	}
	
	public Instruction getInstruction(int inst_id){
		return null;
	}
	
	public boolean deleteInstruction(Instruction i){
		return true;
	}
	
	public boolean modifyInstruction(Instruction i){
		return i.setChanges(false);
	}
	
	
	
	public boolean createIngredient(Ingredient i){
		return i.setChanges(false);
	}
	
	public Ingredient getIngredient(int ing_id){
		return null;
	}
	
	public boolean deleteIngredient(Ingredient i){
		return true;
	}
	
	public boolean modifyIngredient(Ingredient i){
		return i.setChanges(false);
	}
	
	
	
	public boolean createUnit(Unit u){
		return u.setChanges(false);
	}
	
	public Unit getUnit(int unit_id){
		return null;
	}
	
	public boolean deleteUnit(Unit u){
		return true;
	}
	
	public boolean modifyUnit(Unit u){
		return u.setChanges(false);
	}
	
}
