package oop.poly3;

public class StudentTest {
    public static void main(String[] args) {
    	
    	String sinsang = null;
    	Person p1 = new Elementary("이순신", 2, "남", 15);
    	Person p2 = new University("홍길동", 3, 22, "남", 21);
    	
    	sinsang  = ((Student) p1).getStudentInfo();
    	System.out.println("학생정보 :" + sinsang);
    	
    	sinsang =((Student) p2).getStudentInfo();
    	int courses = ((University) p2).getCourses();
    	System.out.println("학생정보 :" + sinsang + ", 학점: " + courses + "점");  
    	
    }
}
