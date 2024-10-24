package ch18.sec04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {

		try {
			Writer writer = new FileWriter("c:/sampleCode/err.txt");
			char a = 'A';
			char b = 'B';			
			char[] arr =  {'c','d','e'};
			
			writer.write(a);
			writer.write(b);
			writer.write(arr);
			writer.write("xyz");
			
			writer.flush();
			writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}

}
