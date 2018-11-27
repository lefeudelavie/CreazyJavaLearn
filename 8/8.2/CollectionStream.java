import java.util.*;
import java.util.stream.*;

public class CollectionStream
{
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("Java 101");
		books.add("C language 101");
		books.add("Kotlin 101");
		books.add("Spring 101");
		System.out.println(books.stream().filter(ele -> ((String)ele).length() > 7).count());
		System.out.println(books.stream().filter(ele -> ((String)ele).contains("Java")).count());
		books.stream().mapToInt(ele -> ((String)ele).length() ).forEach(System.out::println);
	}
}
