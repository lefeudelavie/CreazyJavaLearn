import java.util.*;

public class SortTest
{
	 public static void main(String[] args)
	 {
		 ArrayList num = new ArrayList();
		 num.add(5);
		 num.add(3);
		 num.add(7);
		 num.add(6);
		 System.out.println(num);
		 Collections.reverse(num);
		 System.out.println(num);
	     Collections.sort(num);
		 System.out.println(num);
		 Collections.shuffle(num);
		 System.out.println(num);
		 
	 }
}
