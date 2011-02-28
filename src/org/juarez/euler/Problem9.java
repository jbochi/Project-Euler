package org.juarez.euler;

import java.util.Arrays;
import java.util.List;

public class Problem9 {
	public static boolean isTriplet(int a, int b, int c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
	}
	
	
	public static List<Integer> findTriplet(int sum) {
		int a = 0;
		int b = 0;
		int c = 0;
		boolean done = false;
		
		while (!done && a < sum) {
			a++;			
			for (b = 1; b < sum - a - 1; b++) {
				c = sum - a - b;
				if (isTriplet(a, b, c)) {
					done = true;
					break;
				}
			}
		}
		
		if (done) {
			return Arrays.asList(a, b, c);
		} else {
			return Arrays.asList(0, 0, 0);
		}
	}
	
	public static void main(String[] args) {
		int p = 1;
		for (int n : findTriplet(1000)) {
			p *= n;
		}
		System.out.println(p);
	}
}
