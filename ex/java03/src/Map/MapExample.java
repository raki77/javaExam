package Map;


import java.util.HashMap;
import java.util.Map;


public class MapExample {
	
    public static void main(String[] args) {
        // HashMap 객체 생성 (Map 인터페이스 사용)
        Map<String, Integer> map = new HashMap<>();

        // 값 추가 (put 메서드 사용)
        map.put("사과", 3);
        map.put("바나나", 5);
        map.put("오렌지", 2);

        // 값 출력
        System.out.println("전체 맵: " + map);

        // 특정 키의 값 가져오기
        int appleCount = map.get("사과");
        System.out.println("사과의 개수: " + appleCount);

        // 키가 존재하는지 확인
        if (map.containsKey("바나나")) {
            System.out.println("바나나는 맵에 있습니다.");
        }

        // 모든 키와 값 출력
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("과일: " + entry.getKey() + ", 개수: " + entry.getValue());
        }

        // 특정 키에 해당하는 값 삭제
        map.remove("오렌지");
        System.out.println("오렌지 삭제 후 맵: " + map);

        // 맵의 크기 확인
        System.out.println("맵의 크기: " + map.size());

        // 맵 비우기
        map.clear();
        System.out.println("맵을 비운 후: " + map);
    }
    
}
