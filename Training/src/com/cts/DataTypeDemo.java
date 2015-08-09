/**
 * 
 */

package com.cts;

/**
 * @author Ashish1992
 *
 */

class DataType{
	private byte b;
	private short s;
	public int i;
	long l;
	float f;
	protected double d;
	private boolean bool;
	char c;
	
	
	public DataType(	byte b1,	short s,	int i,	long l,	float f,	double d,	boolean bool,	char c) {
		// TODO Auto-ctor stub
		b=b1;
		this.s=s; //ue of this when argument name same as instance variable
		this.i=i;
		this.l=l;
		this.f=f;
		this.d=d;
		this.bool=bool;
		//this.c=c;
	}//constructor
	
	public boolean getBool(DataType d) {
		return this.bool;
		
	}
	
	/**
	 *
	 * @param bool
	 * @return void-no return
	 */
	public void setBool(boolean bool) {
		System.out.println(getBool(this));
		this.bool=bool;
	}
}//class
public class DataTypeDemo {
	
	protected int a;


	/**
	 * @param args
	 * @return void
	 *	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int age;
		
		byte b = 0;
		short s=0;
		DataType dataType = new DataType(b,s,123,12L,12.12f,12.123d,true,'c');
		
		
		//System.out.println(dataType.bool);
		int i = 0x12;//hexadecimal
		int j=012;//octal
		char c= '\u00ff';//unicode
		
		System.out.print(c+" ");
		System.out.println("someshwar"+dataType.c+"kale");
		System.out.println(j+ " "+i);
		System.out.println("\\\"ashish\tkale\"");//escape seq.
	}

}
