package main;

import java.util.ArrayList;

public class Sieve {
	
	/**
	 * Find all primes up to a given number using the Sieve of Eratosthenes
	 * @param n upper bound
	 * @return list of primes <= n
	 */
	public static ArrayList<Integer> findPrimes(int n) {
		// TODO
		return null;
	}
	
	public static void main(String[] args) {
		for (int x : findPrimes(1000)) {
			System.out.println(x);
		}
	}
}
