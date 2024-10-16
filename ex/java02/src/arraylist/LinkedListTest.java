package arraylist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> fruitList = new LinkedList<String>();
		fruitList.add("사과");
		fruitList.add("바나나");
		fruitList.add("수박");
		// 추가
		fruitList.add(2, "망고");
		int position = fruitList.indexOf("수박");
		System.out.println("수박의 위치:" + position);
		
		fruitList.set(0, "오렌지");
//		fruitList.remove(1);
//		fruitList.remove("수박");
		
		fruitList.remove();
		int size = fruitList.size();
		System.out.println("size=" + size);
		
		for(int i=0; i< fruitList.size(); i++) {
			String str = fruitList.get(i);
			System.out.println(str);
		}
		
		
	}

}
