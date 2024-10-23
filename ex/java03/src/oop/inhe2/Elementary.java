package oop.inhe2;

public class Elementary extends Student {

    public Elementary() {
        this("test",1,"male",1);
    }

    public Elementary(String _name, int _grade) {
        System.out.println("Elementary 생성자 메소드1");
        this.name = _name;
        this.grade = _grade;
    }

    public Elementary(String _name, int _grade, String _gender, int _age) {
        System.out.println("Elementary 생성자 메소드2");
        this.name = _name;
        this.grade = _grade;
        this.gender = _gender;
        this.age = _age;
    }

}
