package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem2Test {

	@Test
	public void testSumEvenFibonacciTerms() {
		assertEquals(2+8+34, Problem2.sumEvenFibonacciTerms(90));
	}

}
