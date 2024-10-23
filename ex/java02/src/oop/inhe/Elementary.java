package oop.inhe;

public class Elementary extends Student02 {
    public Elementary(String _name, int _grade) {
        System.out.println("Elementary 생성자 메소드");
        this.name = _name;
        this.grade = _grade;
    }

}
