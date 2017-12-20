package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import obj.User;

public class UserTest {
	
	User user = new User(1, "kellen", "password", "email@email.com", 18, "USA", true);

	@Test
	public void testConstructor() {
		assertEquals(1, user.getID());
		assertEquals("kellen", user.getUserName());
		assertEquals("password", user.getPassWord());
		assertEquals("email@email.com", user.getEmail());
		assertEquals(18, user.getAge());
		assertEquals("USA", user.getLocation());
		assertEquals(true, user.getAdmin());
		assertEquals(false, user.getChanges());
	}

	public void testChanges() {
		assertEquals(true, user.getChanges());
		user.setChanges(false);
		assertEquals(false, user.getChanges());
	}
	
	@Test
	public void testIDChange() {
		user.setID(5);
		assertEquals(5, user.getID());
		testChanges();
	}
	
	@Test
	public void testUserNameChange() {
		user.setUserName("new username");
		assertEquals("new username", user.getUserName());
		testChanges();
	}
	
	@Test
	public void testPassWordChange() {
		user.setPassWord("sublime");
		assertEquals("sublime", user.getPassWord());
		testChanges();
	}
	
	@Test
	public void testEmailChange() {
		user.setEmail("newemail@lol.com");
		assertEquals("newemail@lol.com", user.getEmail());
		testChanges();
	}
	
	@Test
	public void testAgeChange() {
		user.setAge(35);
		assertEquals(35, user.getAge());
		testChanges();
	}
	
	@Test
	public void testLocationChange() {
		user.setLocation("IA");
		assertEquals("IA", user.getLocation());
		testChanges();
	}
	
	@Test
	public void testAdminChange() {
		user.setAdmin(false);
		assertEquals(false, user.getAdmin());
		testChanges();
	}
}