package com.jlc.test;

public class Pattern2 {
	public static void main(String[] args) {
		int num = 11;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(num + " ");
				num = num + 1;
			}
			num = num + 7;
			System.out.println();
		}

		System.out.println();
		for (int i = 11; i <= 31; i = i + 10) {
			for (int j = i; j < i + 3; j++) {
				System.out.print(j + " ");

			}

			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 7; i = i + 3) {
			for (int j = i; j <= i + 2; j++) {
				System.out.print(j + " ");

			}

			System.out.println();
		}
		System.out.println();
		int num1 = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == j || (i + j) == 4)
					System.out.print(num1 + 1 + " ");
				else
					System.out.print(num1 + " ");

			}

			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 4; j++) {

				if (i <= j)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
		for (int i = 1; i <=3 ; i++) {
			for (int j = 1; j <= 3; j++) {
				if(i == j || (i+j) == 4)
				System.out.print(num1+1+" ");
				else
					System.out.print(num1+" ");
				
			}
			
			System.out.println();
		}
		System.out.println();
	}
}
