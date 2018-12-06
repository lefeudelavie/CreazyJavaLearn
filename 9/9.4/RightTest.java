import java.util.*;

public class RightTest
{
     static <T> void fromCollToColl(Collection<? extends T> from, Collection<T> to)
     {
	  for (T t: from)
	      to.add(t);
     }

     public static void main(String[] args)
     {
	  List<Object> on = new ArrayList<>();
	  List<String> sn = new ArrayList<>();
	  fromCollToColl(sn, on);

     }
}
