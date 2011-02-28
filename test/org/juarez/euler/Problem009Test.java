package org.juarez.euler;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Problem009Test {

	@Test
	public void testIsTriplet() {
		assertTrue(Problem009.isTriplet(3, 4, 5));
		assertFalse(Problem009.isTriplet(3, 4, 6));
	}
	
	@Test
	public void testFindTriplet() {
		assertEquals(Arrays.asList(3, 4, 5), Problem009.findTriplet(12));
	}

}
