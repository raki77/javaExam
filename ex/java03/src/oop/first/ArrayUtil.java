package oop.first;

public class ArrayUtil
{
    public void calcArray(int[] score1) {
        int sum = 0;
        float average = 0f;

        for(int i=0; i<score1.length; i++) {
            sum += score1[i];
        }

        average = (float)sum/score1.length;
        System.out.println("배열 총합:" + sum + ", 배열 평균:" + average);
    }

    public void sortArray(int[] num) {
        int temp = 0;
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num.length; j++) {
                if(num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int i=0; i<num.length; i++) {
            System.out.println(num[i] + "\t");
        }
    }
}
