package pkg1;

import java.util.Scanner;

public class IfTest_01 {

	public static void main(String[] args) {
		// 입력 Scanner 클래스
		Scanner sc = new Scanner(System.in);		
		int coupon = 5000;
		
		System.out.print("num1=");
		int num1 = sc.nextInt();				
		System.out.print("num2=");
		int num2 = sc.nextInt();		
		int sum = num1 + num2;
		double avg = (double) sum / 2;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		System.out.printf("===============================\n");
		System.out.printf("num1=%3d\t", num1);
		System.out.printf("num2=%3d\t\n", num2);
		System.out.printf("===============================\n");
				
		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
		System.out.printf("avg=%.2f\n",(float)avg);
		
//		if(avg >= 70) {
//			System.out.println("상품권 지급 : "+ coupon +"원" );
//		}
//		else {
//			System.out.println("상품권 없다.");
//		}
		
		if( avg >= 90 ) {
			coupon = 20000;
		}
		else if( avg >= 80 ) {
			coupon = 10000;
		}
		else if( avg >= 70 ) {
			coupon = 5000;
		}
		else {
			coupon = 0;
			System.out.println("상품권 없다.");
		}		
		if(coupon > 0) {
			System.out.println("상품권 지급 : "+ coupon +"원" );
		}
		
		String msg = "";
		switch((int)(avg/10)) {
			case 10:
			case 9:
				msg = "수";
				break;
			case 8:
				msg = "우";
				break;
			case 7:
				msg = "미";
				break;
			case 6:
				msg = "양";
				break;
			default:
				msg = "가";
				break;			
		}
		
		System.out.println("당신의 grade : " + msg);
	}

}
