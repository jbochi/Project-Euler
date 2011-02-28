package org.juarez.euler;

public class Problem010 {

	public static long primesSum(int max) {
		long sum = 0;
		for (int prime: Sieve.getPrimes(max)) {
			sum += prime;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(primesSum(2000000));
	}

}
