package oop.sec06;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c:/sampleCode/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			byte[] arr = {10 ,20, 30, 40, 50};
			
			os.write(arr, 1, 3);			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();			
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
