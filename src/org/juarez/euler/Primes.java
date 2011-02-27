package org.juarez.euler;

import java.util.*;

public class Primes implements Iterator<Long>{
	long n_elements;
	ArrayList<Long> known_primes = new ArrayList<Long>(); 

	private boolean isPrime(long n) {
		long max_test = (long) Math.sqrt(n); 
		
		for (long prime : known_primes) {
			if (prime > max_test) {
				return true;
			} else {
				if (n % prime == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	@Override
	public boolean hasNext() {
		return known_primes.size() < n_elements;
	}

	@Override
	public Long next() {
		long next = 2;
		if (known_primes.size() > 0) {
			next = known_primes.get(known_primes.size() - 1) + 1;			
			while (!isPrime(next)) {
				next++;
			}
		}
		
		known_primes.add(next);
		return next;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	public Primes(int n) {
		n_elements = n;
	}
}