package org.juarez.euler;

public class Problem7 {

	public static long nthPrime(int n) {
		Primes p = new Primes(n);
		long prime = 0;
		
		while (p.hasNext()) {
			prime = p.next();
		}
		
		return prime;
	}
	
	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}

}
