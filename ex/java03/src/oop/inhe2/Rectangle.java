package oop.inhe2;

public class Rectangle extends Shape {
    public void calcRecTangle(float _width , float _height) {
        System.out.println("calcRecTangle()");
        super.area = _width * _height;
    }
}
