package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DescendingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
//		if (o1.intValue()==o2.intValue()) {
//			return 0;
//		} else {
//			if (o1.intValue()>o2.intValue()) {
//				return -1;
//			} else {
//				return 1;
//			}
//		}
		
		return o1.intValue()==o2.intValue()? 0: o1.intValue()>o2.intValue()?-1:1;
		
	}
	
}

public class ListSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList= new ArrayList<>();
		
		arrayList.add(101);
		arrayList.add(101);
		arrayList.add(103);
		arrayList.add(106);
		arrayList.add(104);
		arrayList.add(102);
		
		Collections.sort(arrayList);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		System.out.println();
		Collections.sort(arrayList, new DescendingComparator());
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}

}
