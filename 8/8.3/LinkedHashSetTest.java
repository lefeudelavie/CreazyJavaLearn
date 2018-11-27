import java.util.*;


public class LinkedHashSetTest
{
	public static void main(String[] args) 
	{
		LinkedHashSet books = new LinkedHashSet();
		books.add("Java 101");
		books.add("Android 101");
		books.add("Swip 101");
		books.add("Go 101");
		System.out.println(books);
	}
}