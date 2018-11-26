class Name
{
	private String firstName;
	private String lastName;

	public Name()
	{

	}

	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
}


public class Person
{
	private Name name;	
	public Person() {};

	public Person(Name name)
	{
		this.name = new Name(name.getFirstName(), name.getLastName());
	}

	public Name getName()
	{
		return new Name(name.getFirstName(), name.getLastName());
	}

	public String toString()
	{
		return name.getFirstName() + " " + name.getLastName();
	}

	public static void main(String[] args)
	{
		Name n = new Name("Colinton", "Bill");
		Person p = new Person(n); 
		System.out.println(p);

		n.setLastName("Harraly");
		System.out.println(p);

	}
}