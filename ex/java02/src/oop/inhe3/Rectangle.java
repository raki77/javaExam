package oop.inhe3;

import oop.inhe3.Shape;

public class Rectangle extends Shape {
    public void calcRecTangle(float _width , float _height) {
        System.out.println("calcRecTangle()");
        super.area = _width * _height;
    }
}
