package pkg1;

import java.util.Scanner;

public class Test4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String val = "";
		while(true) {
			System.out.println("===========================");
			System.out.println("1.예금 , 2.출금, 3.잔고, 4.종료");
			System.out.println("===========================");
			
			val = scanner.nextLine();
			
			if(val.equals("4")) {
				break;
			}
			else if(val.equals("1")) {
				System.out.println("예금액>10000");
			} 
		} 
		System.out.println("exit"); 
	}

}
