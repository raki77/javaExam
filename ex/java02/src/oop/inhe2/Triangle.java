package oop.inhe2;

public class Triangle extends Shape {
    public void calcTriangle(float _width, float _height) {
        System.out.println("calcTriangle()");
        super.area = _width * _height / 2.0f;
    }
    // 부모 클래스의 메소드 재정의 하고 있다.
//    public void calcArea(float width , float height) {
//        super.area = width * height / 2.0f;
//    }
}
