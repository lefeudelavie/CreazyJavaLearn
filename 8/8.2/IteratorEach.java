import java.util.*;

public class IteratorEach
{
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("Java 101");
		books.add("C++ 101");
		books.add("PHP 101");

		Iterator it = books.iterator();
		it.forEachRemaining(obj -> System.out.println(obj));
	}
}