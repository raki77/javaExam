
//ReferenceTest.java 스트링과 스트링버퍼
public class ReferenceTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     String str = "Hello";
     StringBuffer sb= new StringBuffer("Hello");
     
     useString(str);
     System.out.println("String - after:[" + str + "]");
     
     useString(sb);  
     System.out.println("StringBuffer - after:[" + sb + "]");
    }
   
    private static void useString(String str) {
     // TODO Auto-generated method stub
     str = str + ",World!~";
     System.out.println("String - in:[" + str + "]");
    }
   
    private static void useString(StringBuffer sb) {
     // TODO Auto-generated method stub
     sb.append(",World!");
     System.out.println("StringBuffer - in:[" + sb + "]");
    }
   
   }