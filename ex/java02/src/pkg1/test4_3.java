package pkg1;

import java.util.Random;

//4-2
public class test4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int x = 0;
		int y = 0;
		while(true) {
			x = rand.nextInt(1, 6);
			y = rand.nextInt(1, 6);
			
			if (x==1 && y==4) {
				System.out.println("x=" + x + ", y=" + y);
				break;
			}
			else if(x==4 && y==1) {
				System.out.println("x=" + x + ", y=" + y);
				break;
			}
			else if(x==2 && y==3) {
				System.out.println("x=" + x + ", y=" + y);
				break;				
			}
			else if(x==3 && y==2) {
				System.out.println("x=" + x + ", y=" + y);
				break;
			}
			System.out.println("x=" + x + ", y=" + y);
		}
	}

}
