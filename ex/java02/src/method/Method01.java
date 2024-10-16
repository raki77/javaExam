package method;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {		
		inputInt();	
		inputInt();	
		inputInt();
	}
	
	private static void inputInt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 = ");
		System.out.println(sc.nextInt());		
	}

}
