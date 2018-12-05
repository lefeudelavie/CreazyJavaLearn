import java.util.*;

public class MapPrac
{
     public static void main(String[] args)
     {
	 HashMap map = new HashMap();
	 String[] inputStr = {"a", "b", "a", "b", "c", "a", "b", "c", "b"};
	 for (String str : inputStr)
	 {
	      map.computeIfAbsent(str, key->0);
	      map.computeIfPresent(str, (key, value) -> (Integer)value + 1);
	 }
	 System.out.println(map);
     }
}
