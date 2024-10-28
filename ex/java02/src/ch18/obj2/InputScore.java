package ch18.obj2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class InputScore {

    public static void main(String[] args) {
        try {
            //saveScore();
            selectAvg(new File("test.txt"));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void selectAvg(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            System.out.println("시험 점수 : " + line);
            String[] scoreStrings = line.split(",");
            int sum = 0;
            int cnt = 0;
            for (String scoreStr : scoreStrings) {
                sum += Integer.parseInt(scoreStr.trim());
                cnt++;
            }
            double average = (double) sum / scoreStrings.length;
            System.out.println("점수 평균 : " + average);
            System.out.println("시험 본 사람 : " + cnt);
        }
        catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }

    private static void saveScore() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        System.out.println("10개의 점수를 입력하세요 (숫자만 입력):");
        int count = 0;
        while (count < 10) {
            System.out.print((count + 1) + "번째 점수: ");
            if (scanner.hasNextInt()) {
                int score = scanner.nextInt();
                scores.add(score);
                count++;
            }
            else {
                System.out.println("문자열은 입력하지 마세요!");
                scanner.next(); // 잘못된 입력을 제거
            }
        }
        scanner.close();

        // 파일에 점수 저장
        try (FileWriter writer = new FileWriter("test.txt")) {
            for (int i = 0; i < scores.size(); i++) {
                writer.write(String.valueOf(scores.get(i)));
                if (i < scores.size() - 1) {
                    writer.write(","); // 마지막 항목이 아닌 경우에만 쉼표 추가
                }
            }
            System.out.println("점수가 test.txt 파일에 저장되었습니다.");
        }
        catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다: " + e.getMessage());
        }
    }


}
