package com.jlc;

/**
 * @author Ashish1992
 *
 */
public class Lab7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int a = 10;
		callSwitch(x, a);
	}

	public static void callSwitch(int x1, int a) {
		switch (x1) {

		case 0:
			 int a1 = 10;
			System.out.println("A1:" + a1);

			break;

		case 1:

			System.out.println("A2:" + a);
			break;
		}
	}

}
