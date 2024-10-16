package array;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;

public class arr01 {

	public static void main(String[] args) { 
		System.out.println("3개 값을 입력하시오");
		int[] result = inputInt();
		fCalc(result);	
		fSort(result);
	}	
	
	private static void fSort(int[] result) { 
		int tmp = 0;
		for(int i=0 ; i < result.length; i++) {
			for(int j=i ; j< result.length; j++) {
				if(result[i] > result[j]) {
					tmp = result[i];
					result[i] = result[j];
					result[j] = tmp;
				}
			}
		}
		for(int x: result) {
			System.out.printf("%d\t" , x);
		}
	}

	private static void fCalc(int[] result) { 
		int sum = 0;
		int avg = 0;
		int max = 0;
		for(int score: result) {
			sum += score;
			if(max < score) {
				max = score;
			}
		}
		System.out.println("Result");
		System.out.print("합산:" + sum);
		System.out.print("/ 평균:" + Math.round(sum/3.0 * 100.0) / 100.0);
		System.out.println(" / 최대값:" + max);
	}


	private static int[] inputInt() {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[3]; 
		for(int i=0; i<3 ; i++) {
			System.out.print((i+1) + "번째 값:");
			result[i] = sc.nextInt();
		}				
		return result;
	}


}
