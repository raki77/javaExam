public class if_3
{
 public static void main(String[] args)
 {
  int num1=10, num2=20, num3=5, num4=100, num5=50;
  int max=-1, min=10000;

 

  max = num1 > max? num1:  max;
  max = num2 > max? num2:  max;
  max = num3 > max? num3:  max;
  max = num4 > max? num4:  max;
  max = num5 > max? num5:  max;

 

  min = num1 < min? num1:  min;
  min = num2 < min? num2:  min;
  min = num3 < min? num3:  min;
  min = num4 < min? num4:  min;
  min = num5 < min? num5:  min;

 

  System.out.println("max!"+max);
  System.out.println("min!"+min);


 }
}
