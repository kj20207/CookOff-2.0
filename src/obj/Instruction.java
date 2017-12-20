package obj;

import java.util.ArrayList;
import java.util.List;

/**
 * The Instruction class required within the application. Each individual instruction is the stepping stone of the Recipe class.
 * Multiple Instructions exist within each Recipe.
 * @author KFed
 *
 */
public class Instruction {

	/**
	 * The unique id assigned to this Instruction
	 */
	private int inst_id;
	
	/**
	 * The recipe id in which this instruction resides
	 */
	private int rec_id;
	
	/**
	 * The number of the instruction (the normal order in which instructions are completed within the individual instruction)
	 */
	private int number;
	
	/**
	 * A short description of what needs to happen during this Instruction.
	 */
	private String description;
	
	/**
	 * The unique Action ID associated with this Instruction
	 */
	private int act_id;
	
	/**
	 * A string representation of the estimated completion time of this instruction.
	 */
	private String time;
	
	/**
	 * Boolean value which lets the user know if they are required throughout the entirety of this Instruction.
	 */
	private boolean user_reqd;
	
	/**
	 * The list of Ingredients contained within this Instruction
	 */
	private List<Ingredient> ingredients;
	
	/**
	 * The coinciding list of units for each Ingredient within this instruction. Dependent on Ingredients.
	 */
	private List<Unit> units;
	
	/**
	 * The amounts of each Unit of Ingredients within this Instruction. Dependent on Ingredients and Units.
	 */
	private List<Integer> amounts;
	
	/**
	 * The number of (Ingredients, Units, Amounts (number)) combinations added to this Instruction.
	 */
	private int instIngUnits_added;
	
	/**
	 * Boolean which signifies if this unique Instruction has pending changes to be pushed to the DB
	 */
	private boolean changes;
	
	/**
	 * Constructor
	 * @param inst_id
	 * @param rec_id
	 * @param number
	 * @param description
	 * @param action_id
	 * @param time
	 * @param user_reqd
	 */
	public Instruction(int inst_id, int rec_id, int number, String description, int action_id, String time, boolean user_reqd){
		this.inst_id = inst_id;
		this.rec_id = rec_id;
		this.number = number;
		this.description = description;
		this.act_id = action_id;
		this.time = time;
		this.user_reqd = user_reqd;
		this.changes = false;
		
		this.instIngUnits_added = 0;
		this.ingredients = new ArrayList<Ingredient>();
		this.units = new ArrayList<Unit>();
		this.amounts = new ArrayList<Integer>();
	}
	
	/**
	 * Returns the unique id of this Instruction
	 * @return
	 */
	public int getID(){
		return this.inst_id;
	}
	
	/**
	 * Sets the id of this Instruction
	 * @param inst_id
	 * @return
	 */
	public boolean setID(int inst_id){
		this.inst_id = inst_id;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the unique Recipe ID in which this Instruction resides.
	 * @return
	 */
	public int getRecID(){
		return this.rec_id;
	}
	
	/**
	 * Sets the Recipe ID of this instruction
	 * @param rec_id
	 * @return
	 */
	public boolean setRecID(int rec_id){
		this.rec_id = rec_id;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the step number of this Instruction within the Recipe.
	 * @return
	 */
	public int getNumber(){
		return this.number;
	}
	
	/**
	 * Sets the step number of this Instruction
	 * @param number
	 * @return
	 */
	public boolean setNumber(int number){
		this.number = number;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the description of this Instruction
	 * @return
	 */
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * Sets the description of this Instruction
	 * @param description
	 * @return
	 */
	public boolean setDescription(String description){
		this.description = description;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the unique action_id of this Instruction
	 * @return
	 */
	public int getActionID(){
		return this.act_id;
	}
	
	/**
	 * Sets the action_id for this Instruction
	 * @param act_id
	 * @return
	 */
	public boolean setActionID(int act_id){
		this.act_id = act_id;
		return this.setChanges(true);
	}
	
	
	/**
	 * Returns the time value of this given Instruction
	 * @return
	 */
	public String getTime(){
		return this.time;
	}
	
	/**
	 * Sets the time String for this Instruction
	 * @param time
	 * @return
	 */
	public boolean setTime(String time){
		this.time = time;
		return this.setChanges(true);
	}
	
	/**
	 * Returns the User Required boolean. True if the user is required throughout the entirety of this instruction.
	 * @return
	 */
	public boolean getUserReqd(){
		return this.user_reqd;
	}
	
	/**
	 * Sets the User Required boolean to the input b parameter.
	 * @param b
	 * @return
	 */
	public boolean setUserReqd(boolean b){
		this.user_reqd = b;
		return this.setChanges(true);
	}
	
	/**
	 * Returns changes value signifying pending changes needed pushed to DB.
	 * @return
	 */
	public boolean getChanges(){
		return this.changes;
	}
	
	/**
	 * Sets the changes value to the provided parameter. Used for signifying pending changes to go to DB.
	 * @param b
	 * @return
	 */
	public boolean setChanges(boolean b){
		this.changes = b;
		return true;
	}
	
	/**
	 * Returns the number of (Ingredient, Unit, Amount) combinations added to this instruction.
	 * @return
	 */
	public int getInstIngUnitsAdded(){
		return this.instIngUnits_added;
	}
	
	/**
	 * Searches the Ingredients, Units, and Amounts lists for the combination given. If it already exists, this method returns false to avoid duplication.
	 * If the combination is not found, the combination is added to the end of the lists.
	 * @param ing_id
	 * @param unit_id
	 * @param amt
	 * @return
	 */
	public boolean addInstIngUnit(int ing_id, int unit_id, int amt){
		
		for(int i = 0; i < this.instIngUnits_added; i++){
			if(this.ingredients.get(i).getID() == ing_id &&
					this.units.get(i).getID() == unit_id &&
					this.amounts.get(i) == amt){
				return false;
			}
		}
		
		this.ingredients.add(new Ingredient(ing_id, null, null));
		this.units.add(new Unit(unit_id, null, null));
		this.amounts.add(amt);
		this.instIngUnits_added++;
		
		return this.setChanges(true);
	}
	
	/**
	 * Searches the Instruction, Units, and Amount lists sequentially for the combination of parameters given.
	 * If the combination is found in the same index within each list, it is removed from the lists.
	 * @param ing_id
	 * @param unit_id
	 * @param amt
	 * @return
	 */
	public boolean removeInstIngUnit(int ing_id, int unit_id, int amt){
		for(int i = 0; i < this.instIngUnits_added; i++){
			if(this.ingredients.get(i).getID() == ing_id &&
					this.units.get(i).getID() == unit_id &&
					this.amounts.get(i) == amt){
				this.instIngUnits_added--;
				this.ingredients.remove(i);
				this.units.remove(i);
				this.amounts.remove(i);
				return this.setChanges(true);
			}
		}
		return false;
	}
	

}
