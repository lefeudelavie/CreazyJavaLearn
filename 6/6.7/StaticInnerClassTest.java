public class StaticInnerClassTest
{
	private int prop1 = 5;
	private static int prop2 = 6;
	static class Inner
	{
		private static int prop3 = 7;
		public void test()
		{
			System.out.println("外部类的静态成员prop2 is:" + prop2);
		}
	}

	public void test()
	{

	}

	public static void main(String[] args)
	{
		new StaticInnerClassTest.Inner().test();
 	}

}