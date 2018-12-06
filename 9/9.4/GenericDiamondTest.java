import java.util.*;

class MyClass<E>
{
     public <T> MyClass(T t)
     {
	  System.out.println("t 参数的值为:" + t);
     }
}


public class GenericDiamondTest
{
     public static void main(String[] args)
     {
	 MyClass<String> mc1 = new MyClass<>(35);
	 MyClass<String> mc2 = new <Integer> MyClass<String>(55);
	 MyClass<String> mc3 = new MyClass<>("Hello");
	 //MyClass<String> mc4 = new <String> MyClass<>("Hello");
	 //MyClass<String> mc4 = new <Integer> MyClass<>("Hello");
     }
}
