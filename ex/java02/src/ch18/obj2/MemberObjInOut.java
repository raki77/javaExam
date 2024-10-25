package ch18.obj2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Vector;

public class MemberObjInOut {

	public static void main(String[] args) throws IOException {
		
		List list = null;
		Member mem = null;
		String filePath = "c:/sampleCode/err2.txt";
		File vfile = new File(filePath);
		
		Vector<Member> v = null;		
		MemberObjInRead mr1 = new MemberObjInRead();
		
		try {
			v = mr1.getMemberData(filePath);
		} 
		catch (Exception e) {			
			v = new Vector<Member>();
		} 	
		
		while(true) {
			System.out.print("1.등록 2.출력 3.종료 = ");
			// 1 -> 49-48, 2 -> 50-48
			int x = System.in.read()-48;
			// 개행문자 포함 출력 : Enter값 
			System.in.read();	//System.in.read();
			
			if(x == 1) {
				// 인스턴스 List에 추가				
				mem = new Member();
				v.add(mem); // 파일 입,출력에 저장
			}
			else if(x == 2) {
				System.out.println("등록된 회원 목록:");
				Member m = null;
				for(int i =0 ; i < v.size(); i++) {
					m = v.elementAt(i);
					m.display();
					System.out.println(m);
				}
			} 
			else if(x == 3) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(vfile));
                Member m = null;
    			for(int i =0 ; i < v.size(); i++) {
    				m = v.elementAt(i);
    				m.display();
    				oos.writeObject(m); 
    				System.out.println(m);
    			}
				oos.close();
                System.out.println("회원 목록이 파일에 저장 되었습니다.");
				System.out.println("종료 !!!");
                System.exit(0);
			}
			else {
				System.out.println("메뉴 선택 오류");
			}
		}
	} 
}



