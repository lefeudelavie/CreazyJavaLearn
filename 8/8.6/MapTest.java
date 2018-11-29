import java.util.*;

public class MapTest
{
	 public static void main(String[] args)
	 {
		 Map map = new HashMap();

		 map.put("Cloud computing", 99);
		 map.put("Wave attacks", 88);
		 map.put("Micro services", 77);
		 map.put("E commerce", 66);
		 System.out.println(map);
		 map.put("Wave attacks", 80);
		 System.out.println(map);
		 System.out.println(map.containsKey("Wave attacks"));
		 System.out.println(map.containsValue(77));

		 System.out.println("Now print out the values.");
		 for (Object obj: map.keySet())
		 {
			  System.out.println(map.get(obj));
		 }

		 map.remove("Micro services");
		 System.out.println("Now print the map which removed a key");
		 System.out.println(map);
	 }
}
