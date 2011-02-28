package org.juarez.euler;

import java.util.ArrayList;

public class Problem005 {
	public static long smallest_multiplier(long[] numbers) {
		Divisors divider = new Divisors(); 
		ArrayList<Long> common_divisors = new ArrayList<Long>(); 
		
		for (long n : numbers) {
			ArrayList<Long> divisors = divider.getDivisors(n);	
			
			@SuppressWarnings("unchecked")
			ArrayList<Long> temp_divisors = (ArrayList<Long>) common_divisors.clone();
						
			for (long d: divisors) {
				if (temp_divisors.indexOf(d) > -1) {
					// we already know this divisor
					temp_divisors.remove(d);
				} else {
					// this was not part of common divisors
					common_divisors.add(d);
				}
			}
		}

		long r = 1;
		for (long n: common_divisors) {
			r *= n;
		}
		return r;
	}
}
