package oop.abstract1;

public class University extends Student {
	
    private int courses;
 
    public University(String _name, int _grade, int _courses, String _teacher) {
        super.name = _name;
        super.grade = _grade;
        this.courses = _courses;
        super.teacher = _teacher;
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
     
 
	public String getStudentInfo() {
		System.out.println("University 클래스의 getStudentInfo()");
//		return super.getStudentInfo();
		return "이름 : " + name
		      + ", 학년 : " + grade
		      + ", teacher : " + teacher
		      ;
	}

	@Override
	public String getTeacher() {
		return "지도 교수 : " + super.teacher;
	} 
   
}
