package oop.abstract1;

import oop.poly3.Person;

public abstract class Student extends Person {

    String name;
    int grade;
    String teacher;
    
    public Student() {
        System.out.println("부모 생성자");
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

//	public String getTeacher() {
//		return teacher;
//	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

//	public String getStudentInfo() {
//        System.out.println("Student 클래스의 getStudentInfo() 호출");
//        return "이름 : " + name
//                + ", 학년 : " + grade
//                + ", teacher : " + teacher
//                ;
//    } 
	public abstract String getTeacher();

}
