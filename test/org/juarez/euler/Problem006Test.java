package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem006Test {

	@Test
	public void testDifferenceOfSquares() {
		assertEquals(0, Problem006.differenceOfSquares(1));
		assertEquals(2640, Problem006.differenceOfSquares(10));
	}

}
