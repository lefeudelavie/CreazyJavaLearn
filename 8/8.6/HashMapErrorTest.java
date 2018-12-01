import java.util.*;

class A
{
    int count;
    public A(int count)
    {
	 this.count = count;
    }

    public boolean equals(Object obj)
    {
	 if (obj == this)
	     return true;
	 if (obj != null && obj.getClass() == A.class )
	 {
	      A a = (A) obj;
	      return a.count == count;
	 }

	 return false;
    }

    public int hashCode()
    {
	 return this.count;
    }
}

class B
{
    public boolean equals(Object obj)
    {
	 return true;
    }
}

public class HashMapErrorTest
{
    public static void main(String[] args)
    {

	 HashMap map = new HashMap();
	 map.put(new A(1000), "TestString 1");
	 map.put(new A(2000), "Book Test");
	 map.put(new A(3000), "Dance in the day");
	 System.out.println(map);

	 Iterator it = map.keySet().iterator();
	 A first = (A)it.next();
	 first.count = 1234;
	 System.out.println(map);

	 map.remove(new A(1000));
	 System.out.println(map);

	 System.out.println(map.get(new A(1234)));
	 System.out.println(map.get(new A(2000)));

    }
     

}
