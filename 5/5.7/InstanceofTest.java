public class InstanceofTest
{
	public static void main(String[] args)
	{
		Object hello = "This is a string";
		System.out.println("Is hello a instance of Object? " + (hello instanceof Object));

		System.out.println("Is hello a instance of String? " + (hello instanceof String));
		System.out.println("Is hello a instance of Math? " + (hello instanceof Math));
		System.out.println("Is hello a instance of Comparable? " + (hello instanceof Comparable));


	}
}