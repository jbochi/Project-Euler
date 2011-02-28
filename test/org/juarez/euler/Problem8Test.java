package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem8Test {

	@Test
	public void testLargestProduct() {
		assertEquals(1, Problem8.largestProduct(1, "1"));
		assertEquals(9, Problem8.largestProduct(1, "29"));
		assertEquals(8, Problem8.largestProduct(2, "423"));
		assertEquals(81, Problem8.largestProduct(2, "199"));
		assertEquals(81, Problem8.largestProduct(3, "1991"));
	}

}
