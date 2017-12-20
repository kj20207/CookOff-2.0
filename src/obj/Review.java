package obj;

/**
 * Main class for the review object. This object represents the numerical value in which a User can leave on either a Recipe or MealPlan.
 * @author KFed
 *
 */
public class Review {
	
	/**
	 * The user object which left the review
	 */
	private User u;
	
	/**
	 * The numerical rating of the Review
	 */
	private int rating;
	
	/**
	 * Whether or not this object has pending changes to be pushed to the DB.
	 */
	private boolean changes;
	
	/**
	 * Constructor
	 * @param u
	 */
	public Review(User u){
		this.u = u;
		this.changes = false;
		this.rating = 0;
	}
	
	/**
	 * Returns the numerical rating of this Review.
	 * @return
	 */
	public int getRating(){
		return this.rating;
	}
	
	/**
	 * Returns the user which created this review.
	 * @return
	 */
	public User getUser(){
		return this.u;
	}
	
	/**
	 * Returns true if there is pending changes to be pushed to the DB.
	 * @return
	 */
	public boolean getChanges(){
		return this.changes;
	}
	
	/**
	 * Sets the numerical rating of this Review Object.
	 * Fails if the rating falls outside of the 1-5 range.
	 * @param i
	 * @return
	 */
	public boolean setRating(int i){
		if(i > 5 || i < 1){
			return false;
		}
		this.rating = i;
		return this.setChanges(true);
	}
	
	/**
	 * Set the boolean value representing pending changes to this object.
	 * @param b
	 * @return
	 */
	public boolean setChanges(boolean b){
		this.changes = b;
		return true;
	}


}
