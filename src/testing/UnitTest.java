package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Unit;

public class UnitTest extends GenericTest{

	public Unit u = new Unit(10, "Ounces", "a unit of weight equal to one 16th of a pound.");
	
	@Test
	public void testConstructor() {
		assertEquals(10, u.getID());
		assertEquals("Ounces", u.getName());
		assertEquals("a unit of weight equal to one 16th of a pound.", u.getDescription());
	}
	
	@Test
	public void testIDChange(){
		u.setID(5);
		assertEquals(5, u.getID());
		testChanges(u);
	}
	
	@Test
	public void testNameChange(){
		u.setName("New Name");
		assertEquals("New Name", u.getName());
		testChanges(u);
	}
	
	@Test
	public void testDescriptionChange(){
		u.setDescription("New Description...");
		assertEquals("New Description...", u.getDescription());
		testChanges(u);
	}
	
}
