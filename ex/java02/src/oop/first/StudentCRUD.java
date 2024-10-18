package oop.first;

import oop.second.Student;

import java.util.Scanner;

public class StudentCRUD {
    Scanner sc;
    Student st;
    public StudentCRUD() {
        this.sc = new Scanner(System.in);
    }

    public void saveStudent() {
        System.out.println("자료 저장");
        System.out.print("이름1:");
        String name = sc.next();
        System.out.print("학년1:");
        int grade = sc.nextInt();
        // Student의 생성자 메소드 이용.
        st = new Student(name , grade);
    }

    public void studentPrint() {
        System.out.println("name:"+ st.getName());
        System.out.println("grade:" + st.getGrade());
        System.out.println(st);
    }

    public void updateStudent() {
        System.out.print("이름2:");
        String name = sc.next();
//        st.setName(name);
        st.setName(sc.next());
    }
}
