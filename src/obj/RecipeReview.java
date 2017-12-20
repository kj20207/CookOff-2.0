package obj;

/**
 * Extended class of Review. Represents a Review object created for a Recipe.
 * @author KFed
 *
 */
public class RecipeReview extends Review {

	/**
	 * The recipe in which the Review was created for.
	 */
	Recipe r;
	
	/**
	 * Constructor
	 * @param r
	 * @param u
	 */
	public RecipeReview(Recipe r, User u){
		super(u);
		this.r = r;
	}
	
	/**
	 * Returns the reviewed Recipe.
	 * @return
	 */
	public Recipe getRecipe(){
		return this.r;
	}
}
