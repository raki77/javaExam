package ch18.obj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestsystemIn {

    public static void main(String[] args) {

        System.out.print("내용 입력:");
        try (BufferedReader br = new BufferedReader( new InputStreamReader(System.in))) { 
            String input = br.readLine();
            System.out.println("입력 내용: " + input);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
