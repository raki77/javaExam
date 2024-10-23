package oop.inhe2;

public class Student extends Person {

    protected String name;
    protected int grade;
    public Student() {
        System.out.println("부모 생성자");
    }
    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentInfo() {
        System.out.println("Student 클래스의 getStudentInfo() 호출");
        return "이름 : " + name
                + ", 학년 : " + grade
                + ", 성별 : " + this.gender
                + ", 나이 : " + this.age;
    }

}
