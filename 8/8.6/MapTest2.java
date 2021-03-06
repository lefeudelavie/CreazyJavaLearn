import java.util.*;

public class MapTest2
{
	 public static void main(String[] args)
	 {
		 Map map = new HashMap();
		 map.put("Asmb Language", 1940);
		 map.put("Fortran Language", 1950);
		 map.put("Ada Language", 1960);
		 map.put("C language", 1970);
		 System.out.println("The original map is,");
		 System.out.println(map);
		 map.replace("XML Language",1990); 
		 System.out.println("");
		 System.out.println(map);
		 System.out.println("");
		 map.merge("Asmb Language", 8, (oldValue, newValue) -> (Integer)oldValue + (Integer)newValue);
		 System.out.println(map);
		 System.out.println("");
		 map.computeIfAbsent("Java", key -> ((String)key).length() );
		 System.out.println(map);
		 map.computeIfPresent("Java", (key,value) -> ((String)key).length() + (Integer)value );
		 System.out.println("");
		 System.out.println(map);
		 
	 }
}
