package oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivide_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		int res = 0;
		boolean flag = false;		
		do {
			try {
				System.out.print("x = ");	
				x = sc.nextInt();	
				flag = false;
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요. >> " + e.getMessage());
				flag = true;
				sc.nextLine();
			}	 
		} 
		while(flag);
		
		do {
			try {
				System.out.print("y = ");	
				y = sc.nextInt();	
				flag = false;
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요. >> " + e.getMessage());
				flag = true;
				sc.nextLine();
			}	 
		} 
		while(flag);
		try {
			res = x/y;
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException : " + ae.getMessage());
		}		
		System.out.println(x + " / " + y + " = " + res);
	}

}
