package oop.exception;

public class ThrowExample2 {

	public static void main(String[] args) {
		try {
			findClass();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않음 : " + e.getMessage());
		}
	}

	private static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
