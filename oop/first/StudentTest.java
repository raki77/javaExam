package oop.first;

public class StudentTest {
	public static void main(String[] args) {
		Student st2=new Student();
		Student st=new Student("java", 21);
		
		System.out.println(st);
		System.out.println(st2);
		//속성값을 변경 setXXX()
		st2.setName("programming");//st2.name="programming"
		String name=st2.getName();
		System.out.println(name);
		
		int grade=st2.getGrade();
		System.out.println(grade);
		System.out.println(st2);
		
	}
}
