package com.jlc.test;


//* *                 * * 
//* *             * *   
//  * *         * *     
//    * *     * *       
//      * * * *         


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 12 ; j++) {
				if(i == j || (i+1 == j) || (i+j) == 12 ||(i+j) == 13)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();	
			 

		}
	}

}
