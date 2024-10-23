package oop.inhe3;

public class StudentTest {
    public static void main(String[] args) {

        Elementary e = new Elementary("java", 5);
        University u = new University("java2", 3, 20);

        System.out.println("학생정보1:" + e.getStudentInfo());
        System.out.println("학생정보2:" + u.getStudentInfo());
    }
}
