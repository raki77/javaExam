package oop.first;

import java.util.Scanner;

public class StudentCRUD {
	Scanner sc;
	Student st;
	public StudentCRUD() {
		sc=new Scanner(System.in);
	}
	public void saveSutdent() {
		//Scanner sc=new Scanner(System.in);
 		//Student 클래스 사용
		System.out.println("자료 저장!!!");
		System.out.print("이름:");
		String name=sc.next();
		System.out.print("학년:");
		int grade=sc.nextInt();
		//Student의 생성자 메소드 이용
		st=new Student(name, grade);
	}
	public void studentPrint() {
		System.out.println("이름 : "+st.getName());
		System.out.println("학년 : "+st.getGrade());
		System.out.println(st);//toString()사용시
		
	}
	public void updateStduent() {
		//Scanner sc=new Scanner(System.in);
		System.out.print("이름:");
		String name=sc.next();
		st.setName(name);//st.setName(sc.next());
	}
}
