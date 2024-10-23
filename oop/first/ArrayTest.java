package oop.first;

public class ArrayTest {
	public static void main(String[] args) {
		int[] score1={23,45,67,87,88,99,13,77,65};
	    int[] score2={56,78,98,88,77,55,43,21,99,67};
	  //배열 score1 합 평균 정렬
	  //배열 score2 합 평균 정렬
	   ArrayUtil u=new ArrayUtil();
	   //ArrayUtil.calcArray(score1);
	   u.calcArray(score1);
	   u.sortArray(score1);
	   u.calcArray(score2);
	   u.sortArray(score2);
	   
	}
}
