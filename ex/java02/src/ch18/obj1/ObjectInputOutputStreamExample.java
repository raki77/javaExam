package ch18.obj1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("c:/sampleCode/err.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Member m1 = new Member("fall", "단풍이");
			Product p1 = new Product("노트북", 1500000);			
			int[] arr1 = {1,2,3};
			
			oos.writeObject(m1);
			oos.writeObject(p1);
			oos.writeObject(arr1);
			
			oos.flush();
			oos.close();
			fos.close();			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
