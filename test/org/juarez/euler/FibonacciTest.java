package org.juarez.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
	
	@Test
	public void testFirstNumbers() {
		Fibonacci f = new Fibonacci();
		assertEquals(1, (int) f.next());
		assertEquals(2, (int) f.next());
		assertEquals(3, (int) f.next());
		assertEquals(5, (int) f.next());
		assertEquals(8, (int) f.next());
		assertEquals(13, (int) f.next());
		assertEquals(21, (int) f.next());
		assertEquals(34, (int) f.next());
		assertEquals(55, (int) f.next());
		assertEquals(89, (int) f.next());		
	}

}
