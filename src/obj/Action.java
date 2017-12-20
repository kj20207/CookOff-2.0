package obj;

/**
 * Extended class from Complimentary. Incorporates the action id into the object.
 * @author KFed
 *
 */
public class Action extends Complimentary {
	
	/**
	 * The unique action_id of this Action.
	 */
	private int act_id;
	
	/**
	 * Constructor
	 * @param id - The unique Action_id
	 * @param name - the name of the Action
	 * @param description - A short description of the Action
	 */
	public Action(int act_id, String name, String description){
		super(name, description);
		this.act_id = act_id;
	}
	
	/**
	 * Sets the action_id of this Action.
	 */
	@Override
	public boolean setID(int act_id){
		this.act_id = act_id;
		return this.setChanges(true);
	}

	/**
	 * Returns the unique action_id of this Action.
	 */
	@Override
	public int getID() {
		return this.act_id;
	}
	
}
