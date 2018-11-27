import java.util.*;

class A
{
	public boolean equals(Object o)
	{
		return true;
	}
}

class B
{
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	public int hashCode()
	{
		return 2;
	}

	public boolean equals(Object o)
	{
		return true;
	}
}

public class HashSetTest
{
	public static void main(String[] args) {
		HashSet books = new HashSet();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}