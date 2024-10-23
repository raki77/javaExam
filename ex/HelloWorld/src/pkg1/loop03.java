package pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 소수인지 아닌지 판단하는 프로그램
// 값입력: 24 -> 2,3,4,6 ...
// 소수가 아니다.
// 24%2, 24%3, 24%4, 24%5 ... 24%24
public class loop03 {
	public static void main(String[] args) { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
            System.out.print("Enter num : "); 
            int num  = Integer.parseInt(reader.readLine());
            for( int i=2; i<= num; i++ ) {
            	if ( num % i == 0 ) {
            		System.out.println("소수가 아니다.");
            		System.exit(0);
                }
            }            
        } 
		catch (IOException e) {
            e.printStackTrace();  
        }
		
	}

}
 