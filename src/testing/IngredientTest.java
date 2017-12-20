package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Ingredient;

public class IngredientTest extends GenericTest {

	public Ingredient ing = new Ingredient(100, "Corn", "Its from Iowa");

	@Test
	public void testConstructor() {
		assertEquals(100, ing.getID());
		assertEquals("Corn", ing.getName());
		assertEquals("Its from Iowa", ing.getDescription());
	}

	@Test
	public void testIDChange() {
		ing.setID(55);
		assertEquals(55, ing.getID());
		testChanges(ing);
	}

	@Test
	public void testNameChange() {
		ing.setName("Chips");
		assertEquals("Chips", ing.getName());
		testChanges(ing);
	}

	@Test
	public void testDescriptionChange() {
		ing.setDescription("The perfect snack");
		assertEquals("The perfect snack", ing.getDescription());
		testChanges(ing);
	}
}
