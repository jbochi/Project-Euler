package org.juarez.euler;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class SieveTest {

	@Test
	public void testSieve() {
		assertEquals(Arrays.asList(2, 3, 5, 7), Sieve.getPrimes(10));
	}

}
