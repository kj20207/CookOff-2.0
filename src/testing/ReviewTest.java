package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Recipe;
import obj.RecipeReview;
import obj.Review;
import obj.User;

public class ReviewTest {

	User user = new User(1, "kellen", "password", "email@email.com", 18, "USA", true);
	Recipe r = new Recipe(10, 6, "Best Food", "Seriously, the best", "Comfort");
	Review rev = new RecipeReview(r, user);
	
	@Test
	public void testConstructor() {
		fail("Not yet implemented");
	}

	public void testChanges() {
		assertEquals(true, rev.getChanges());
		rev.setChanges(false);
		assertEquals(false, rev.getChanges());
	}
	
	@Test
	public void testIDChange() {
		testChanges();
	}

}
