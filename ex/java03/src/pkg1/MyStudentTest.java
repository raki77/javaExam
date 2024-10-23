package pkg1;

import java.util.ArrayList;
import java.util.List;

public class MyStudentTest {
	public static void main(String[] args) {
		List list = new ArrayList(); 
		list.add("hello");
		list.add(123);
		list.add(123.12);
		list.add(987F);
		list.add(new MyStudent());
		
		MyStudent st = (MyStudent)list.get(4);
		System.out.println(st);
		String str = (String)list.get(0);
		Integer num = (Integer)list.get(1);
		Float fNum = (Float)list.get(3);
		
		System.out.println(str + ", " + num + ", " + fNum);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
