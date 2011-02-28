package org.juarez.euler;

public class Problem004 {

	public static boolean isPalindrome(int number) {
		String s = String.valueOf(number);
		String reverse = new StringBuffer(s).reverse().toString();
		return s.equals(reverse);
	}
	
	
	public static int maxPalindromeProduct(int max) {
		int max_palindrome = 0;
		int product;
		
		for (int a = max; a > 0; a--) {
			for (int b = max; b > 0; b--) {
				product = a * b;
				if (isPalindrome(product)) {
					max_palindrome = Math.max(max_palindrome, product);
				}
			}
		}
		return max_palindrome;
	}
	
	public static void main(String[] args) {
		System.out.println(maxPalindromeProduct(999));
	}

}
