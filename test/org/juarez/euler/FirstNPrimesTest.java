package org.juarez.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class FirstNPrimesTest {
	
	@Test
	public void testFirstPrime() {
		FirstNPrimes p = new FirstNPrimes(1);
		assertEquals(2, (long) p.next());
		assertEquals(false, p.hasNext());
	}
	
	@Test
	public void testFirstSixPrimes() {
		FirstNPrimes p = new FirstNPrimes(6);
		assertEquals(2, (long) p.next());
		assertEquals(3, (long) p.next());
		assertEquals(5, (long) p.next());
		assertEquals(7, (long) p.next());
		assertEquals(11, (long) p.next());
		assertEquals(13, (long) p.next());
		assertEquals(false, p.hasNext());
	}
	
}
