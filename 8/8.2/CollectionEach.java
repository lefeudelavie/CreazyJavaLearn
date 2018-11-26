import java.util.*;

public class CollectionEach
{
	public static void main(String[] args) 
	{
		Collection books = new HashSet();
		books.add("Self 01");
		books.add("Java 101");
		books.add("Android 101");
		books.forEach(obj -> System.out.println("Collenction element:" + obj));
	}
}