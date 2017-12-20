package obj;

/**
 * Extended class of Review. Represents a Review object created for a MealPlan.
 * @author KFed
 *
 */
public class MealPlanReview extends Review{

	/**
	 * The mealplan in which the Review was created for.
	 */
	MealPlan mp;
	
	/**
	 * Constructor
	 * @param mp
	 * @param u
	 */
	public MealPlanReview(MealPlan mp, User u){
		super(u);
		this.mp = mp;
	}
	
	/**
	 * Returns the reviewed MealPlan.
	 * @return
	 */
	public MealPlan getMealPlan(){
		return this.mp;
	}
}
