package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem4Test {

	@Test
	public void testIsPalindrome() {
		assertTrue(Problem4.isPalindrome(9009));
		assertFalse(Problem4.isPalindrome(9010));
	}

	@Test
	public void testMaxPalindromeProduct() {
		assertEquals(9009, Problem4.maxPalindromeProduct(99));
	}

}
