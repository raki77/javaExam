package oop.poly3;

public class University extends Student {
	
    private int courses;
 
    public University(String _name, int _grade, int _courses) {
        super.name = _name;
        super.grade = _grade;
        courses = _courses;
        System.out.println("University 생성자 호출 3개짜리");
    }
    
    public University(String _name, int _grade, int _courses, String _gender, int _age) {
        super.name = _name;
        super.grade = _grade;
        this.courses = _courses;
        super.gender = _gender;
        super.age = _age;
        System.out.println("University 생성자 호출 5개짜리");
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    // 부모클래스 getStudInfo() 재정의
//    public String getStudInfo() {
//        System.out.println("University 클래스의 getStudInfo 메소드 호출");
//        return "이름은 >> " + name + ", 학년은 >>" + grade
//                + ", 신청 학첨은 >>" + courses;
//    }
}
