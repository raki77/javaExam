// TreeSet원소는 반드시 Comparable이어야 한다.

// TereSet 사용하려면  집합에 들어가는 원소가 comparable을 구현하는 유형이어야한다.

// Comparator를 인자로 받아 들이는 Treeset 의 오버로드된 생성자를 사용


import java.util.*;

public class TestTree {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new TestTree().go();
 }
 
 public void go(){
  Book b1 = new Book("How Cats Work");
  Book b2 = new Book("Remix your Body");
  Book b3 = new Book("Finding Emo");
  
  TreeSet<Book> tree = new TreeSet<Book>();
  tree.add(b1);
  tree.add(b2);
  tree.add(b3);
  System.out.println(tree);
 }

}

class Book implements Comparable {
 private String title;
 public Book(String t){
  title = t;
 }
 public String getTitle(){
  return title;
 }
 public String toString(){
  return title;
 }
 public int compareTo(Object obj) {
  Book book = (Book)obj;
  return title.compareTo(book.getTitle());
 }
}