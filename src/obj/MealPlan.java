package obj;

import java.util.ArrayList;
import java.util.List;

/**
 * MealPlan class. This class is essentially a container for multiple recipes. Also used to order recipes for the cooking application.
 * @author KFed
 *
 */
public class MealPlan {

	/**
	 * The unique ID of this mealplan
	 */
	private int mp_id;
	
	/**
	 * The user_id of the user which created this MealPlan
	 */
	private int user_id;
	
	/**
	 * The name of this MealPlan
	 */
	private String name;
	
	/**
	 * The short description of this MealPlan
	 */
	private String description;
	
	/**
	 * The type of this MealPlan.
	 */
	private String type;
	
	/**
	 * The list of recipes contained within this mealplan.
	 */
	private List<Recipe> recipes;
	
	/**
	 * Boolean representing pending changes to be pushed to DB for this MealPlan
	 */
	private boolean changes;
	
	/**
	 * Constructor.
	 * @param mp_id
	 * @param user_id
	 * @param name
	 * @param description
	 * @param type
	 */
	public MealPlan(int mp_id, int user_id, String name, String description, String type){
		this.mp_id = mp_id;
		this.user_id = user_id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.changes = false;
		this.recipes = new ArrayList<Recipe>();
	}
	
	/**
	 * Returns the unique ID of this MealPlan
	 * @return
	 */
	public int getID(){
		return this.mp_id;
	}
	
	/**
	 * Sets the ID of this MealPlan
	 * @param mp_id
	 * @return
	 */
	public boolean setID(int mp_id){
		this.mp_id = mp_id;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the ID of the creating user of this MealPlan
	 * @return
	 */
	public int getUserID(){
		return this.user_id;
	}
	
	/**
	 * Sets the user_id of this mealplan
	 * @param user_id
	 * @return
	 */
	public boolean setUserID(int user_id){
		this.user_id = user_id;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the name of this MealPlan
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Sets the Name of this mealplan
	 * @param name
	 * @return
	 */
	public boolean setName(String name){
		this.name = name;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the short description of this mealplan
	 * @return
	 */
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * Sets the description of this MealPlan
	 * @param description
	 * @return
	 */
	public boolean setDescription(String description){
		this.description = description;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the type string of this MealPlan
	 * @return
	 */
	public String getType(){
		return this.type;
	}
	
	/**
	 * Sets the type String of this MealPlan
	 * @param type
	 * @return
	 */
	public boolean setType(String type){
		this.type = type;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the changes boolean contained within this MealPlan. Signifies whether pending changes need to be pushed to the DB.
	 * @return
	 */
	public boolean getChanges(){
		return this.changes;
	}
	
	/**
	 * Set the pending changes boolean of this MealPlan
	 * @param b
	 * @return
	 */
	public boolean setChanges(boolean b){
		this.changes = b;
		return true;
	}
	
	public String getMaxCookTime(){
		return "";
	}
	
	public String getEstimatedCookTime(){
		return "";
	}
	
	/**
	 * Returns the number of recipes contained within this MealPlan.
	 * @return
	 */
	public int getSize(){
		return this.recipes.size();
	}
	
	/**
	 * Attempts to add the input Recipe into the recipes list within this MealPlan.
	 * If the recipe list already contains the recipe, then this method returns false;
	 * If there is enough room for this recipe and it is not found within the list (already existing), the method adds the Recipe to the list.
	 * @param r
	 * @return
	 */
	public boolean addRecipe(Recipe r){
		if(this.getSize() >= 5){
			return false;
		}
		for(int i = 0; i < this.getSize(); i++){
			if(this.recipes.get(i).getID() == r.getID()){
				return false;
			}
		}
		this.recipes.add(r);
		return this.setChanges(true);
	}
	
	/**
	 * Attempts to remove the input Recipe from this MealPlan.
	 * If the Recipe is not found within the recipes list, returns false.
	 * Else, the recipe is removed.
	 * @param r
	 * @return
	 */
	public boolean removeRecipe(Recipe r){
		if(this.getSize() <= 0){
			return false;
		}
		for(int i = 0; i < this.getSize(); i++){
			if(this.recipes.get(i).getID() == r.getID()){
				this.recipes.remove(i);
				return this.setChanges(true);
			}
		}
		return false;
	}
	
	/**
	 * Simply returns the list of Recipes contained within this MealPlan
	 * @return
	 */
	public List<Recipe> getRecipes(){
		return this.recipes;
	}
	
	public List<Instruction> cookify(){
		return null;
	}
	
}
