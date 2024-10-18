package oop.first;

public class ArrayTest {
    public static void main(String[] args) {
        int[] score1 = {23,45,67,87,88,99,13,77,65};
        int[] score2 = {56,78,98,88,77,55,43,21,99,67};

        ArrayUtil au = new ArrayUtil();

        au.calcArray(score1);
        au.sortArray(score1);
        au.calcArray(score2);
        au.sortArray(score2);

    }
}
