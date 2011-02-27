package org.juarez.euler;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DivisorsTest {

	@Test
	public void testGet_divisors() {
		List<Long> known_divisors = Arrays.asList(5L, 7L, 13L, 29L);
		Divisors d = new Divisors();		
		assertEquals(known_divisors, d.getDivisors(13195));
	}

}
