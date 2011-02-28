package org.juarez.euler;

import java.util.*;

public class Sieve {
	public static List<Integer> getPrimes(int max) {
		SortedSet<Integer> primes_set = new TreeSet<Integer>();
		List<Integer> primes = new ArrayList<Integer>();
		
		//Initialize
		for (int i = 2; i <= max; i++) {
			primes_set.add(i);
		}
		
		//Sieve
		for (int prime = 2; prime <= max; prime++) {
			if (primes_set.contains(prime)) {
				primes.add(prime);
				for (int i = prime * 2; i <= max; i += prime) {
					primes_set.remove(i);
				}
			}
		}
		
		return primes;
	}
}
