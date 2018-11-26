public class IdentityHashCodeTest
{
	public static void main(String[] args)
	{
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println("s1.HashCode:" + s1.hashCode() +  "==" + "s1.HashCode:" + s2.hashCode());
		System.out.println("s1.IdHashCode:" + System.identityHashCode(s1) + "!=" + "s2.IdHashCode:" + System.identityHashCode(s2));

		String s3 = "Good";
		String s4 = "Good";

		System.out.println("s3.IdHashCode:" + System.identityHashCode(s3) + "==" + "s4.IdHashCode:" + System.identityHashCode(s4));
	}
}