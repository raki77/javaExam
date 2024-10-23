package oop.second;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		while(true) {
			Menu.showMenu();
			int sel=ScanData.sc.nextInt();
			switch (sel) {
			case 1: 
				
				break;
				
			case 4:
				System.out.println("프로그램 종료!!!!!");
				System.exit(0);
			}
			
		}//end while
	}
}
