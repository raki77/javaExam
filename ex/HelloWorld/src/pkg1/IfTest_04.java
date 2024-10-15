package pkg1;

import java.util.Scanner;

public class IfTest_04 {

	public static void main(String[] args) {
		
		int num1 = 14;
		int num2 = 15;
		// 10은 2의 배수이고, 5의 배수 입니다.
        // 12은 2의 배수이고, 5의 배수가 아님.
        
		Scanner scanner = new Scanner(System.in);
		System.out.print("num1 값을 입력하세요: ");
		int a1 = scanner.nextInt();
		num1 = a1;
		
        if (num1 % 2 == 0) {
        	if(num1 % 5 == 0) {
        		System.out.println(num1 + "은 2의 배수이고, 5의 배수 입니다.");
        	}
        	else {
        		System.out.println(num1 + "은 2의 배수이고, 5의 배수가 아님");
        	}
        }
        else {
        	System.out.println(num1 + "은 2의 배수가 아님");
        }
        ////////////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.print("num2 값을 입력하세요: ");
        
        int a2 = scanner.nextInt();
		num2 = a2;
		
        String msg = "";
        if(num2%2 == 0 && num2%5 == 0) {
        	msg = num2 + "은 2의 배수이고 5의 배수이다.";
        }
        else if(num2%2 == 0 && num2%5 != 0) {
        	msg = num2 + "은 2의 배수이고 5의 배수가 아님.";
        }
        else if(num2%2 != 0 && num2%5 == 0) {
        	msg = num2 + "은 2의 배수 아니고 5의 배수이다.";
        }
        else {
        	msg = num2 + "은 2의 배수 아니고 5의 배수가 아님.";
        }
        System.out.println(msg);
        ////////////////////////////////////////////////////////////////////////
        
        float fNum = 2.0f;     
        
        // byte, short, int, char만 가능
        switch( (int) fNum ) {
	        case 1: {
	        	break;
	        }
	        default:
	        	break;
        }
        if(fNum == 2) {        	
        	System.out.println(fNum);
        }
        
	}

}
