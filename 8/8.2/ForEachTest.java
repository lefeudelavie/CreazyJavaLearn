import java.util.*;

public class ForEachTest
{
	public static void main(String[] args) 
	{
		Collection books = new HashSet();
		books.add("JAVA 101");
		books.add("Java script 101");
		books.add("Object C 101");
		books.add("Yahoo book");

		for (Object obj: books)
		{
			String book = (String)obj;
			System.out.println(book);
			if (book.equals("Object C 101"))
			{
				books.remove(obj);
			}
		}

		System.out.println(books);

	}	
}
