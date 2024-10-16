package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator02 {

	public static void main(String[] args) {
		// ArrayList 생성
        List<String> fruits = new ArrayList<String>();

        // 리스트에 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Iterator 객체 생성
        Iterator<String> iterator = fruits.iterator();

        // Iterator를 사용해 리스트 요소 순회
        System.out.println("Iterator를 사용한 리스트 순회:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // 요소 삭제 예시
        iterator = fruits.iterator();  // Iterator는 일회용이므로 새로 생성
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if ("Banana".equals(fruit)) {
                iterator.remove();  // "Banana" 항목 삭제
            }
        }

        // Iterator로 요소 삭제 후 리스트 출력
        System.out.println("\n'Banana' 삭제 후 리스트:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

	}

}
