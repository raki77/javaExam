// Map에 있는 각 원소는 사실 두 객체(키와 값)입니다.
// 값은 중복될 수 있지만 키는 중복될 수 없습니다.

import java.util.*;

public class TestMap {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  HashMap<String,Integer> scores = new HashMap<String,Integer>();
  
  scores.put("Kathy",42);
  scores.put("Bert",343);
  scores.put("Skyler",420);
  
  System.out.println(scores);
  System.out.println(scores.get("Bert"));
  
 }

}