package pkg1;

public class Test4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// 4x +5y = 60
		// 해를 구해서, (x,y)형태 출력
		for(int x=1; x<=10 ; x++) {
			for(int y=1 ; y<=10; y++) {
				int aaa = (60 - (4*x)) / 5;
				int bbb = (60 - (4*x)) % 5;
				if(aaa == y && bbb == 0) {
					System.out.println("x=" + x + ", y=" + y);
				}
			}	
		}
	}

}
