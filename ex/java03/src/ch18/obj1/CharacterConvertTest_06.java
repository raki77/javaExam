package ch18.obj1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class CharacterConvertTest_06 {

    public static void main(String[] args) {        
        write("문자 변환 스트림을 사용합니다.");
        String data = null;
		try {
			data = read();
			System.out.println(data);
		} 
		catch (Exception e) {			 
			e.printStackTrace();
		}       
    }

    private static String read() throws Exception { 
    	
    	InputStream is = new FileInputStream("c:/sampleCode/err.txt");
    	Reader reader = new InputStreamReader(is, "UTF-8");
    	char[] data = new char[100];
    	int num = reader.read(data);
    	reader.close();
    	String str = new String(data, 0, num);
		return str;
	}

	private static void write(String str) {
        try (OutputStream os = new FileOutputStream("c:/sampleCode/err.txt")) {
            // 문자열을 UTF-8 바이트 배열로 변환하여 출력
            // os.write(str.getBytes(StandardCharsets.UTF_8));
        	Writer writer = new OutputStreamWriter(os, "UTF-8");
        	writer.write(str);
        	writer.flush();
        	writer.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
