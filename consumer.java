// 스레드 동기화


import java.io.*;
import java.util.*;

public class consumer extends Thread
{
 protected Vector objects;

 public consumer() {
  objects = new Vector();
 }

 public void run() {
  try{
   while(true) {
    Object object = extract();
    System.out.println(object);
   }
  }catch(InterruptedException ignored) {
  }
 }

 protected Object extract() throws InterruptedException {
  synchronized (objects) {
   while(objects.isEmpty()) {
    objects.wait();
   }
   Object object = objects.firstElement();
   objects.removeElement(0);
   return object;
  }
 }

 public void insert(Object object) {
  synchronized(objects) {
   objects.addElement(object);
   objects.notify();
  }
 }

 public static void main(String[] args) throws IOException, InterruptedException
 {
  consumer con = new consumer();
  con.start();
  BufferedReader keyboard = new BufferedReader(new FileReader(FileDescriptor.in));
  System.out.println("Hello World!");
  String line;

  while((line=keyboard.readLine())!=null) {
   con.insert(line);
   Thread.sleep(1000);
  }

 }
}

