package oop.poly2;

public class EmpTest {
	
	public static void main(String[] args) {
//		Account a1 = new Account("JAVA", "대표이사");
//		Research r1 = new Research("JAVA2", "총괄CEO");
		Employee a1 = new Account("JAVA", "대표이사");
		Employee r1 = new Research("JAVA2", "대표이사", "총괄CEO");
		a1.getEmpInfo(a1);
		r1.getEmpInfo(r1);
	}
}
