package com.jlc.test;

public class Pattern4{  
		  public static void main(String[] args) {
			  
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 5; j++) {
					if( (i+j)%4 == 0 || (i ==3 && j==3) )
					System.out.print("*"+" ");
					else
						System.out.print("  ");
					
					
				}
				System.out.println();
			}
			System.out.println();
			int num =1;
			for (int i = 3; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					if( (i+j) == 4 || (i+j) == 5 )
					    System.out.print( "  ");
					else if(j%2 == 0)
					{
						
						System.out.print(num-1 +" ");
						
					}else{
						System.out.print(num+" ");
					}
					
				}
				System.out.println();
			}
			for (int i = 3; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					if( (i+j) == 4 || (i+j) == 5 )
					    System.out.print( "  ");
					else if(i == j || (i+j)== 6 || (i+j) == 8)
					{
						
						System.out.print("A ");
						
					}else{
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
		} 
		}  


