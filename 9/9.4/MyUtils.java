import java.util.*;

public class MyUtils
{
     public static <T> T copy(Collection<? super T> dest, Collection<T> src)
     {
	 T last = null;
	 for ( T ele: src)
	 {
	      last = ele;
	      dest.add(ele);
	 }
	 return last;

     }
     public static void main(String[] args)
     {
	 List<Number> ln = new ArrayList<>();
	 List<Integer> la = new ArrayList<>();
	 la.add(3);
         la.add(5);
	 la.add(6);
	 Integer last = copy(ln, la);
	 System.out.println("The last copy element:" + last);
     }
}
