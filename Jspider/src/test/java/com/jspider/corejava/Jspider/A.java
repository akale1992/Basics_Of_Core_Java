package com.jspider.corejava.Jspider;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		A b = new A();
		b.wish();

	}

	void wish() {
		System.out.println("wishing A");

		String s = "Ashish";
		String s1 = "";
		int c = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.indexOf(s.charAt(i)) == i) {
				c++;
				s1 += s.charAt(i);
			}
		}
		System.out.println(c);
		System.out.println(s1);
		int[] arr = { 10, 6, 4, 28 };
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j =i+ 1; j <= arr.length - 1; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");

		}

	}
}

class B extends A {
	@Override
	void wish() {
		// TODO Auto-generated method stub

		int c = 1;
		String st = "Ashish     kale";
		System.out.println(st.replaceAll("\\s+", ""));
		char ch[] = st.replaceAll("\\s+", "").toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++) {
			if (i + 1 != ch.length && ch[i] == ch[i + 1]) {
				c++;
			} else {
				System.out.println(ch[i] + " " + c);
				c = 1;
			}
		}

	}
}

class C extends B {
	@Override
	void wish() {
		// TODO Auto-generated method stub
		super.wish();
	}
}
