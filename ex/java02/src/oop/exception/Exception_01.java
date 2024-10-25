package oop.exception;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		String kor = sc.next(); 	
		
		try {
			System.out.println("정수입력:");
			int math = Integer.parseInt(kor);
		} 
		catch (NumberFormatException ne) {
			System.out.println("예외1 : " + ne.getMessage());
			ne.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally { //자동수행
			System.out.println("finally 실행");
		}
		
	}

}
