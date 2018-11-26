interface A
{
	void test();
}

public class ATest
{
	public static void main(String[] args)
	{
		int age = 23;
		A a = new A()
		{
			public void test()
			{
				System.out.println("age is:" + age);
			}
		};

		a.test();
	}
}