package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem002Test {

	@Test
	public void testSumEvenFibonacciTerms() {
		assertEquals(2+8+34, Problem002.sumEvenFibonacciTerms(90));
	}

}
