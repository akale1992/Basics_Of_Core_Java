package com.jspider.corejava.Jspider;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;

public class Stack<T> {
	private List<T> list=new ArrayList<>();
	//private int length=0;
	
	public Boolean push(T t) {
		if (list.add(t)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	public Boolean pop() {
		if (list.remove(list.get(list.size()))) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public T top() {
		return list.get(list.size());
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public static void main(String[] args) throws ParseException {
		String s = "2015-08-01 02:56:54";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = sdf.parse(s);
			DateTime d = DateTime.parse("2015-08-01T02:56:54"); //
			System.out.println(d1);
			
			System.out.println(d.getZone());
		
		
		
		
	}
	

}

