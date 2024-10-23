package method;

import java.util.Random;

public class Method02 {

	public static void main(String[] args) {		
		multiply();		
	}
	
	private static void multiply() {
		// 입출력 하는 메소드
		// 2수를 난수 발생
		Random rand = new Random();
		int num1 = rand.nextInt(9);
		int num2 = rand.nextInt(9);		
		// 종료 출력 : -99
		// num1 * num2는 얼마? num1, num2 
		System.out.println("종료 : -99");
		System.out.printf("%d * %d는 얼마?", num1, num2);
		
	}

}
