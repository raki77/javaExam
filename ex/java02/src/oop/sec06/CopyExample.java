package oop.sec06;

import java.io.*;

public class CopyExample {

    public static void main(String[] args) {
        
        // 복사할 원본 파일 경로
        String originalFileName = "c:/sampleCode/000000_1.jpg";
        // 복사된 파일이 저장될 대상 파일 경로
        String targetFileName = "c:/sampleCode/000000_2.jpg";
        
        try {
            // 원본 파일을 읽기 위한 InputStream 생성 (파일의 내용을 바이트 단위로 읽음)
            InputStream is = new FileInputStream(originalFileName);
            // 대상 파일에 데이터를 쓰기 위한 OutputStream 생성 (파일의 내용을 바이트 단위로 씀)
            OutputStream os = new FileOutputStream(targetFileName);
            
            // 파일 데이터를 임시 저장할 바이트 배열 (1KB씩 읽어들임)
            byte[] data = new byte[1024];
            
            // 파일의 데이터를 끝까지 읽어 복사하는 루프
            while (true) {
                // 입력 스트림에서 바이트 데이터를 읽어들임 (최대 1024바이트)
                int num = is.read(data);
                
                // 파일 끝에 도달하면 read() 메서드가 -1을 반환하므로 반복을 종료
                if (num == -1) break;
                
                // 읽어들인 데이터를 출력 스트림에 씀 (0부터 num 바이트까지)
                os.write(data, 0, num);
            }
            
            // 출력 스트림에 남아있는 데이터를 비워(flush) 파일에 완전히 기록
            os.flush();
            
            // 사용이 끝난 스트림들을 닫아줌 (자원 해제)
            os.close();
            is.close();
        } 
        catch (FileNotFoundException e) {
            // 파일이 존재하지 않거나 경로가 잘못된 경우 발생하는 예외 처리
            e.printStackTrace();
        } 
        catch (IOException e) {        
            // 입출력 중 발생할 수 있는 예외 처리
            e.printStackTrace();
        }
        catch (Exception e) {        
            // 그 외 다른 모든 예외 처리
            e.printStackTrace();
        }
    }

}
