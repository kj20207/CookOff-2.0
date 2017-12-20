package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Recipe;

public class RecipeTest {

	Recipe r = new Recipe(10, 6, "Best Food", "Seriously, the best", "Comfort");
	
	@Test
	public void testConstructor() {
		fail("Not yet implemented");
	}

	public void testChanges() {
		assertEquals(true, r.getChanges());
		r.setChanges(false);
		assertEquals(false, r.getChanges());
	}
	
	@Test
	public void testIDChange() {
		testChanges();
	}

	@Test
	public void testUserIDChange() {
		testChanges();
	}
	
	@Test
	public void testNameChange() {
		testChanges();
	}
	
	@Test
	public void testDescriptionChange() {
		testChanges();
	}
	
	@Test
	public void testTypeChange() {
		testChanges();
	}
	
	@Test
	public void testCookTime() {
		testChanges();
	}
	
	@Test
	public void testInstructions() {
		testChanges();
	}
}
