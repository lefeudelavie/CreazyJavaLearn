import java.util.*;

public class TreeSetTest
{
	public static void main(String[] args) {
		TreeSet num = new TreeSet();
		num.add(5);
		num.add(2);
		num.add(10);
		num.add(-9);
		System.out.println(num.last());
		System.out.println(num.first());
		System.out.println(num.headSet(4));
		System.out.println(num.tailSet(4));
		System.out.println(num.subSet(4,10));
	}
}