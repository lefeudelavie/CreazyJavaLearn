import java.util.Arrays;

class Person
{
	private String name;
	public Person(String name)
	{
		this.name = name; 
	}

	public String getName()
	{
		return this.name;
	}

	public Person setName(String name)
	{
		this.name = name;
		return this;
	}
}


public class FinalReferenceTest
{
	public static void main(String[] args)
	{
		final int[] intArr;
		final Person p;

		intArr = new int[] {1,2,3,4,5};
		System.out.println("intArr is:" + Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println("sorted intArr is:" + Arrays.toString(intArr));

		p = new Person("Alex");
		System.out.println("p's name is:" + p.getName());
		System.out.println("p change name to:" + p.setName("Bob").getName());

		// intArr = null;
		// p = null;

	}
}

