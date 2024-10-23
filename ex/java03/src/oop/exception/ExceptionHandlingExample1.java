package oop.exception;

public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);	
		}
		catch(Exception e) {			
		}		
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
