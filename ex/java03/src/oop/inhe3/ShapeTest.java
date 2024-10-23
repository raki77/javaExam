package oop.inhe3;

import oop.inhe3.Rectangle;
import oop.inhe3.Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        int width = 10;
        int height = 20;
        Rectangle r1 = new Rectangle();
        r1.calcRecTangle(width, height);
        r1.printArea();

        // 삼각형 넓이를 구한다.
        Triangle t1 = new Triangle();
        t1.calcTriangle(width, height);
        // 오버라이딩한 메소드가 호출된다.
        t1.calcArea(width, height);
        t1.printArea();

    }
}
