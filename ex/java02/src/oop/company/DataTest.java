package oop.company;

public class DataTest {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.setX(100);
        d1.setY(300);
        int n1 = d1.getX();
        int n2 = d1.getY();
        d1.setValue(n1 + n2);
        System.out.println("value : " + d1.getValue());
    }
}
