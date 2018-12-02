import java.util.*;

public class WeakHashMapTest
{
	 public static void main(String[] args)
	 {
		 WeakHashMap whm = new WeakHashMap();
		 whm.put(new String("Java Language"), new String("Good"));
		 whm.put(new String("Python Language"), new String("Excellent"));
		 whm.put(new String("Go Language"), new String("Intermidiary"));
		 
	     whm.put("JAVA", "Unbelievable");
		 System.out.println(whm);
		 System.gc();
		 System.runFinalization();
		 System.out.println(whm);
	 }
}
