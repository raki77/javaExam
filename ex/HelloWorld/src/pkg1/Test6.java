package pkg1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6-16
		Printer printer = new Printer();
		printer .println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		// 6-17
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");
		
		// 6-18
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		}
		else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
		
		// 6-19
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance()); 
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		// 6-20
		Scanner scanner = new Scanner(System.in);
		String val = "";
		BankApplication ba = new BankApplication();		
		int index = 0 ;
		while(true) {
			
			System.out.println("===========================");
			System.out.println("1.계좌생성, 2.계좌목록, 3.예금, 4.출금, 5.종료");
			System.out.println("===========================");
			val = scanner.nextLine(); 
			
			if(val.equals("5")) {
				System.out.println("5.종료");
				break;
			}
			else if(val.equals("1")) {
				System.out.println("1.계좌생성");
				System.out.print("계좌번호:"); 
				String num1 = scanner.nextLine();
				System.out.print("계좌주:"); 
				String name1 = scanner.nextLine();
				System.out.print("입금액:"); 
				String deposit1 = scanner.nextLine();
				Account accountTmp = new Account();
				accountTmp.setAccNum(num1);
				accountTmp.setAccName(name1);
				accountTmp.setBalance(Integer.parseInt(deposit1));
				ba.setAccount(index, accountTmp);
				System.out.println("결과: 계좌가 생성 되었습니다.");	
				index++;
			}
			else if(val.equals("2")) {
				System.out.println("2.계좌목록");
				Account[] result = ba.getAccount();				
				for (Account acc2:result) {
					if(acc2 == null) {
						System.out.println("생성된 계좌가 없습니다.");
						break;
					}
					System.out.println("계좌번호:" + acc2.getAccNum());
					System.out.println("계좌주:" + acc2.getAccName());
					System.out.println("입금액:" + acc2.getBalance());
					System.out.println("---------------------------");
				}
			}
			else if(val.equals("3")) {
				System.out.println("3.예금");
			}
			else if(val.equals("4")) {
				System.out.println("4.출금");				
			}
		}
		System.out.println("exit");
		
		
	}

}


//6_13
class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id) {	
		this.name = name;
		this.id = id; 
	}	 
}

