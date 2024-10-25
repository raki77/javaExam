package oop.inner01;

public class A {
	B b;
	static class B {
		int field1 = 1;
		static int field2 = 2;
		B() {
			System.out.println("생성자 메소드");
		}
		void method1() {
			System.out.println("method1 실행");
		}
		static void method2() {
			System.out.println("method2 실행");
		}
	}
	
	void useB() {
		b = new B();
		System.out.println(b.field1);
		b.method1();
	}
}
