package com.jspider;

import java.io.Serializable;

public class Book implements Serializable {
	int pages;
	String bName;
	double bPrice;
	public Book(int pages, String bName, double bPrice ) {
		// TODO Auto-generated constructor stub
		this.pages = pages;
		this.bPrice = bPrice;
		this.bName = bName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bName+" "+bPrice;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book b = (Book)obj;
		return this.bName.equals(b.bName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book []arr = new Book [3];
		arr[0] = new Book(100, "half gf", 10);
		arr[1] = new Book(50, "2 states", 15);
		arr[2] = new Book(55, "3 mistakes", 20);
		for (Book book : arr) {
			System.out.println(book);
			
		}
		System.out.println(arr[0].equals(arr[1]));

	}

}
