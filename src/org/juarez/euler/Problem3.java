package org.juarez.euler;

import org.juarez.euler.Divisors;
import java.util.ArrayList;

public class Problem3 {
	public static long greatest_divisor(long n) {
		long divisor = 0;
		
		Divisors d = new Divisors();
		ArrayList<Long> divisors = d.getDivisors(n); 
		for (long p : divisors) {
			divisor = p;
		}
		return divisor;
	}
	
	public static void main(String[] args) {
		System.out.println(greatest_divisor(600851475143L));
	}

}
