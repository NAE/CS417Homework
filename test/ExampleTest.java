import static org.junit.Assert.*;

import org.junit.Test;


public class ExampleTest {
	
	@Test
	public void testAdd() {
		Example ex = new Example();
		assertEquals(2 + 3, ex.add(2, 3));
	}
	
	@Test
	public void testSubtract() {
		Example ex = new Example();
		assertEquals(10 - 7, ex.subtract(10, 7));
	}
	
	@Test
	public void testMultiply() {
		Example ex = new Example();
		assertEquals(3 * 5, ex.multiply(3, 5));
	}
	
	@Test
	public void testDivide() {
		Example ex = new Example();
		assertEquals(6 / 2, ex.divide(6, 2));
	}
	
}
