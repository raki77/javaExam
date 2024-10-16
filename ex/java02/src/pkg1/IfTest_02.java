package pkg1;

import java.util.Scanner;

public class IfTest_02 {

	/**
	 * 
	 * 2차 방정식의 근을 판단
	 * ax*2 + bx + c = 0
	 * d = b*b-4*a*c
	 * d => 0 두 실근 
	 * d == 0 중근
	 * d < 0 두 허근
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		// 사용자로부터 a, b, c 값을 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("a 값을 입력하세요: ");
        double a = scanner.nextDouble();
        System.out.print("b 값을 입력하세요: ");
        double b = scanner.nextDouble();
        System.out.print("c 값을 입력하세요: ");
        double c = scanner.nextDouble();

        // 판별식 계산 (b^2 - 4ac)
        double result = b * b - 4 * a * c;

        String msg = "";
        // 판별식이 양수, 0 또는 음수일 때에 따라 결과 처리
        if (result > 0) {
            // 두 개의 실근
            double root1 = (-b + Math.sqrt(result)) / (2 * a);
            double root2 = (-b - Math.sqrt(result)) / (2 * a);
            System.out.println("두 실근은 " + root1 + " 과 " + root2 + " 입니다.");
            msg= "두실근";
        } 
        else if (result == 0) {
            // 중근
            double root = -b / (2 * a);
            System.out.println("중근은 " + root + " 입니다.");
            msg= "중근";
        } 
        else if (result < 0) {        
            // 실근이 없고 복소수 근
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-result) / (2 * a);
            System.out.println("실근이 없습니다. 복소수 근은 " + realPart + " ± " + imaginaryPart + "i 입니다.");
            msg= "두 허근";
        }
        else {
        	System.out.println("뭘까??" + result);
        }
        scanner.close();
        
        System.out.println(msg);
        
	}

}
