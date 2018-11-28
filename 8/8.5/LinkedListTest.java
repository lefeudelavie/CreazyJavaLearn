import java.util.*;

public class LinkedListTest
{
	 public static void main(String[] args)
	 {
		 LinkedList ll = new LinkedList();
		 ll.offer("Alex");
		 ll.offer("Bob");
		 ll.offer("Catalina");
		 System.out.println(ll);
		 ll.offerLast("Dick");
		 System.out.println(ll);
		 ll.offerFirst("Easbella");
		 System.out.println(ll);

	 }
}
