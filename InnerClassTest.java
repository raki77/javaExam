class InnerClassTest {

    private int height;
    private int width;
   
    public InnerClassTest(int h,int w)
    {
      height = h;
      width = w; 
   }
   public Inner getInner()
   {
    return new Inner();
   }
  
  class Inner
  {
   private float rate = 0.5f;
  
   public float capacity()
   {
    return rate * height * width;
   } 
   
 }
}