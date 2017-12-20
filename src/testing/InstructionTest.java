package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Instruction;

public class InstructionTest {

	Instruction inst = new Instruction(515, 10, 1, "Do some stuff", 3, "00:10:00", true);
	
	@Test
	public void testConstructor() {
		assertEquals(515, inst.getID());
		assertEquals(10, inst.getRecID());
		assertEquals(1, inst.getNumber());
		assertEquals("Do some stuff", inst.getDescription());
		assertEquals(3, inst.getActionID());
		assertEquals("00:10:00", inst.getTime());
		assertEquals(true, inst.getUserReqd());
		assertEquals(0, inst.getInstIngUnitsAdded());
		assertEquals(false, inst.getChanges());
	}

	public void testChanges() {
		assertEquals(true, inst.getChanges());
		inst.setChanges(false);
		assertEquals(false, inst.getChanges());
	}

	@Test
	public void testIDChange() {
		inst.setID(30);
		assertEquals(30, inst.getID());
		testChanges();
	}
	
	@Test
	public void testRecIDChange() {
		inst.setRecID(2);
		assertEquals(2, inst.getRecID());
		testChanges();
	}
	
	@Test
	public void testNumberChange() {
		inst.setNumber(3);
		assertEquals(3, inst.getNumber());
		testChanges();
	}
	
	@Test
	public void testDescriptionChange() {
		inst.setDescription("desc");
		assertEquals("desc", inst.getDescription());
		testChanges();
	}
	
	@Test
	public void testActionIDChange() {
		inst.setActionID(0);
		assertEquals(0, inst.getActionID());
		testChanges();
	}
	
	@Test
	public void testTimeChange() {
		inst.setTime("00:05:30");
		assertEquals("00:05:30", inst.getTime());
		testChanges();
	}
	
	@Test
	public void testUserReqdChange() {
		inst.setUserReqd(false);
		assertEquals(false, inst.getUserReqd());
		testChanges();
	}
	
	@Test
	public void testInstIngUnitChange() {
		inst.addInstIngUnit(10, 10, 10);
		assertEquals(1, inst.getInstIngUnitsAdded());
		testChanges();
		inst.removeInstIngUnit(10, 10, 10);
		assertEquals(0, inst.getInstIngUnitsAdded());
		testChanges();
	}
}
