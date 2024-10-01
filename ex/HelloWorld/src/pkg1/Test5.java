package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { 
				{1,2},
				{2,3,3},
				{4,4,4,4,4}
		};
		System.out.println(arr1.length);
		
		// 5_7 max code
		int[] arr2 = {1,5,3,8,2};
		int tmp = 0;
		for(int x=0; x<arr2.length; x++) {
			if(tmp < arr2[x]) {
				tmp = arr2[x];
			}			
		}
		System.out.println("max:" + tmp);
		
		// 5_8
		int[][] arr3 = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		int cnt = 0;
		int total = 0;
		for (int x=0; x < arr3.length; x++) {
			for( int y=0 ; y< arr3[x].length; y++) {
				cnt++;
				total += arr3[x][y];
			}
		}
		System.out.println("total:" + total);
		System.out.println("avg:" + (total/1.0/cnt));		
		
		
		//5_9
		Scanner scanner = new Scanner(System.in);
		String val = "";
		ArrayList<int[]> res = new ArrayList<int[]>(); 
		while(true) {
			System.out.println("===========================");
			System.out.println("1.학생수, 2.점수입력, 3.점수리스트, 4.분석, 5.종료");
			System.out.println("===========================");			
			val = scanner.nextLine(); 
			if(val.equals("5")) {
				break;
			}
			else if(val.equals("1")) {				
				System.out.print("학생수>");
				String studentCnt = scanner.nextLine();
				for(int x=1; x<= Integer.parseInt(studentCnt) ;x++) {
					int[] aa = new int[]{x, 0};
					res.add(aa);
				}
			}
			else if(val.equals("2")) {
				if(res.size() > 0) {
					for(int x=0; x< res.size(); x++) {	
						System.out.print("scores["+ x + "]:");
						String sc = scanner.nextLine();
						int[] t1 = res.get(x);						
						t1[1] = Integer.parseInt(sc);
						res.set(x, t1);
					}	
				}				
			}
			else if(val.equals("3")) {
				if(res.size() > 0) {
					for(int x=0; x< res.size(); x++) {	
						System.out.println("scores["+ x + "]:" + res.get(x)[1]);					
					}	
				}				
			}
			else if(val.equals("4")) {
				if(res.size() > 0) {
					int max1 = 0;
					int total1 = 0;
					for(int x=0; x< res.size(); x++) {
						if(max1 < res.get(x)[1]) {
							max1 = res.get(x)[1];
						}
						total1 += res.get(x)[1];
					}	
					System.out.println("max:" + max1);
					System.out.println("avg:" + (total1/1.0/res.size()));
				}				
			}
			
			
			
		}	
		System.out.println("exit"); 		
	}

}
