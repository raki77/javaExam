package oop.second;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        while(true) {
            Menu.showMenu();
            int sel = ScanData.sc.nextInt();
            switch (sel) {
                //입력
                case 1:
                    service.inputData();
                    break;
                //검색
                case 2:
                    service.searchData();
                    break;
                //삭제
                case 3:
                    service.deleteData();
                    break;
                //종료
                case 4:
                    System.out.println("프로그램 종료!!!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
