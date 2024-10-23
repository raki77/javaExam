package pkg1;

public class loop01 {

	public static void main(String[] args) {
		
		boolean g_bFlag = true;
		int g_iSum = 0;
		int g_iCnt = 1;
		while(g_bFlag) {
			g_iSum += g_iCnt;
			if(g_iCnt == 5) {
				g_bFlag = false;
			}
			g_iCnt++;
		}
		System.out.println("SUM : " + g_iSum);
		System.out.printf("SUM : %d\n" , g_iSum);
		
	}

}
