package obj;

/**
 * Abstract class to be extended by Unit, Ingredient, and Action
 * @author KFed
 *
 */
public abstract class Complimentary {

	/**
	 * The name of this item
	 */
	private String name;
	
	/**
	 * A short description of this item
	 */
	private String description;
	
	/**
	 * Boolean which represents whether or not this item has changes to be pushed to DB.
	 */
	private boolean changes;
	
	/**
	 * Constructor
	 * @param name
	 * @param description
	 */
	public Complimentary(String name, String description){
		this.name = name;
		this.description = description;
		this.changes = false;
	}
	
	/** 
	 * Returns the name of this Object.
	 * @return
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Returns the short description of this object.
	 * @return
	 */
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * Returns true if pending changes can be pushed to the DB for this object. False if unchanged.
	 * @return
	 */
	public boolean getChanges(){
		return this.changes;
	}
	
	/**
	 * Sets the name of this object.
	 * @param name
	 * @return
	 */
	public boolean setName(String name){
		if(name == null || name.trim().equals("") || name.equals(this.name)){
			return false;
		}
		this.name = name;
		return this.setChanges(true);
	}
	
	/**
	 * Sets the short description of this object.
	 * @param description
	 * @return
	 */
	public boolean setDescription(String description){
		if(description == null || description.trim().equals("") || description.equals(this.description)){
			return false;
		}
		this.description = description;
		return this.setChanges(true);
	}
	
	/**
	 * Sets the boolean representing changes for this object.
	 * @param b
	 * @return
	 */
	public boolean setChanges(boolean b){
		this.changes = b;
		return true;
	}
	
	/**
	 * Abstract method to be done in the inheriting class.
	 * Represents setting the unique id of each object.
	 * @param id
	 * @return
	 */
	public abstract boolean setID(int id);
	
	/**
	 * Abstract method to be done in the inheriting class.
	 * Returns the unique id of this object.
	 * @return
	 */
	public abstract int getID();
	
}
