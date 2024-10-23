package oop.exception;

public class TryWithResourceExample {

	public static void main(String[] args) {		
		try { 
			MyResource res = new MyResource("A");
			String data = res.read1();
			int value = Integer.parseInt(data);
			System.out.println("value = " + value);
			System.out.println("--------------------------------");
			
			try(MyResource res2 = new MyResource("A")){
				String data2 = res.read2();
				int value2 = Integer.parseInt(data2);
				System.out.println("value2 = " + value2);	
			}
			catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
			
			System.out.println();
			
			MyResource res1 = new MyResource("A");
			MyResource res2 = new MyResource("B");
			try (res1; res2) {
				String data1 = res1.read1();
				String data2 = res2.read1();
			}
			catch(Exception e) {
				System.out.println("예외처리 : " + e.getMessage());
			}
			
			findClass();
		}
		catch(Exception e) {			
			System.out.println("예외 처리 : " + e.getMessage());
		} 
	}

	private static void findClass() throws ClassNotFoundException {		
		Class.forName("java.lang.String2");		
	}

}
