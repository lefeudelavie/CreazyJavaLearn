import java.util.*;


public class NullInHashMap
{
     public static void main(String[] args)
     {
	 HashMap map = new HashMap();
	 map.put(null, null);
	 map.put(null, null);
	 map.put("n", null);
	 System.out.println(map);

     }
}
