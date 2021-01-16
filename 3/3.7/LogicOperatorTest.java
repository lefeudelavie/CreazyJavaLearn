public class LogicOperatorTest {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        System.out.println(a ^ b);
        System.out.println(a && b);
        System.out.println(a && c);

        int a1 = 5;
        int b1 = 10;
        System.out.println( a1 > 4 | b1++ > 10);
        System.out.println(b1);
        System.out.println( a1 > 4 || b1++ > 10);
        System.out.println(b1);

    }
}
