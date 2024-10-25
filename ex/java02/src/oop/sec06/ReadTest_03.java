package oop.sec06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadTest_03 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/sampleCode/requirements.txt");
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				
				for(int i=0; i<num ; i++) {
					System.out.print((char)data[i]);
				}
			}
			is.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
