package ch18.obj2;

import java.io.*;
import java.util.Vector;

public class MemberObjInRead {
	
	public Vector<Member> getMemberData(String _path) throws FileNotFoundException, IOException {
		if("".equals(_path)) {
			throw new FileNotFoundException("File path's Not found");
		}
		File vfile = new File(_path);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(vfile));
        Vector<Member> members = new Vector<>();
        Member member;
        while (true) {
            try {
                member = (Member) ois.readObject();
                members.add(member); 
            } 
            catch (IOException | ClassNotFoundException e) {
                break; // 파일 끝에 도달하면 반복 종료
            }
        }
        System.out.println("파일에서 읽어온 회원 목록:");
        for (Member m : members) {
            System.out.println(m);
        }
        return members;
	}
 
}
