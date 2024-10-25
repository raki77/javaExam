package ch18.obj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;	
	private static transient BufferedReader in;  // 직렬화 제외 : transient
	
	static {
		in = new BufferedReader( new InputStreamReader( System.in ));
	}
	
	public Member() throws IOException {
		System.out.print("id=");
		id = in.readLine();
		System.out.print("name=");
		name = in.readLine();
	}
	/*
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}*/
	
	public String display() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	} 
	
}
