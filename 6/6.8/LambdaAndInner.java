@FunctionalInterface
interface Displable
{
	void display();
	default int add(int a , int b)
	{
		return a + b;
	}
}

public class LambdaAndInner
{
	String cV = "普通成员变量";
	static String sV = "静态类变量";
	public void test()
	{
		String book = "我要学java!";
		Displable dp = ()  -> {
			System.out.println("普通类变量：" + cV);
			System.out.println("静态类变量:" + sV);
			System.out.println("局部变量:" + book);

		};
		dp.display();
		System.out.println("dp.add 3, 4 is:" + dp.add(3, 4));

	}

	public static void main(String[] args)
	{
		LambdaAndInner lambda = new LambdaAndInner();
		lambda.test();
	}
}

