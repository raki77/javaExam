package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap();
		m1.put(1, new Integer(100));
		m1.put("second", "Hello, World");
		m1.put("third", new MyStudent());
		m1.put("fourth", null);
		
		Integer i = (Integer) m1.get(1);
		String str = (String) m1.get("second");
		System.out.println(i);
		System.out.println(str);
		
		MyStudent st = (MyStudent) m1.get("third");
		System.out.println( st );
		System.out.println( m1.get("third"));
		System.out.println( m1.get("fourth"));
		
	}

}
