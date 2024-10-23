package oop.abstract1;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elementary e1 = new Elementary("name1", 1, "teacher");
		System.out.println("학생 : " + e1.getName());
		System.out.println(e1.getTeacher());
		
		Student u1 = new University("Html5", 3, 23, "WEB담탱");
		String str = ((University)u1).getStudentInfo();
		System.out.println(str);
		System.out.println(((University)u1).getStudentInfo());
		System.out.println(u1.getTeacher());
	}

}
