public class FormatTest {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);
        String s = String.format("[num: %,-2d]",num);
        System.out.println(s);
        System.out.println(String.format("%c %c %c",55,65,66));
        System.out.println(String.format("%c\n",num));
        
        String name = "foobar";
        float age = 16f;
        String info = String.format("name: %10.3s %6.4f",name,age);
        System.out.println(info);
    }
}