import java.util.*;
import java.util.function.*;


public class PredicateTest
{
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("C Programming language");
		books.add("C language");
		books.add("C++ language");
		books.add("Java 101");
		//books.removeIf( ele -> ((\(String)ele).length() > 10));
		System.out.println(books);

		System.out.println(calAll(books, ele -> ((String)ele).contains("language")));
		System.out.println(calAll(books, ele -> ((String)ele).length() > 10));
		System.out.println(calAll(books, ele -> ((String)ele).contains("C")));

	}

	public static int calAll(Collection c, Predicate p)
	{
		int total = 0;

		for (Object o : c)
		{
			if (p.test(o))
				total++;
		}

		return total;

	}
}