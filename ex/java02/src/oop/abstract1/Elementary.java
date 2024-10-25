package oop.abstract1;

public class Elementary extends Student {

    public Elementary() {
        this("test",1);
    }

    public Elementary(String _name, int _grade) {
        System.out.println("Elementary 생성자 메소드1");
        this.name = _name;
        this.grade = _grade;      
    } 
    public Elementary(String _name, int _grade, String _teacher) {
        System.out.println("Elementary 생성자 메소드1");
        this.name = _name;
        this.grade = _grade;
        super.teacher = _teacher;
    } 
    
    public Elementary(String _name, int _grade, String _gender, int _age) {
        System.out.println("Elementary 생성자 메소드2");
        this.name = _name;
        this.grade = _grade; 
        super.gender = _gender;
        super.age = _age;
    }
    
	@Override
	public String getTeacher() {
		// TODO Auto-generated method stub
		return "담임선생님 : " + super.teacher;
	}

}
