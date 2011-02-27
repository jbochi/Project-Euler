package org.juarez.euler;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimesTest {
	
	@Test
	public void testFirstPrime() {
		Primes p = new Primes(1);
		assertEquals(2, (long) p.next());
		assertEquals(false, p.hasNext());
	}
	
	@Test
	public void testFirstSixPrimes() {
		Primes p = new Primes(6);
		assertEquals(2, (long) p.next());
		assertEquals(3, (long) p.next());
		assertEquals(5, (long) p.next());
		assertEquals(7, (long) p.next());
		assertEquals(11, (long) p.next());
		assertEquals(13, (long) p.next());
		assertEquals(false, p.hasNext());
	}
	
}
