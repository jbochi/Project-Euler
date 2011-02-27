package org.juarez.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem5Test {

	@Test
	public void test_smallest_multiplyer_one_item() {
		long[] numbers = {1};
		assertEquals(1, Problem5.smallest_multiplier(numbers));		
	}
	
	@Test
	public void test_smallest_multiplyer_prime_items() {
		long[] numbers = {1, 2, 3};
		assertEquals(6, Problem5.smallest_multiplier(numbers));			
	}
	
	@Test
	public void test_smallest_multiplyer_not_prime_items() {
		long[] numbers = {1, 2, 3, 4};
		assertEquals(12, Problem5.smallest_multiplier(numbers));			
	}

	@Test
	public void test_one_to_ten() {
		long[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertEquals(2520, Problem5.smallest_multiplier(numbers));			
	}
	
	@Test
	public void test_one_to_twenty() {
		long[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 
				          10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		assertEquals(232792560, Problem5.smallest_multiplier(numbers));			
	}
	
}
