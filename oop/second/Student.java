package oop.second;

public class Student {
	private String name;
	private int grade;
	//overloading(중복메소드)
	public Student() {
		this("web",31);
	}
	public Student(String name, int grade) {
		//super();
		setName(name);//this.name = name;
		setGrade(grade);//this.grade = grade;
	}
	public String getName() {//String name="aaa";
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override//재정의
	public String toString() {
		return "학생 [name=" + name + ", grade=" + grade + "]";
	}
	
}
