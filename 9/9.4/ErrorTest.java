import java.util.*;

public class ErrorTest
{
     static <T> void fromCollToColl(Collection<T> from, Collection<T> to)
     {
	  for (T ele: from)
	  {
	       to.add(ele);
	  }
     }

     public static void main(String[] args)
     {
	 List<Object> as = new ArrayList<>();
	 List<String> ao = new ArrayList<>();
	 fromCollToColl(ao, as);
     }
}
