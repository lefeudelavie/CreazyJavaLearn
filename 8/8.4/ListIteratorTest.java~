import java.util.*;

public class ListIteratorTest
{
     public static void main(String[] args)
     {
	 ArrayList books = new ArrayList();
	 books.add("Java 101");
	 books.add("Object 100");
	 books.add("Ada 101");
	 ListIterator lit = books.listIterator();
	 while (lit.hasNext())
	 {
	      System.out.println(lit.next());
	      lit.add("------------------");
	 }
	    
	 System.out.println("\n\n"); 

	 while (lit.hasPrevious())
	 {
	      System.out.println(lit.previous());
	 }
     }
}
