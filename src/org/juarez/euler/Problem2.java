package org.juarez.euler;
import org.juarez.euler.Fibonacci;

public class Problem2 {
	public static int sumEvenFibonacciTerms(int max) {
		Fibonacci f = new Fibonacci();
		int sum = 0; 
			
		int i = f.next();
		while (i < max) {
			if (i % 2 == 0) {
				sum += i;
			}
			i = f.next();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {		
		System.out.println(sumEvenFibonacciTerms(4000000));
	}

}
