import java.util.*;

public class FixedListTest
{
     public static void main(String[] args)
     {
	 List fixedList = Arrays.asList("Java 101", "Ada 101", "Lisp 101");
	 System.out.println(fixedList.getClass());
	 fixedList.forEach(System.out::println);
	 // add or remove will throw exception 
	 fixedList.add("Test 101");
     }
}
