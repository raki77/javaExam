package oop.exception;

public class Exception_03 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		for(int i=0; i<array.length; i++) {
			try {
				int num = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] = " + num );	
			}
			catch(NumberFormatException e) {
				System.out.println("숫자 변환 발생 : " + e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("배열 첨자가 벗어남 : " + ae.getMessage());
			}
			finally {
				System.out.println("종료");
			}
		}
	}

}
