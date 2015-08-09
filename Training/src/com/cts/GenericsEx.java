package com.cts;

import java.util.Scanner;

class Generics<T>{
	private T n;
	
	public T getN() {
		return n;
	}

	public void setN(T n) {
		this.n = n;
	}
	public static<T> void name(int n1, int n2) {
		System.out.println(n1*n2);
		
	}


}

public class GenericsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner=new Scanner(System.in);
		Generics<Integer> s= new Generics<>();
		s.setN(12);
		
		
		Generics.name(12, 12);
		System.out.println(s.getN());
	}

}
