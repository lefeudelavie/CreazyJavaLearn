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


public class HashtableTest
{
     public static void main(String[] args)
     {
	 Hashtable ht = new Hashtable();
	 ht.put(new A(1101), "This is a program!");
	 ht.put(new A(1102), "Tomorrow will be better!");
	 ht.put(new A(1103), "Yesterday once more.");
	 ht.put(new A(1104), new B());

	 System.out.println(ht);

	 System.out.println(ht.containsKey(new A(1101)));
	 System.out.println(ht.containsValue("XXXXXX"));
	 ht.remove(new A(1103));
	 System.out.println(ht);
     }
}
