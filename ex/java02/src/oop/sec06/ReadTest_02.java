package oop.sec06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadTest_02 {

    public static void main(String[] args) {

        try {
            // FileInputStream을 InputStreamReader로 감싸서 문자로 읽을 수 있게 함
            InputStream is = new FileInputStream("c:/sampleCode/requirements.txt");
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");  // 인코딩을 명시적으로 설정

            while (true) {
                int data = reader.read();  // 바이트가 아닌 문자 단위로 읽음
                // 파일 끝에 도달하면 -1을 반환하므로 반복을 종료
                if (data == -1) {
                    break;
                }
                // 읽어들인 문자를 출력
                System.out.print((char) data);  // 숫자를 문자로 변환하여 출력
            }
            // InputStream 및 Reader 사용 후 닫기
            reader.close();
            is.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
