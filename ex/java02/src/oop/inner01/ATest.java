package oop.inner01;

public class ATest {

	public static void main(String[] args) {
		A a = new A();
		a.useB();	
		
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A.B.field2);
		A.B.method2();
	}

}
