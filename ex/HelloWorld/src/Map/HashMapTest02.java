package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("first", new Integer(100));
		map.put("second", "Hello, World");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		
		Set<String> set = map.keySet();
		Collection col = map.values();
		
		Object[] obj = set.toArray();
		System.out.println("키를 출력합니다.");
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}		
		System.out.println("\n키를 이용해서 값을 출력합니다.");
		for(int i=0; i<obj.length; i++) {
			String key = (String) obj[i];
			System.out.println(map.get(key));
		}
		System.out.println("\n값을 출력합니다.");
		obj=col.toArray();
		for(int i=0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		
	}

}
