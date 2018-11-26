class StringCompareTest
{
	public static void main(String[] args)
	{
		String s0 = "HelloWorld";
		String s1 = "Hello";
		String s2 = "World";

		String s3 = "Hello" + "World";
		String s4 = "He" + "llo" + "Wo" +"rld";
		String ss1 = s1 + s2;
		String ss2 = new String("HelloWorld");


		System.out.println("s0 == s3 " + (s0 == s3));
		System.out.println("s0 == s4 " + (s0 == s4));
		System.out.println("s0 == ss1 " + (s0 == ss1));
		System.out.println("s0 == ss2 " + (s0 == ss2));
	}
}