public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		final int a = 2 + 6;
		final double b = 8.8 / 2.2;
		final String s1 = "Hello ";
		final String s2 = "World.";
		final String b1 = "Hello World." + 99.9;
		final String b2 = "Hello World." + String.valueOf(99.9);

		System.out.println(b1 == "Hello World.99.9"); 
		System.out.println(b2 == "Hello World.99.9"); 

		final String str = "Hello World.";
		final String testStr1 = "Hello" + " World.";
		final String testStr2 = "Hello " + s2;
		System.out.println(str == testStr1);
		System.out.println(str == testStr2);

	}
}