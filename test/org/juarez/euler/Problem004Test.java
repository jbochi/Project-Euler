package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem004Test {

	@Test
	public void testIsPalindrome() {
		assertTrue(Problem004.isPalindrome(9009));
		assertFalse(Problem004.isPalindrome(9010));
	}

	@Test
	public void testMaxPalindromeProduct() {
		assertEquals(9009, Problem004.maxPalindromeProduct(99));
	}

}
