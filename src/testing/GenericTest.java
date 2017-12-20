package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.Action;
import obj.Complimentary;

public class GenericTest {

	public void testChanges(Complimentary c){
		assertEquals(true, c.getChanges());
		c.setChanges(false);
		assertEquals(false, c.getChanges());
	}
}
