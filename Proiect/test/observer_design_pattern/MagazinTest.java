package observer_design_pattern;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MagazinTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
/*
	@Test
	public void testAddObserver() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyObserver() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testGetList() {
		
		Abonat a = new Abonat("Gigi");
		Abonat b = new Abonat("Ionel");
		
		Magazin m = new Magazin();	
		
		b.Subscribe(m);
		a.Subscribe(m);

		assertEquals("Failed","Ionel\nGigi\n", m.getList());
	}

}
