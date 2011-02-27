package org.juarez.euler;

import java.util.ArrayList;

public class Divisors {
	ArrayList<Long> divisors;
	
	private void addDivisorsToList(long number) {
		for (long i = 2; Math.pow(i, 2) <= number; i++) {
			if (number % i == 0) {
				divisors.add(i);
				this.addDivisorsToList(number / i);
				return;
			}
		}
		divisors.add(number);
	}
	
	public ArrayList<Long> getDivisors(long number) {
		this.divisors = new ArrayList<Long>();
		this.addDivisorsToList(number);
		return this.divisors;
	}
}
