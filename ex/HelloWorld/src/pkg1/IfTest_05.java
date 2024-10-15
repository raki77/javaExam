package pkg1;

import java.util.Scanner;

public class IfTest_05 {

	public static void main(String[] args) {

		int score = 89;
		int category= 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시험점수를 입력하세요: ");
		score = scanner.nextInt();
		
		if(score >= 0 && score <= 100) {
			category = (score/10);
			System.out.print("시험점수=" + score + ", ");
			System.out.println("등급=" + fGrade(category)); 
			System.out.println("점수분류=" + category); 
		}
		else {
			System.out.println("점수 범위 밖이다.");
		}		
		
	}

	
	private static String fGrade(int category) {

		String result = "";
		switch(category) {
			case 10 :
			case 9 : {
				result = "A";
				break;
			}
			case 8 : {
				result = "B";
				break;
			}
			case 7 : {
				result = "C";
				break;
			}			
			default:
				result = "D";
				break;				
		}
		return result;
	}

}
