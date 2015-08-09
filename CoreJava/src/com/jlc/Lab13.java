package com.jlc;

public class Lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stmt 0");
		
		try {
			System.out.println("Stmt 1");
		
			
			try {
//				System.out.println("Stmt 2");
				int x = 10/0;
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Stmt 3");
			}
			finally{
				System.out.println("Stmt 4");
			}
			System.out.println("Stmt 5");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Stmt 6");
			try {
				System.out.println("Stmt 7");
			} catch (Exception e2) {
				System.out.println("Stmt 8");
				// TODO: handle exception
			}finally{
				System.out.println("Stmt 9");
			}
			System.out.println("Stmt 10");
		}	
		finally{
			System.out.println("Stmt 11");
			try {
				System.out.println("Stmt 12");
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Stmt 13");
			}
			finally{
				System.out.println("Stmt 14");
			}
			System.out.println("Stmt 15");
		}
		System.out.println("Stmt 16");
		}

	}


