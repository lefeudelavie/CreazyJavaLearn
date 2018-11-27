import java.util.*;
import java.util.stream.*;

class R
{
	int count;
	public R(int count)
	{
		this.count = count;
	}

	public String toString()
	{
		return "R[" + count + "]";
	}

	public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (o != null && o.getClass() == R.class)
		{
			R r = (R)o;
			return this.count == r.count;
		}
		return false;
	}

	public int hashCode()
	{
		return this.count;
	}
}

public class HashSetTest2
{
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));

		System.out.println(hs);

		Iterator it = hs.iterator();
		R first = (R)it.next();

		first.count = -3;
		System.out.println("new R -3 equals first: " + (new R(-3)).equals(first));
		System.out.println(hs);

		hs.remove(new R(-3));
		System.out.println(hs);
		Iterator it2 = hs.iterator();
		R f2 = (R)it2.next();
		System.out.println("f2:" + f2);
		System.out.println("new R -3 equals f2: " + (new R(-3)).equals(f2));


		
		System.out.print("Hashcode:");
		hs.stream().forEach(ele -> System.out.print( ((R)ele).hashCode() + " " ));
		System.out.print("\n");
		System.out.println(new R(-3));
		System.out.println(new R(-3));
		System.out.println("hs 是否包含count 为-3的R对象？" + hs.contains(new R(-3)));
		System.out.println("hs 是否包含count 为-2的R对象？" + hs.contains(new R(-2)));

	}
}
