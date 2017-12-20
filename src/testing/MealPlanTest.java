package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.MealPlan;

public class MealPlanTest {

	MealPlan mp = null;
	
	@Test
	public void testConstructor() {
		fail("Not yet implemented");
	}

	public void testChanges() {
		assertEquals(true, mp.getChanges());
		mp.setChanges(false);
		assertEquals(false, mp.getChanges());
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
	public void testMaxCookTime() {
		testChanges();
	}
	
	@Test
	public void testEstimatedCookTime() {
		testChanges();
	}
	
	
	@Test
	public void testRecipes() {
		testChanges();
	}
	
	@Test
	public void testCookify() {
		testChanges();
	}

}
