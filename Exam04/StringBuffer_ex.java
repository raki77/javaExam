public class StringBuffer_ex {

    public static void main(String[] args) {
     // TODO Auto-generated method stub
     StringBuffer sb = new StringBuffer();
     
     sb.append("남자가 아니다.");
     
     System.out.println(sb);
     
     sb = sb.replace(2,8,"이다.");
     System.out.println(sb);
    }
   }
   
   