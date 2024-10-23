package oop.inhe;

public class University extends Student02 {
    private int courses;
    public University(String _name, int _grade, int _courses) {
        super(_name, _grade);
//        name = _name;
//        grade = _grade;
        courses = _courses;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
}
