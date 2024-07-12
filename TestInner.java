
// innerClassTest 사용
class TestInner
{
  public static void main(String args[])
  {


   InnerClassTest ict = new InnerClassTest(100,100);
   InnerClassTest.Inner myInner = ict.getInner();


   //Inner myInner
   System.out.println("내부의 값:"+myInner.capacity());
   
  }
}