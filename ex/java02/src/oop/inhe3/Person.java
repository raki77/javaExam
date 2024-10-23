package oop.inhe3;

public class Person {
    String gender;
    int age;

    public Person() {
       System.out.println("Person 생성자 메소드");
    }

    public Person(String _gender, int _age) {
        System.out.println("Person 생성자 메소드2");
        this.gender = _gender;
        this.age = _age;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
