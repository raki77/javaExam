package ch18.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderTest_06 {

	public static void main(String[] args) {

		Reader reader, r2 = null;
		
		try {
//			reader = new FileReader("c:/sampleCode/err.txt");
//			while(true) {				
//				int data = reader.read();
//				if(data == -1) break;
//				System.out.print((char)data);
//			}
//			reader.close();
//			System.out.println();
			
			r2 = new FileReader("c:/sampleCode/err.txt");
			char[] data = new char[100];
			while(true) {				
				int c2 = r2.read(data);
				if(c2 == -1) break; 
				for(int i=0; i<c2; i++) {
					System.out.println(data[i]);
				}
			} 
			r2.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
