package obj;

/**
 * Extended class from Complimentary. Incorporates the ingredient id into the object.
 * @author KFed
 *
 */
public class Ingredient extends Complimentary {

	/**
	 * The unique ingredient_id of this Ingredient.
	 */
	private int ing_id;
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 */
	public Ingredient(int ing_id, String name, String description) {
		super(name, description);
		this.ing_id = ing_id;
	}

	/**
	 * Returns the unique ingredient_id of this Ingredient
	 */
	@Override
	public int getID() {
		return this.ing_id;
	}

	/**
	 * Sets the unique ingredient_id of this Ingredient
	 */
	@Override
	public boolean setID(int ing_id) {
		this.ing_id = ing_id;
		return this.setChanges(true);
	}

}
