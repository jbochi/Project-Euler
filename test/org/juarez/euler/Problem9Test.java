package org.juarez.euler;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Problem9Test {

	@Test
	public void testIsTriplet() {
		assertTrue(Problem9.isTriplet(3, 4, 5));
		assertFalse(Problem9.isTriplet(3, 4, 6));
	}
	
	@Test
	public void testFindTriplet() {
		assertEquals(Arrays.asList(3, 4, 5), Problem9.findTriplet(12));
	}

}
