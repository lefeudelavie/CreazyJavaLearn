import java.util.*;

class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count; 
	}	
	
	public int compareTo(Object obj)
	{
		R r = (R)obj;
	    return r.count < this.count ? 1 :
				r.count > this.count ? -1 : 0;	
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
		   return true;
		
		if (obj != null && obj.getClass() == R.class )
		{
			 R r = (R)obj;
			 return r.count == this.count;
		}	

		return false;
	}

	public String toString()
	{
		 return "R:[" + this.count + "]";
	}

}

public class TreeMapTest
{
	 public static void main(String[] args)
	 {
	 	TreeMap tm = new TreeMap();
		tm.put(new R(7), "Glory of the king");		
		tm.put(new R(-5), "Clash of the King");		
		tm.put(new R(5), "Game of the throne");		
		tm.put(new R(8), "The end of the time");		
		System.out.println(tm);

		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherKey(new R(5)));
		System.out.println(tm.lowerEntry(new R(7)));
		System.out.println(tm.subMap(new R(5), new R(8)));
		
	 }
}
