public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("이순신");
        String name = s1.getName();
        System.out.println("학생 이름은 " + name);
        s1.setGrade(99);
        System.out.println(name + " 성적은 " + s1.getGrade() + "점");
    }
}
