class EqualTest
{
	public static void main(String[] args)
	{
		float f = 5.0f;
		int i = 5;

		System.out.println("f是否等于i:" + (f == i));		

		int c1 = 65;
		char c2 = 'A';
		System.out.println("A是否和65相等：" + ( c1 == c2));

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println("s1是否和s2相等:" + (s1 == s2) );
		System.out.println("s1是否equals s2:" + s1.equals(s2));

		String s3 = "World";
		String s4 = "World";
		System.out.println("s3是否s4相等：" + (s3 == s4));
 	}

}