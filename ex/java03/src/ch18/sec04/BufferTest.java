package ch18.sec04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferTest {

    public static void main(String[] args) {

        String originalFilePath1 = "c:/sampleCode/000000_1.jpg";
        String targetFilePath1 = "c:/sampleCode/000000_2.jpg";

        try {
            // 입출력 스트림 생성 (버퍼 미사용)
            FileInputStream fis = new FileInputStream(originalFilePath1);
            FileOutputStream fos = new FileOutputStream(targetFilePath1);

            // 입출력 스트림 + 버퍼 스트림 생성
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath1));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFilePath1));

            // 버퍼를 사용하지 않고 복사
            long nonBufferTime = copy(fis, fos);
            System.out.println("버퍼 미사용 : \t" + nonBufferTime + " ns");

            // 버퍼를 사용하여 복사
            long bufferTime = copy(bis, bos);
            System.out.println("버퍼 사용: \t" + bufferTime + " ns");

            fis.close();
            fos.close();
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long copy(FileInputStream fis, FileOutputStream fos) throws IOException {
        long start = System.nanoTime();  // 복사 시작 시간 측정
        byte[] buffer = new byte[1024];  // 바이트 배열
        int readBytes;

        while ((readBytes = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, readBytes);
        }

        fos.flush();
        long end = System.nanoTime();  // 복사 종료 시간 측정
        return end - start;
    }

    private static long copy(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        long start = System.nanoTime();  // 복사 시작 시간 측정
        byte[] buffer = new byte[1024];  // 바이트 배열
        int readBytes;

        while ((readBytes = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, readBytes);
        }

        bos.flush();
        long end = System.nanoTime();  // 복사 종료 시간 측정
        return end - start;
    }
}
