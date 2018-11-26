class CacheImmutable
{
	private static int MAXSIZE = 100;
	private static CacheImmutable[] cache = new CacheImmutable[MAXSIZE]; 
	private static int pos = 0;

	//private String name;
	private final String name;

	private CacheImmutable(String name)
	{
		this.name = name;
	}


	private String getName()
	{
		return name;
	}

	public static CacheImmutable valueOf(String name)
	{
		for (int i = 0; i < MAXSIZE; i++)
		{
			if (cache[i] != null && cache[i].getName().equals(name))
			{
				return cache[i];
			}
		}

		if (pos == MAXSIZE)
		{
			pos = 0;
			cache[pos++] = new CacheImmutable(name);
		}
		else
		{
			cache[pos++] = new CacheImmutable(name);
		}

		return cache[pos-1];
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == CacheImmutable.class )
		{
			CacheImmutable ci = (CacheImmutable) obj;
			/*if (this.getName().equals(ci.getName()))
			{
				return true;
			}*/
			return name.equals(ci.getName());
		}

		return false;
	}

	int hashCode()
	{
		return name.hashCode();
	}
}


public class CacheImmutableTest
{
	public static void main(String[] args)
	{
		CacheImmutable c1 = CacheImmutable.valueOf("Hello world.");
		CacheImmutable c2 = CacheImmutable.valueOf("Hello world.");
		System.out.println("Is c1 == c2:" + (c1 == c2));		
	}


}