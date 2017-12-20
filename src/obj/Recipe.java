package obj;

import java.util.ArrayList;
import java.util.List;

/**
 * Recipe class of Cookoff. Contains a list of instructions along with other small data points.
 * @author KFed
 *
 */
public class Recipe {

	/**
	 * The unique id of this Recipe
	 */
	private int rec_id;
	
	/**
	 * The user_id of the creator of this Recipe
	 */
	private int user_id;
	
	/**
	 * The name of this Recipe
	 */
	private String name;
	
	/**
	 * The short description of this recipe
	 */
	private String description;
	
	/**
	 * The type of this Recipe
	 */
	private String type;
	
	/**
	 * The list of Instrcutions contained within this Recipe
	 */
	private List<Instruction> instructions;
	
	/**
	 * The boolean which signals pending changes to be sent to DB.
	 */
	private boolean changes;
	
	/**
	 * Constructor
	 * @param rec_id
	 * @param user_id
	 * @param name
	 * @param description
	 * @param type
	 */
	public Recipe(int rec_id, int user_id, String name, String description, String type){
		this.rec_id = rec_id;
		this.user_id = user_id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.instructions = new ArrayList<Instruction>();
		this.changes = false;
	}
	
	/**
	 * Returns the unique ID of this Recipe
	 * @return
	 */
	public int getID(){
		return rec_id;
	}
	
	/**
	 * Sets the ID of this Recipe
	 * @return
	 */
	public boolean setID(int rec_id){
		this.rec_id = rec_id;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the ID of the User which created this Recipe
	 * @return
	 */
	public int getUserID(){
		return this.user_id;
	}
	
	/**
	 * Sets the ID of the User which created this Recipe
	 * @return
	 */
	public boolean setUserID(int user_id){
		this.user_id = user_id;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the Name of this Recipe
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Sets the name of this recipe
	 * @param name
	 * @return
	 */
	public boolean setName(String name){
		this.name = name;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the Description of this Recipe
	 * @return
	 */
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * Sets the description of this Recipe
	 * @param description
	 * @return
	 */
	public boolean setDescription(String description){
		this.description = description;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the type String of this recipe
	 * @return
	 */
	public String getType(){
		return this.type;
	}
	
	/**
	 * Sets the type String for this recipe
	 * @param type
	 * @return
	 */
	public boolean setType(String type){
		this.type = type;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the pending changes boolean for this Recipe
	 * @return
	 */
	public boolean getChanges(){
		return this.changes;
	}
	
	/**
	 * Sets the pending changes boolean for this Recipe
	 * @param b
	 * @return
	 */
	public boolean setChanges(boolean b){
		this.changes = b;
		return true;
	}
	
	public String getCookTime(){
		return "";
	}
	
	/**
	 * Returns the instructions list contained within this Recipe
	 * @return
	 */
	public List<Instruction> getInstructions(){
		return this.instructions;
	}
	
	public boolean addInstruction(Instruction inst, int in){
		for(int i = 0; i < this.instructions.size(); i++){
			if(this.instructions.get(i).getID() == inst.getID()){
				return false;
			}
		}
		if(this.instructions.size() < in)
			return false;
		this.instructions.add(in, inst);;
		return this.setChanges(true);
	}
	
	public boolean modifyInstruction(Instruction inst, int in){
		return this.setChanges(true);
	}
	
	public boolean removeInstruction(Instruction inst){
		return this.setChanges(true);
	}
	
}

