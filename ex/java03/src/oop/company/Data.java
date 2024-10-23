package oop.company;


public class Data {
    private int x, y;
    private int value;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return this.x + this.y;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
