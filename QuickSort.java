//퀵 정렬 프로그램
import java.util.*;

public class QuickSort {
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int data[] = new int[20];
  Random rand = new Random(0);  
    
  for(int i=0;i<20;i++) data[i]=rand.nextInt()%50;
  System.out.println("before sort.");
  
  for(int i=0;i<20;i++) System.out.print(data[i]+" ");
  System.out.print("\n\n");
  
  my_quick_sort(data,0,20);
  
  System.out.println("After sort.");
  for(int i=0; i<20;i++) System.out.print(data[i]+" ");
  System.out.println();
    
 }

 private static void my_quick_sort(int[] data, int begin, int end) {
  // TODO Auto-generated method stub
  System.out.println("my_quick_sort(), begin=" + begin + ", end=" + end);
  
  // 첫 번째 항목의 적당한 위치를 찾는다.
  if(begin +1 >= end) return;
  int v_data = data[begin]; //축 값
  int tmp_data; //두 값을 바꿀 때 사용
  int i, j;
  
  while(true) {
    
   for(i=begin+1 ; i<end ; i++)
    if(data[i]>v_data) break;
   for(j=end-1; j>begin; j--)
    if(data[j]<v_data) break;
   
   if(i>=j) break;
   
   tmp_data = data[i];
   data[i] = data[j];
   data[j] = tmp_data;
  }
  tmp_data = data[j];
  data[j] = data[begin];
  data[begin] = tmp_data;
  
  my_quick_sort(data,begin,j);
  my_quick_sort(data,j+1,end);
 }
}