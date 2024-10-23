package oop.inhe2;

public class StudentTest {
    public static void main(String[] args) {
//        Elementary e = new Elementary("java", 5);
//        University u = new University("java2", 3, 20);
//        String str = e.getStudentInfo();
//        System.out.println("학생 정보 1 : " + str);
//        str = u.getStudentInfo();
//        System.out.println("학생 정보 2 : " + str + ", 수강학점 : " + u.getCourses() + "점");

        Elementary e = new Elementary("java", 5, "남", 31);
        University u = new University("java2", 3, 20);
        University u1= new University();
        String str = e.getStudentInfo();
        System.out.println("학생 정보 1 : " + str);
        String gender = e.getGender();
        int age = e.getAge();
        System.out.println("성별 : " + gender + ", 나이 : " + age);

        String  sinsang = null;
        int courses = 0;

        sinsang = u.getStudentInfo();
        courses = u.getCourses();
        System.out.println("학생정보 : " + sinsang + ", 학점 : " + courses);
        sinsang = u1.getStudentInfo();
        courses = u1.getCourses();
        System.out.println("학생정보 : " + sinsang + ", 학점 : " + courses);
    }
}
