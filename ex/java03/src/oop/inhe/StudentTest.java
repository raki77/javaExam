package oop.inhe;

public class StudentTest {
    public static void main(String[] args) {
        Elementary e = new Elementary("java", 5);
        University u = new University("java2", 3, 20);

        String str = e.getStudentInfo();
        System.out.println("학생 정보 1 : " + str);
        str = u.getStudentInfo();
        System.out.println("학생 정보 2 : " + str + ", 수강학점 : " + u.getCourses() + "점");

    }
}
