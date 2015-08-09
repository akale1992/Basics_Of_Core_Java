package com.jlc;

/**
 * 
 * @author Ashish1992
 * 
 *
 */
public class Lab {
	
	public class Hello{
		private int id=0;
		private String name="Ashish";
		
		public int m1(int... arr1){
			System.out.println("show int");
			int sum = 0;
			for (int i : arr1) {
				sum+=i;
			}
			return sum;
		}
		void m2(int[] arr2){
			System.out.println("show int");
		}
		public String toString() {
			System.out.println("In overrided toString()");
			
//			return  this.getClass()+"@"+this.hashCode();
//			StringBuilder sb = new StringBuilder();
//			sb.append("Hello "+this.name+"!!\n");
//			sb.append("Is your id "+this.id+"?");
//			return sb.toString();
			return "Ashish";
			
		}

		
		}

	public static void main(String[] args) {
		Hello h =new Lab().new Hello();
		Hello h1 =new Lab().new Hello();
		Hello h2=h1;
		System.out.println(h);
		h.m1();
		Class f = h.getClass();
		int p = h.hashCode();
		System.out.println(f);
		System.out.println(p); 
		System.out.println(h);
		System.out.println(h.equals(h1));
		System.out.println(h1.equals(h2));
		System.out.println(h.toString());
}

}



