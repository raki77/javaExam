package oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivide_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		try {
			System.out.println("X = ");
			x = sc.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		}		
		System.out.println("X = " + x);
	}

}
