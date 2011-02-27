package org.juarez.euler;

public class Problem6 {

	public static long differenceOfSquares(long n) {
		long sum = 0;
		long sum_of_squares = 0;		
		for (long i = 1; i <= n; i ++) {
			sum += i;
			sum_of_squares += Math.pow(i, 2);						
		}
		long square_of_sum = (long) Math.pow(sum, 2); 
		return square_of_sum - sum_of_squares;
	}
	
	public static void main(String[] args) {
		System.out.println(differenceOfSquares(100));
	}

}