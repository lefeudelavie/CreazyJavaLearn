import java.util.*;

class Z implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}

	public boolean equals(Object obj)
	{
		return true;
	}

	public int compareTo(Object obj)
	{
		return 1;
	}
}

public class TreeSetTest2
{
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		Z z1 = new Z(2);
		t.add(z1);
		System.out.println(t.add(z1));
		System.out.println(t);
		((Z)(t.first())).age = 9;
		System.out.println( ((Z)(t.last())).age);
	}
}