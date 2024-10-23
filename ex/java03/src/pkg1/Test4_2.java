package pkg1;

public class Test4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String grade = "B";
		int score1 = 0;
		
		switch(grade) {
			case "A":
				score1=100;
				break;
			case "B":
				int result=100-20;
				score1=result;
				break;
			default:
				score1=60;
				break;
		}
		
		//Express표현식 변경
		String grade2 = "B";
		int score11 = switch (grade2) {
		    case "A" -> 100;
		    case "B" -> {
		        int result = 100 - 20;
		        yield result; // 값을 반환하기 위해 yield 사용
		    }
		    default -> 60;
		};
		
		
		
		System.out.println((5+10)*7/2.0);
		System.out.println(5/0.1);
		
		int sum = 0;
		for (int i=1; i <= 100 ; i++) {
			if(i % 3 == 0) {
				sum += i;
			}			
		}
		System.out.println("sum:" + sum);
	}

}
