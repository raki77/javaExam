package oop.first;

public class ArrayUtil {
	public  void calcArray(int[] score1) {
		int sum=0;
		float ave=0.0f;
		
		for(int i=0;i<score1.length;i++) {
			sum+=score1[i];
		}
		ave=(float)sum/score1.length;
		System.out.println("합="+sum+",평균="+ave);
		
	}
	public void sortArray(int[] num) {
	      int temp=0;

	      for(int i=0; i<num.length;i++){
	         for(int j=i+1; j<num.length;j++){
	            if(num[i]>num[j]){
	               temp=num[i];
	               num[i]=num[j];
	               num[j]=temp;
	            }
	         }
	      } //end for
	      for(int i=0; i<num.length;i++){
	         System.out.print(num[i]+"\t");
	      }
	
	}
}
