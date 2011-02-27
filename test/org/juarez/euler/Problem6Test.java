package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem6Test {

	@Test
	public void testDifferenceOfSquares() {
		assertEquals(0, Problem6.differenceOfSquares(1));
		assertEquals(2640, Problem6.differenceOfSquares(10));
	}

}
