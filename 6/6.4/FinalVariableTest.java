public class FinalVariableTest
{
	final int a;
	final String str;
	final char ch;
	final static double d;

	{
		str = "hello";
		a = 6;
	}

	static 
	{
		d = 4.5;
	}

	public FinalVariableTest()
	{
		// ch = 'A';
		str = "World";
	}

	public void test()
	{
		//a = 7;
		System.out.println("ch:" + ch);
	}


	public static void main(String[] args)
	{
		new FinalVariableTest();
	}

}
