package pkg1;

public class ForTest_04 {

	public static void main(String[] args) {

		int number = 2, count = 1;
		boolean isPrime = true;
		for( ;number <= 1000 ; number++) {
			isPrime = true;
			for(int divisor=2; divisor<= number/2 ; divisor++) {				
				if(number%divisor != 0) {
					continue;
				}
				isPrime = false;
				break;
			}		
			if(isPrime) {
				if(count%8 == 0) {
					System.out.println(number);
				}
				else {
					System.out.print(number + " ");
				}
				count++;
			}
		}			
			
	}

}
