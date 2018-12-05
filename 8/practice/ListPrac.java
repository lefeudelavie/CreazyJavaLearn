import java.util.*;

public class ListPrac
{
     public static void main(String[] args)
     {
	 List l = new ArrayList();
	 l.add(3);
	 l.add(5);
	 l.add("list test");
	 l.add(new String("New string"));
	 l.add(8);
	 l.add(-3);
	 l.add(7);
	 l.add(8);
	 l.add(-9);
	 l.add(10);
	 System.out.println(l);
	 System.out.println(l.get(5));
	 System.out.println(l.indexOf(7));
	 l.remove(3);
	 System.out.println(l);

     }
}
