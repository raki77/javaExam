package oop.second;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    public Student() {
        this("web", 31);
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
