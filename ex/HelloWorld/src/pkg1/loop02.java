package pkg1;

// 5 10 15 20 25 30 35 40 45 50
// 1-50까지 5배수 합 : 275
public class loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=50 ; i++) {
			if(i % 5==0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("sum : " + sum);
	}

}
