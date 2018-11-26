import java.util.*;


public class IteratorTest
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("Programming in C");
		books.add("Think in C");
		books.add("Think in Java");
		books.add("Think in PHP");

		Iterator it = books.iterator();
		while (it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("Think in Java"))
			{
				it.remove();
			}

			book = "Test book";
		}

		System.out.println(books);
	}
}