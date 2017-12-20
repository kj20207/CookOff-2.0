package obj;

/**
 * Extended class from Complimentary. Incorporates the unit id into the object.
 * @author KFed
 *
 */
public class Unit extends Complimentary {
	
	/**
	 * The unique unit id of this Unit.
	 */
	private int unit_id;
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 */
	public Unit(int unit_id, String name, String description) {
		super(name, description);
		this.unit_id = unit_id;
	}

	/**
	 * Returns the unit_id of this Unit.
	 */
	@Override
	public int getID() {
		return this.unit_id;
	}

	/**
	 * Sets the unit_id of this Unit.
	 */
	@Override
	public boolean setID(int unit_id) {
		this.unit_id = unit_id;
		return this.setChanges(true);
	}
	
}
