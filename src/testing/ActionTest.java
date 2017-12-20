package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Action;

public class ActionTest extends GenericTest {

	public Action action = new Action(10, "Boil", "Heat liquid at a medium temperature until it begins to bubble");

	@Test
	public void testConstructor() {
		assertEquals(10, action.getID());
		assertEquals("Boil", action.getName());
		assertEquals("Heat liquid at a medium temperature until it begins to bubble", action.getDescription());
		assertEquals(false, action.getChanges());
	}

	@Test
	public void testIDChange(){
		action.setID(15);
		assertEquals(15, action.getID());
		testChanges(action);
	}

	@Test
	public void testNameChange(){
		action.setName("Something else");
		assertEquals("Something else", action.getName());
		testChanges(action);
	}

	@Test
	public void testDescriptionChange(){
		action.setDescription("New Description");
		assertEquals("New Description", action.getDescription());
		testChanges(action);
	}
}
