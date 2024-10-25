package ch18.obj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fos = new FileOutputStream("c:/sampleCode/err.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member m1 = new Member("java", "mysql");
		Product p1 = new Product("노트북", 1500000);			
		int[] arr1 = {1,2,3};
		
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println(m1);
		System.out.println(p1);
		System.out.println(Arrays.toString(arr1));
		
		
		/////////////////////////////////////////////
		FileInputStream fis = new FileInputStream("c:/sampleCode/err.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 객체 복원
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close(); 
		fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
		
	}

}
