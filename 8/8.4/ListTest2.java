import java.util.*;

class A
{
     public boolean equals(Object obj)
     {
	  return true;
     }
}

public class ListTest2
{
     
    public static void main(String[] args)
    {
	ArrayList books = new ArrayList();
	books.add("Java 101");
	books.add("Add 101");
	books.add("Google lengend");
	System.out.println(books);
	books.remove(new A());
	System.out.println(books);
	books.remove(new A());
	System.out.println(books);

	
    }
}

