package observer_design_pattern;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AbonatTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	/*public void testAbonat() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubscribe() {
		fail("Not yet implemented");
	}

	@Test
	public void testUnsubscribe() {
		fail("Not yet implemented");
	}*/

	//@Test
	/*
	 * public void testUpdate() {
		
	}
	*/
	@Test
	public void testGetName() {
		Abonat a = new Abonat("gigi");
		
		assertEquals("Failed test",a.getName(),"gigi");
	}

}
