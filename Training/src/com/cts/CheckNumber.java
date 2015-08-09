package com.cts;

public class CheckNumber {
	private CheckNumber(){
		
	} 

	public static void main(String[] as) {
		long sum = 0;
        boolean isprime = true;
		for (long i = 100; i <= 150; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			if(isprime)
				sum+=i;
			}
			
		}
		System.out.println("Sum of prime number is  : " + sum);

	}
}
