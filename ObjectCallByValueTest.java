class Message{

  public String msg;
  public Message()       {}
  public Message(String msg)     { this.msg=msg; }
  public String getmessage()     { return msg; }
  public void setMessage(String msg)   { this.msg=msg; }
  public String toString()     { return (" c. 받은 메세지는"+msg+"입니다"); }

}

public class ObjectCallByValueTest {

  public static void main(String args[]) {

    Message msg = new Message(" 0. 안녕하세요..자바 객체입니다."); 
    System.out.println(" 1. 호출전의 메세지는 "+msg.toString());
    replyMessage(msg);
    System.out.println(" 2. 호출후의 메세지는 "+msg.toString());

  }
   
  static void replyMessage(Message msg) {

  System.out.println(" 3. 메소드안에서 호출전의 메세지는"+msg.toString());
  msg.setMessage(" 4. 반갑습니다");
  System.out.println(" 5. 메소드안에서 호출후의 메세지는"+msg.toString());

  }


}
