import java.util.*;

public class ListTest3
{
    public static void main(String[] args)
    {
	 ArrayList books = new ArrayList();
	 books.add("Java 1001");
	 books.add("Ruby 101");
	 books.add("Ada 101");
	 System.out.println(books);
	 books.sort( (o1, o2) -> ((String)o1).length() - ((String)o2).length());
	 System.out.println(books);
	 books.replaceAll( ele -> ((String)ele).length());
	 System.out.println(books);

    }

}
