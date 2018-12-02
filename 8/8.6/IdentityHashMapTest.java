import java.util.*;

public class IdentityHashMapTest
{
	 public static void main(String[] args)
	 {
		 IdentityHashMap ihm = new IdentityHashMap();
		 ihm.put(new String("Java 101"), "95");
		 ihm.put(new String("Java 101"), "96");
		 ihm.put("Java", "99");
		 ihm.put("Java", "99");
		 System.out.println(ihm);
	 }
}
