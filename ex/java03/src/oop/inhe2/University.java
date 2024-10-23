package oop.inhe2;

public class University extends Student {
    private int courses;

    public University() {
        this("test", 1, 1);
    }

    public University(String _name, int _grade, int _courses) {
        //super(_name, _grade);
        super();
        super.name = _name;
        super.grade = _grade;
        courses = _courses;
        System.out.println("University 생성자 호출");
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
}
