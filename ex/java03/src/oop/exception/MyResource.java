package oop.exception;

public class MyResource implements AutoCloseable {

	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource (" + name + ") 생성열기.");
	}
	
	@Override
	public void close() throws Exception {		
		System.out.println("MyResource (" + name + ") 닫기.");		
	}
	
	public String read1() {
		System.out.println("MyResource (" + name + ") 읽기1.");
		return "100";
	}
	
	public String read2() {
		System.out.println("MyResource (" + name + ") 읽기2.");
		return "abc";
	}

}
