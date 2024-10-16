package pkg1;

import java.util.Scanner;

public class IfTest_03 {

	public static void main(String[] args) {
		
		// 1. 우산, 2. 과자, 3. 음료수
		// 머니
		System.out.println("1.우산, 2.과자, 3.음료수");
		Scanner scanner = new Scanner(System.in);
        System.out.print("우산 값을 입력하세요: ");
        double a = scanner.nextInt();
        System.out.print("과자 값을 입력하세요: ");
        double b = scanner.nextInt();
        System.out.print("음료수 값을 입력하세요: ");
        double c = scanner.nextInt();
        System.out.print("money입력:");
        double money = scanner.nextInt();
        
        System.out.print("무엇을 구매 하시겠습니까?:");
        double idx = scanner.nextInt();

        if(idx == 1 && money >= a) {
        	System.out.println("우산 구매 성공");
        	System.out.println("남은 money :" + (money - a));
        }
        else if(idx == 2 && money >= b) {
        	System.out.println("과자 구매 성공");
        	System.out.println("남은 money :" + (money - b));
        }
        else if(idx == 3 && money >= c) {
        	System.out.println("음료수 구매 성공");
        	System.out.println("남은 money :" + (money - c));
        }
        else {
        	System.out.println("돈이 부족하다.");
        } 
        
	}

}
