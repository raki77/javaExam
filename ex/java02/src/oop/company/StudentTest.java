package oop.company;

import oop.second.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 3);
        System.out.println("학생 이름은?" + s1.getName());
        System.out.println("학생 학년은?" + s1.getGrade());
    }
}
